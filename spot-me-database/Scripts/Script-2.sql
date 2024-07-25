CREATE TABLE t_bros(
name varchar(20),
cash SMALLINT CHECK(cash >= 0)
);

INSERT INTO t_bros(name, cash) VALUES ('mario', 2000),('Luigi',1000);

 select * FROM t_bros;

UPDATE t_bros SET cash = cash -500 WHERE name = 'Luigi';

UPDATE t_bros SET cash = cash + 500 WHERE name = 'Luigi';

COMMIT;

COMMIT;
 