
Create DataBase ConectionJava

use ConectionJava 
go

Create Table Alumnos(
id_alumno int identity(1,1) primary key,
matricula nvarchar(7) not null,
nombre nvarchar(25) not null,
edad int not null,
sexo nvarchar(1) not null,
email nvarchar(50) not null,
activo bit not null
)

select * from Alumnos

delete from Alumnos
where id_alumno=5