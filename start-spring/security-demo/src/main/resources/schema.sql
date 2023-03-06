create table users
(
    account  number primary key,
    password varchar(128) not null ,
    name     varchar(128) not null
);

insert into users(account, password, name)
values (777777, '$2a$12$PyakYvD5sxr9n.5sw1Csn.CcNFO0raVf7vRl019PI22KBAR8jW6Du', 'Jumpy');