CREATE TABLE hibernate_lectures.message
(
  id   INTEGER                    NOT NULL,
  text CHARACTER VARYING(2000) [] NOT NULL,
  CONSTRAINT message_pkey PRIMARY KEY (id)
);

INSERT INTO hibernate_lectures.message (id, text)
VALUES (1, 'Hello, Hibernate!');


