 drop database if exists project;
 create database project;
 
 use project;
 
 create table Company(
   Address varchar(100),
    Phone varchar(12),
    website varchar(70));
    
 insert into company values ('12 Seolleung-ro 103-gil, Yeoksam 1(il)-dong Gangnam-gu, Seoul, South Korea', '02.2051.3878', 'http://www.blockberrycreative.com/');
    
    
create table Contract(
		cont_Id int primary key,
        des_Con varchar(100),
        fees int);
    
create table Employee(
	Emp_Id int primary key,
    Emp_Name varchar(15),
    salary double,
    Emp_status varchar(15),
    Contract_Id int,
    foreign key (Contract_Id) references contract (cont_Id));
    
    create table Project(
		Project_Id int primary key,
        Proj_name varChar(40),
        Proj_type varChar(40),
        profits int);
        
	create table Album_Dist(
		Dist_Id int,
        Comp_Name varchar(20),
        address varchar(100),
        phone varchar(15),
        primary key(Dist_Id));
        
        insert into Album_Dist values (000, 'Hanteo Chart', 'Itaewon, Seoul, South Korea','02.449.2347');
       -- insert into Album_Dist values (001, '주식회사 카카오엠', '서울시 강남구 테헤란로 103길 17 (삼성동, 정석빌딩)','02.449.2347');
       insert into Album_Dist values (001, 'Kakao M', 'Gangnam, Seoul, South Korea','02.129.0981');
        
	create table Album(
		Album_Id int,
        Title varchar(20),
        Dist_Id int,
        primary key (Album_Id),
        foreign key(Dist_Id) references Album_Dist (Dist_Id)
	);
        
        
	create table trackList(
		Id int primary key,
        Track varChar(20),
        Album_Id int,
        foreign key(Album_Id) references Album(Album_Id)
        );

	create table Idols(
		Idol_Id int,
		Group_Id int,
        Sub_Id int,
        Idol_Name varchar(20),
        primary key(Idol_Id));
			
		INSERT INTO Idols VALUES(000, 000,001,'HeeJin');
		INSERT INTO Idols VALUES(001, 000,001, 'HyunJin');
		INSERT INTO Idols VALUES(002, 000, 001, '조하슬');  
		INSERT INTO Idols VALUES(003, 000,001, 'YeoJin');  
		INSERT INTO Idols VALUES(004, 000,001,'ViVi');  
		INSERT INTO Idols VALUES(005, 000,002,'KimLip');  
		INSERT INTO Idols VALUES(006, 000,002,'JinSoul');  
		INSERT INTO Idols VALUES(007, 000,002,'Choerry');  
		INSERT INTO Idols VALUES(008, 000,003,'Yves');  
		INSERT INTO Idols VALUES(009, 000,003,'Chuu');  
		INSERT INTO Idols VALUES(010, 000,003, 'GoWon');  
		INSERT INTO Idols VALUES(011, 000,003,'Olivia Hye');  

	create table Group_Mus(
		MusicGroup_Id int,
		Group_name varchar(20),
        Groupmember_Id int,
        primary key(MusicGroup_Id)
        );
        
        insert into Group_mus values(000, 'Loona' ,000);
		insert into Group_mus values (001, 'Loona 1/3',001);
        insert into Group_mus values(002, 'ODD Eye Cirlce',002);
        insert into Group_mus values(003, 'yyxy',003);
    
	create table payment(
		Pay_Id int,
		Idol_Id int,
        Payment double,
        job varchar(20),
        dates varchar(20),
        primary key(Pay_Id),
        foreign key(Idol_Id) references Idols (Idol_Id));
        
	create table Album_Week(
		WeekId int,
		Album_Id int,
		charts varchar(20),
        weeks varchar(20),
        sales int,
        primary key(WeekId));
        
        insert into Album_Week value (000,000,'Hanteo Chart', '10.29.2018',220);
        insert into Album_Week value (001,001,'Hanteo Chart', '10.06.2018',260);
		insert into Album_Week value (002,002,'Hanteo Chart', '10.29.2018',490);
        insert into Album_Week value (003,003,'Hanteo Chart', '10.06.2018',140);
		insert into Album_Week value (004,000,'Hanteo Chart', '11.06.2018',250);
        insert into Album_Week value (005,001,'Hanteo Chart', '11.13.2018',20);
		insert into Album_Week value (006,000,'Hanteo Chart', '11.13.2018',900);
        insert into Album_Week value (007,001,'Hanteo Chart', '12.06.2018',600);
		insert into Album_Week value (008,000,'Hanteo Chart', '12.29.2018',500);
        insert into Album_Week value (009,001,'Hanteo Chart', '10.06.2018',400);
        
	create table Album_Total(
		Album_Id int,
		charts varchar(20),
        sales int,
        primary key(Album_Id));
        
	insert into Album_Total value (000,'Hanteo Chart', 2000);
    insert into Album_Total value (001,'Hanteo Chart', 3000); 
	insert into Album_Total value (002,'Hanteo Chart', 4000);
    insert into Album_Total value (003,'Hanteo Chart', 5000);    
	
	insert into Contract value (1,'1 year contract and must be fulfilled to end date',2000);
    insert into Contract value (2,'2 year contract and must be fulfilled to end date',4000);
	insert into Contract value (3,'3 year contract and must be fulfilled to end date',6000);
    insert into Contract value (4,'4 year contract and must be fulfilled to end date',8000);
    insert into Contract value (5,'5 year contract and must be fulfilled to end date',8000);
    insert into Contract value (6,'6 year contract and must be fulfilled to end date',8000);
	insert into Contract value (7,'7 year contract and must be fulfilled to end date',8000);
    insert into Contract value (8,'8 year contract and must be fulfilled to end date',10000);
	insert into Contract value (9,'9 year contract and must be fulfilled to end date',12000);
	insert into Contract value (10,'At Will Employment',0);

	INSERT INTO Employee VALUES(000, 'Choi Ji Woo', 48000, 'Active', 01);
    INSERT INTO Employee VALUES(001, 'Park Min Soo', 60000, 'Active', 01);
    INSERT INTO Employee VALUES(002, 'Ji Min Park', 78000, 'Active', 01);
	INSERT INTO Employee VALUES(003, 'Yeong Jae Park', 78000, 'Fired', 01);
	INSERT INTO Employee VALUES(004, 'Ji Woo Seo', 40000, 'Active', 01);
    INSERT INTO Employee VALUES(005, 'Ha Min Kim', 53230, 'Active', 03);
	INSERT INTO Employee VALUES(006, 'Ha Yoon Park', 78040, 'Fired', 02);
	INSERT INTO Employee VALUES(007, 'Yoon Jung lee', 72000, 'Fired', 01);
	INSERT INTO Employee VALUES(008, 'Ji Ah Park', 78040, 'Fired', 02);
	INSERT INTO Employee VALUES(009, 'Ji Yoo Moon', 72300, 'Fired', 03);

	INSERT INTO Project VALUES(000, 'Studio Hertz YYXY', 'Concert', 2300);
	INSERT INTO Project VALUES(001, 'Studio Hertz ODD EYE Circle', 'Concert', 4910);    
    INSERT INTO Project VALUES(002, 'Studio Hertz 1/3', 'Concert', 5910);    
    INSERT INTO Project VALUES(003, 'Sangnam S-Plex Center', 'Fansign', 1010);    
    INSERT INTO Project VALUES(004, 'In To The Orbit', 'Concert', 5910);    
    INSERT INTO Project VALUES(005, 'LOONAbirth', 'Concert, Olympic Hall', 9910);  
    INSERT INTO Project VALUES(006, 'LOOΠΔVERSE', 'Concert, Olympic Hall', 5910);  
	INSERT INTO Project VALUES(007, 'YangCheon Fansign', 'Fansign', 910);  
	INSERT INTO Project VALUES(008, 'JCC Art Hall Fansign', 'Fansign', 1913);  
    INSERT INTO Project VALUES(009, 'K-Con', 'Concert, Los Angeles', 5910);
    
    INSERT INTO Album VALUES(000,'+ +',000);
	INSERT INTO Album VALUES(001,'✕ ✕',001);
	INSERT INTO Album VALUES(002,'Long & live',001);
	INSERT INTO Album VALUES(003,'Mix & Match',000);
	INSERT INTO Album VALUES(004,'Beauty & the Beat',001);
	INSERT INTO Album VALUES(005,'Love&Evil',000);
    INSERT INTO Album VALUES(006,'Max & Match',001);
	
	insert into trackList values (000,'+ +',000);
	insert into trackList values (001,'Hi High',000);
	insert into trackList values (002,'Favorite',000);
	insert into trackList values (003,'열기(9)',000);
	insert into trackList values (004,'Perfect Love',000);
	insert into trackList values (005,'Stylish',000);
	
    insert into trackList values (006,'✕ ✕',001);
	insert into trackList values (007,'Butterfly',001);
	insert into trackList values (008,'Curiosity',001);
	insert into trackList values (009,'Colours (색깔)',001);
	insert into trackList values (010,'Where You At',001);
	insert into trackList values (011,'Stylish',001);
	insert into trackList values (012,'Perfect Love',001);
	insert into trackList values (013,'열기(9)',001);
	insert into trackList values (014,'favOriTe',001);
	insert into trackList values (015,'Hi High',001);
	insert into trackList values (016,'+ +',001);
    
	insert into trackList values (017,'Long & Live',002);
	insert into trackList values (018,'Into the New Heart',002);
	insert into trackList values (019,'You and Me Together',002);
	insert into trackList values (020,'Fairy Tale',002);
	insert into trackList values (021,'Valentine Girl',002);
	
    insert into trackList values (022,'Odd',003);
    insert into trackList values (023,'Girl Front',003);
    insert into trackList values (024,'Loonatic',003);
    insert into trackList values (025,'Chaotic',003);
    insert into trackList values (026,'Starlight',003);
    
    insert into trackList values (027,'Del Segno',004);
    insert into trackList values (028,'Love4eva',004);
	insert into trackList values (029,'Frozen',004);
    insert into trackList values (030,'One Way',004);   
	insert into trackList values (031,'Rendezvous 18.6y',004);
  
	insert into trackList values (032,'Love & Evil',005);
    insert into trackList values (033,'Sonatine',005);
    insert into trackList values (034,'Rain 51db',005);
    insert into trackList values (035,'Long & Live',005);
    insert into trackList values (036,'You & Me Together',005);
    insert into trackList values (037,'Faiy Tale',005);
    insert into trackList values (038,'Valentine Girl',005);
    
    insert into trackList values (039,'Add',006);
    insert into trackList values (040,'Sweet Crazy Love',006);
    insert into trackList values (041,'Uncover',006);
    insert into trackList values (042,'Girl Front',006);
    insert into trackList values (043,'Loonatic',006);
    insert into trackList values (044,'Chaotic',006);
    insert into trackList values (045,'Starlight',006);
    insert into trackList values (046,'Odd Front',006);
    
	insert into payment value(000,000, 200, 'Commerical Film', ' 10.11.2018');
	insert into payment value(001,000, 300, 'Commerical Film', ' 10.12.2018');
	insert into payment value(002,001, 200, 'Commerical Film', ' 10.11.2017');
	insert into payment value(003,002, 3000, 'Commerical Film', ' 11.12.2018');
	insert into payment value(004,003, 300, 'Commerical Film', ' 10.12.2018');
	insert into payment value(005,004, 200, 'Commerical Film', ' 10.11.2017');
	insert into payment value(006,005, 3000, 'Commerical Film', ' 11.12.2018');
	insert into payment value(007,006, 300, 'Commerical Film', ' 10.12.2018');
	insert into payment value(008,007, 200, 'Commerical Film', ' 10.11.2017');
	insert into payment value(009,008, 3000, 'Commerical Film', ' 11.12.2018');
	insert into payment value(010,009, 3000, 'Commerical Film', ' 11.12.2018');   
    insert into payment value(011,010, 3000, 'Commerical Film', ' 11.12.2018');
	insert into payment value(012,011, 3000, 'Commerical Film', ' 11.12.2018');   
    
    select *
    from Idols;
    
    
    select Idols.Idol_name, sum(payment)
    from Idols, Payment
    where Idols.Idol_Id = Payment.Idol_Id and Payment.Idol_Id = 000;
    
    select Idols.Idol_name
    from Idols, group_mus
    where group_mus.GroupMember_Id = 003 and group_mus.GroupMember_Id = Idols.sub_Id; 
    
    select sum(Project.profits)
    from project;
    
    select *
    from employee
    order by contract_id;
    
	select contract_id
    from employee
    group by contract_id
	order by contract_id;
    
    Create View Distributors As
    select *
    from album_dist;
    show full tables;
    SELECT * FROM distributors;
    
    select avg(Project.profits)
    from project;
    
    select *
    from album
    order by title;
    
	select Distinct tracklist.track  
    from tracklist
    order by track;
    

    select Album.title
    from album, album_total
    where album.album_id = album_total.album_Id and album_total.sales > 3000;
    

	select * 
    from Album, Album_Dist
    where Album.Dist_Id = Album_Dist.Dist_Id and Album.Album_Id = 1;
    
    create table dog_Trainer(
		Trainer_ID int Primary Key,
        name_f varchar(20),
        name_l varchar(20),
        date_of_birth varchar(20),
        age int,
        style varchar(20));
    
    create table Dog(
		Dog_ID int primary key,
        name_Dog varchar(20),
        date_of_birth varchar(20),
        age int,
        price int,
        type_Dog varchar(20),
        Trainer_ID int,
        foreign key(trainer_ID) references dog_Trainer(Trainer_ID));
        
        insert into dog_trainer values (001,"Anthony", "Nguyen", "13.11.1995","nice");
        insert into dog_trainer values (002,"Savana", "Nguyen", "19.5.2007","mean");
        insert into Dog values (001,"dog1","01.01.2010",10,200,"good dog");
		insert into Dog values (002,"dog2","02.02.2020",10,200,"good dog");       
        
        select Dog.name_Dog
        from dog_Trainer, Dog
        where name_f = "John" and name_l = "Smith" and dog.Trainer_ID = dog_Trainer.Trainer_ID;
        
        
        select max(age), sName
        from Student;
        
        select sname, Major, leve
        from Student, Enrolled
        where Student.snum = Enrolled.Snum and Enrolled not in (Snum);
        
        
        select Student.Sname, Student.age, Faculty.Fname, Faculty.middleInitial, Faculty.Lname, Department.Deptname
        from Student, Faculty, Department
        where Student.Level = "UG" and Faculty.Fname = "Charles" and Faculty.middleInitial = "A" and Faculty.Lname = "Homer" and Faculty.Deptid = Department.Deptit and Student.Snum = Enrolled.snum and Enrolled.Cname = Class.Cname; 
        
create view `Class_Teachers` 
as select Class.Cname, Faculty.Fname, Faculty.Lname
from Class, Faculty
where Class.Facid = Faculty.Facid and Faculty.Deptid = Department.Deptid and Building = "London";
select * from Class_Teachers;
        
delimiter //
Create procedure NewGrades(facident int, bonuspt int)
begin 
	update Enrolled
	set Grade = Grade + bonuspt
	where Enrolled.cname = Class.cname and Class.Facid = facident;
end;
//delimiter ;

delimiter //
Create trigger increment_numFac
after insert on Faculty
for each row
begin 
	update Department
	set numfaculty = numfaculty + 1;
end;
//delimiter ;
