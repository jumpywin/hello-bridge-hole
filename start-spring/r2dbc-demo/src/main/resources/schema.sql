create table book
(
    id        bigint auto_increment primary key,
    title     varchar(64) not null,
    sub_title varchar(64) null,
    publisher varchar(64) not null
);

insert into book(title, sub_title, publisher)
values ('Hating Other People''s Code', 'Who the hell wrote this? Oh, I wrote this.', 'O''RLY');

insert into book(title, sub_title, publisher)
VALUES ('What the fuck is security', 'How to ignore it and deliver your project', 'O''RLY');

insert into book(title, sub_title, publisher)
values ('Developing in Production', 'Last in First Out', 'O''RLY');

insert into book (title, sub_title, publisher)
values ('Works on my machine', 'The Definitive Guide', 'O''RLY');

insert into book(title, sub_title, publisher)
VALUES ('Hating on Languages You Don''t Use', null, 'O''RLY');

insert into book(title, sub_title, publisher)
VALUES ('Deleting Code', 'Oh how good it feels', 'O''RLY');