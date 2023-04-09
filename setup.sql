CREATE TABLE persona_table (
    id SERIAL PRIMARY KEY NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    sex BOOLEAN,
    password VARCHAR(250) NOT NULL
);
