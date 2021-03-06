package com.aplication.company.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.AccessType;


@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEmployee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 927903196158164160L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
