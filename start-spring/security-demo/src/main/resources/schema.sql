create table users
(
    id       int auto_increment primary key,
    username varchar(128)                    not null,
    password varchar(128)                    not null,
    role     varchar(32) default 'ROLE_USER' not null,
    enabled  boolean     default true        not null
);

insert into users(username, password, role)
values ('jumpy', '$2a$12$PyakYvD5sxr9n.5sw1Csn.CcNFO0raVf7vRl019PI22KBAR8jW6Du', 'ROLE_ADMIN');