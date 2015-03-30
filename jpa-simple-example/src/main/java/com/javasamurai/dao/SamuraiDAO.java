package com.javasamurai.dao;

import javax.persistence.EntityManager;

import com.javasamurai.entity.Samurai;

public class SamuraiDAO {
	
	private EntityManager em;
	
	public SamuraiDAO(EntityManager em) {
		this.em = em;
	}
	
	public void insert(Samurai s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
	}
	public Samurai searchById(int id) {
		return em.find(Samurai.class, id);
	}
	public void update(Samurai s) {
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
	}
	public void delete(Samurai s) {
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
	}
}
