package com.mycompany.motorcycleindustry.Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bodega.class)
public abstract class Bodega_ {

	public static volatile SingularAttribute<Bodega, Integer> telefonoBodega;
	public static volatile ListAttribute<Bodega, Motocicleta> motocicletaList;
	public static volatile SingularAttribute<Bodega, Integer> bodegaId;
	public static volatile SingularAttribute<Bodega, String> direccionBodega;

	public static final String TELEFONO_BODEGA = "telefonoBodega";
	public static final String MOTOCICLETA_LIST = "motocicletaList";
	public static final String BODEGA_ID = "bodegaId";
	public static final String DIRECCION_BODEGA = "direccionBodega";

}

