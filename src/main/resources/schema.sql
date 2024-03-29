DROP TABLE IF EXISTS employee CASCADE;
DROP TABLE IF EXISTS employee_role CASCADE;

CREATE TABLE IF NOT EXISTS employee
(
    employee_id         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY UNIQUE,
    first_name          VARCHAR(250)        NOT NULL,
    second_name         VARCHAR(250)        NOT NULL,
    surname             VARCHAR(250)        NOT NULL,
    date_of_birthday    DATE,
    email               VARCHAR(254) UNIQUE NOT NULL,
    phone_number        VARCHAR(15)         NOT NULL,
    picture_URL         VARCHAR(512),
    role_id             INTEGER             NOT NULL,
    employee_login      VARCHAR(32)        NOT NULL,
    employee_password   VARCHAR(32)        NOT NULL
    );

CREATE TABLE IF NOT EXISTS employee_role
(
    role_id             BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY UNIQUE,
    role_name           VARCHAR(250)        NOT NULL
    );