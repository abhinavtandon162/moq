package com.cg.query.service;

import com.cg.query.dto.Query;

public interface IQueryService {

	Query fetch(int id);
	public Query updateQuery(Query query);
}
