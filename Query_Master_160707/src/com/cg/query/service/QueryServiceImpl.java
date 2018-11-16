package com.cg.query.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.query.dao.IQueryDao;
import com.cg.query.dto.Query;
@Service(value="iqueryservice")
public class QueryServiceImpl implements IQueryService{
	@Autowired
IQueryDao iquerydao;
	@Override
	public Query fetch(int id) {
		// TODO Auto-generated method stub
		return iquerydao.fetch(id);
	}
	@Override
	public Query updateQuery(Query query) {
		// TODO Auto-generated method stub
		return iquerydao.updateQuery(query);
	}

}
