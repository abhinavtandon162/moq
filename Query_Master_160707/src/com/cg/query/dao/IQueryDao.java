package com.cg.query.dao;


import com.cg.query.dto.Query;

public interface IQueryDao {
	Query fetch(int id);
	public Query updateQuery(Query query);
}
