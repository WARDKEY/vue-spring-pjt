CREATE TABLE ENCORE_WORK_TBL(
    ID INT AUTO_INCREMENT,
    SUBJECT VARCHAR(50),
    CONTENT VARCHAR(1000),
    COMPLETED TINYINT(1),
    PRIMARY KEY (ID)
);

INSERT INTO ENCORE_WORK_TBL(SUBJECT, CONTENT, COMPLETED)
VALUES ('devops', 'devops', 0);

INSERT INTO ENCORE_WORK_TBL(SUBJECT, CONTENT, COMPLETED)
VALUES ('encore', 'encore', 0);