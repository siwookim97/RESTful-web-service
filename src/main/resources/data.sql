insert into user values(90001, sysdate(), 'name1', 'pass1', '111111-1111111');
insert into user values(90002, sysdate(), 'name2', 'pass2', '222222-2222222');
insert into user values(90003, sysdate(), 'name3', 'pass3', '333333-3333333');

insert into post values(10001, 'My first post', 90001);
insert into post values(10002, 'My second post', 90001);