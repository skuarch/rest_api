create table users (
    users_id bigserial not null,
    users_name character varying(512),
    users_last_name character varying(512),
    users_password character varying(512),
    users_email character varying(512),
    CONSTRAINT users_pkey PRIMARY KEY (users_id)
);

insert into users (users_name, users_last_name, users_password, users_email) values ('a', 'a', 'a', 'a@email.com');
insert into users (users_name, users_last_name, users_password, users_email) values ('b', 'b', 'b', 'b@email.com');
insert into users (users_name, users_last_name, users_password, users_email) values ('c', 'c', 'c', 'c@email.com');
insert into users (users_name, users_last_name, users_password, users_email) values ('d', 'd', 'd', 'd@email.com');