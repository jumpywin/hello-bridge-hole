package org.example.r2dbc.repo;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BookRepositoryTest {

    @Resource
    private BookRepository bookRepository;

    @Test
    void getAll() {
        StepVerifier.create(bookRepository.getAll().log())
                .expectNextCount(6)
                .verifyComplete();
    }

    @Test
    void getOne() {
        StepVerifier.create(bookRepository.getOne("Deleting Code").log())
                .expectNextMatches(book -> book.getTitle().equals("Deleting Code"))
                .verifyComplete();
    }
}