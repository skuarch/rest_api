create table users (
    users_id bigserial not null,
    users_name character varying(512),
    users_last_name character varying(512),
    users_password character varying(512),
    users_email character varying(512),
    users_is_active boolean,
    CONSTRAINT users_pkey PRIMARY KEY (users_id)
);

insert into users (users_name, users_last_name, users_password, users_email, users_is_active) values ('a', 'a', 'a', 'a@email.com', true);
insert into users (users_name, users_last_name, users_password, users_email, users_is_active) values ('b', 'b', 'b', 'b@email.com', true);
insert into users (users_name, users_last_name, users_password, users_email, users_is_active) values ('c', 'c', 'c', 'c@email.com', true);
insert into users (users_name, users_last_name, users_password, users_email, users_is_active) values ('d', 'd', 'd', 'd@email.com', true);