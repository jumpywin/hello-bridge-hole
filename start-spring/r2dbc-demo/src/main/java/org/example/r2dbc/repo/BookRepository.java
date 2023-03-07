package org.example.r2dbc.repo;

import jakarta.annotation.Resource;
import org.example.r2dbc.entity.Book;
import org.springframework.data.r2dbc.convert.MappingR2dbcConverter;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class BookRepository {
    @Resource
    private DatabaseClient databaseClient;

    @Resource
    private MappingR2dbcConverter converter;

    public Flux<Book> getAll() {
        return databaseClient.sql("select * from book")
                .map((row, rowMetadata) -> new Book(
                        row.get("id", Long.class),
                        row.get("title", String.class),
                        row.get("sub_title", String.class),
                        row.get("publisher", String.class)
                )).all();
    }

    public Mono<Book> getOne(String title) {
        return databaseClient.sql("select * from book where title = :title")
                .bind("title", title)
                .map((row, metadata) -> converter.read(Book.class, row, metadata))
                .one();
    }
}
