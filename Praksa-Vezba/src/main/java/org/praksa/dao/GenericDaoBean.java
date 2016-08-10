package org.praksa.dao;

import java.lang.reflect.ParameterizedType;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.praksa.db.DBConnection;
import org.springframework.data.repository.CrudRepository;

public abstract class GenericDaoBean<T> implements CrudRepository<T, Integer> {

	SessionFactory sessionFactory = DBConnection.getSessionFactory();
	Session session = sessionFactory.openSession();
	private Class<T> classGeneric;
	
	public GenericDaoBean() {
		classGeneric = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]; 
	}
	
	
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.delete(findOne(arg0));
		session.getTransaction().commit();
	}

	@Override
	public void delete(T arg0) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.delete(arg0);
		session.getTransaction().commit();

	}

	@Override
	public void delete(Iterable<? extends T> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<T> findAll() {
		// TODO Auto-generated method stub
		String tableName = classGeneric.getSimpleName();
		Query q = session.createQuery("select x from " + tableName + " x");
		return q.list();
	}

	@Override
	public Iterable<T> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findOne(Integer arg0) {
		// TODO Auto-generated method stub
		T entity;
		entity = (T) session.load(classGeneric, arg0);
		return entity;
	}

	@Override
	public <S extends T> S save(S arg0) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(arg0);
		session.getTransaction().commit();
		return null;
	}

	@Override
	public <S extends T> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
