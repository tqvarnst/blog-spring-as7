DELETE FROM BLOG_POST;
DELETE FROM BLOG;

INSERT INTO BLOG(ID, VERSION, NAME) VALUES(1, 0, 'JBoss Blog');
INSERT INTO BLOG(ID, VERSION, NAME) VALUES(2, 0, 'OpenShift Blog');
INSERT INTO BLOG(ID, VERSION, NAME) VALUES(3, 0, 'Hibernate Blog');


INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(1, 0, CURRENT_TIMESTAMP, 'JBoss Title 1', 'JBoss Body 1');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(1, 0, CURRENT_TIMESTAMP, 'JBoss Title 2', 'JBoss Body 2');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(1, 0, CURRENT_TIMESTAMP, 'JBoss Title 3', 'JBoss Body 3');

INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(2, 0, CURRENT_TIMESTAMP, 'OpenShift Title 1', 'OpenShift Body 1');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(2, 0, CURRENT_TIMESTAMP, 'OpenShift Title 2', 'OpenShift Body 2');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(2, 0, CURRENT_TIMESTAMP, 'OpenShift Title 3', 'OpenShift Body 3');

INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(3, 0, CURRENT_TIMESTAMP, 'Hibernate Title 1', 'Hibernate Body 1');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(3, 0, CURRENT_TIMESTAMP, 'Hibernate Title 2', 'Hibernate Body 2');
INSERT INTO BLOG_POST(BLOG_ID, VERSION, CREATE_DATE, TITLE, BODY) VALUES(3, 0, CURRENT_TIMESTAMP, 'Hibernate Title 3', 'Hibernate Body 3');
