create table roles (
    roles_id bigserial not null,
    roles_name character varying(512),    
    CONSTRAINT role_pkey PRIMARY KEY (roles_id)
);

insert into roles (roles_name) values ('admin');