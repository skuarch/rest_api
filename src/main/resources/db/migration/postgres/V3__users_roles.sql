create table users_roles (
    users_id bigserial not null,
    roles_id bigserial not null    
);

insert into users_roles (users_id, roles_id) values (1,1);