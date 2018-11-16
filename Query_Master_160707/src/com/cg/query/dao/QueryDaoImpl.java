package com.cg.query.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;




import com.cg.query.dto.Query;
@Repository(value="iquerydao")
@Transactional
public class QueryDaoImpl implements IQueryDao{

	@PersistenceContext
	EntityManager entitymanager;
	

	@Override
	public Query fetch(int id) {
		Query query = entitymanager.find(Query.class,id);
		return query;
	}


	@Override
	public Query updateQuery(Query query) {
		// TODO Auto-generated method stub
		Query query1=entitymanager.merge(query);
		return query1;
	}

}
