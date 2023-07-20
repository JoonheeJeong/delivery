create table member (
    id bigint auto_increment,
    name varchar(32) not null,
    si_do varchar(32) not null,
    si_gun_gu varchar(32) not null,
    road varchar(64) not null,
    detail varchar(32) not null,
    primary key (id)
);