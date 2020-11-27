create database motorcycleIndustry;

use motorcycleIndustry;

create table proveedor(
proveedorId int primary key not null auto_increment,
nombreProveedor varchar(250) not null,
telefonoProveedor bigint(8) not null,
emailProveedor varchar(100),
direccionProveedor varchar(150)
);

create table marca(
marcaId int primary key not null auto_increment,
nombreMarca varchar(250) not null
);

create table bodega(
bodegaId int primary key not null auto_increment,
telefonoBodega bigint(8) not null,
direccionBodega varchar(250) not null
);

create table motocicleta(
motocicletaId int primary key not null auto_increment,
modeloMotocicleta int(4) not null,
colorMotocicleta varchar(50) not null,
cilindrajeMotocicleta int(4) not null,
precioMotocicleta double(8,4) not null,
cantidadMotocicleta int(8) not null,
proveedorId int not null, 
foreign key (proveedorId) references proveedor(proveedorId),
marcaId int not null,
foreign key (marcaId) references marca(marcaId),
bodegaId int not null,
foreign key (bodegaId) references bodega(bodegaId)
);

