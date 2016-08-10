package org.praksa.service;

import org.praksa.dao.DrzavaDao;
import org.praksa.model.Drzava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DrzavaServiceImpl implements DrzavaService{

	
	@Autowired
	DrzavaDao drzDao;
	
	
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return drzDao.count();
	}

	@Override
	public void delete(Integer arg0) 
	{
		drzDao.delete(arg0);
		
	}

	@Override
	public void delete(Drzava arg0) {
		// TODO Auto-generated method stub
		drzDao.delete(arg0);
		
	}

	@Override
	public void delete(Iterable<? extends Drzava> arg0) {
		// TODO Auto-generated method stub
		drzDao.delete(arg0);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		drzDao.deleteAll();
		
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return drzDao.exists(arg0);
	}

	@Override
	public Iterable<Drzava> findAll() {
		// TODO Auto-generated method stub
		return drzDao.findAll();
	}

	@Override
	public Iterable<Drzava> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return drzDao.findAll(arg0);
	}

	@Override
	public Drzava findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return drzDao.findOne(arg0);
	}

	@Override
	public <S extends Drzava> S save(S arg0) {
		// TODO Auto-generated method stub
		return drzDao.save(arg0);
	}

	@Override
	public <S extends Drzava> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return drzDao.save(arg0);
	}

}
