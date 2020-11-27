package com.mycompany.motorcycleindustry.Modelo;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Motocicleta.class)
public abstract class Motocicleta_ {

	public static volatile SingularAttribute<Motocicleta, Marca> marca;
	public static volatile SingularAttribute<Motocicleta, BigDecimal> precioMotocicleta;
	public static volatile SingularAttribute<Motocicleta, Integer> motocicletaId;
	public static volatile SingularAttribute<Motocicleta, Integer> modeloMotocicleta;
	public static volatile SingularAttribute<Motocicleta, String> colorMotocicleta;
	public static volatile SingularAttribute<Motocicleta, Integer> cantidadMotocicleta;
	public static volatile SingularAttribute<Motocicleta, Proveedor> proveedor;
	public static volatile SingularAttribute<Motocicleta, Integer> cilindrajeMotocicleta;
	public static volatile SingularAttribute<Motocicleta, Bodega> bodega;

	public static final String MARCA = "marca";
	public static final String PRECIO_MOTOCICLETA = "precioMotocicleta";
	public static final String MOTOCICLETA_ID = "motocicletaId";
	public static final String MODELO_MOTOCICLETA = "modeloMotocicleta";
	public static final String COLOR_MOTOCICLETA = "colorMotocicleta";
	public static final String CANTIDAD_MOTOCICLETA = "cantidadMotocicleta";
	public static final String PROVEEDOR = "proveedor";
	public static final String CILINDRAJE_MOTOCICLETA = "cilindrajeMotocicleta";
	public static final String BODEGA = "bodega";

}

