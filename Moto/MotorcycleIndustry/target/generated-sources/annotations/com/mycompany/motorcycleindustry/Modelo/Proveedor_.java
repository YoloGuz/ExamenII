package com.mycompany.motorcycleindustry.Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Proveedor.class)
public abstract class Proveedor_ {

	public static volatile SingularAttribute<Proveedor, String> nombreProveedor;
	public static volatile ListAttribute<Proveedor, Motocicleta> proveedorList;
	public static volatile SingularAttribute<Proveedor, Integer> proveedorId;
	public static volatile SingularAttribute<Proveedor, String> direccionProveedor;
	public static volatile SingularAttribute<Proveedor, String> emailProveedor;
	public static volatile SingularAttribute<Proveedor, Integer> telefonoProveedor;

	public static final String NOMBRE_PROVEEDOR = "nombreProveedor";
	public static final String PROVEEDOR_LIST = "proveedorList";
	public static final String PROVEEDOR_ID = "proveedorId";
	public static final String DIRECCION_PROVEEDOR = "direccionProveedor";
	public static final String EMAIL_PROVEEDOR = "emailProveedor";
	public static final String TELEFONO_PROVEEDOR = "telefonoProveedor";

}

