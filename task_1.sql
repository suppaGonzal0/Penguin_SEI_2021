CREATE TABLE courses(id int PRIMARY KEY, name text, teacher_id);

INSERT INTO courses VALUES(1,'English Grammar',3);
INSERT INTO courses VALUES(2,'Mathematics',1);
INSERT INTO courses VALUES(3,'Physics',4);
INSERT INTO courses VALUES(4,'Chemistry',4);
INSERT INTO courses VALUES(5,'Biology',5);

CREATE TABLE teachers(id int PRIMARY KEY, name text);

INSERT INTO teachers VALUES(1,'Johanna Kabir');
INSERT INTO teachers VALUES(2,'Lara Gilbert');
INSERT INTO teachers VALUES(3,'John Smith');
INSERT INTO teachers VALUES(4,'Danniel Robertson');
INSERT INTO teachers VALUES(5,'Larry Cooper');

SELECT name FROM courses;
SELECT name FROM teachers;

SELECT * FROM teachers WHERE id = (SELECT teacher_id FROM courses GROUP BY teacher_id ORDER BY COUNT(*) DESC LIMIT 1);

SELECT * FROM teachers WHERE NOT EXISTS (SELECT teacher_id FROM courses WHERE courses.teacher_id = teachers.id);