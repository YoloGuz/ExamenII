package com.mycompany.motorcycleindustry.Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Marca.class)
public abstract class Marca_ {

	public static volatile SingularAttribute<Marca, Integer> marcaId;
	public static volatile ListAttribute<Marca, Motocicleta> marcaList;
	public static volatile SingularAttribute<Marca, String> nombreMarca;

	public static final String MARCA_ID = "marcaId";
	public static final String MARCA_LIST = "marcaList";
	public static final String NOMBRE_MARCA = "nombreMarca";

}

