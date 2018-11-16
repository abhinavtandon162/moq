package com.cg.query.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="query_master")
public class Query {
	@Id
	@Column(name="query_id")
	@NotNull(message="Enter query id")
	private int id;
	@Column(name="technology")
	@NotEmpty(message="Enter Technology")
	private String technology;
	@Column(name="query_raised_by")
	@NotEmpty(message="enter the name who raised the query")
	private String query_raised_by;
	@Column(name="query")
	@NotEmpty(message="Enter query")
	private String query;
	@Column(name="solutions")
	private String solutions;
	@Column(name="solution_given_by")
	private String solution_given_by;
	
	@Override
	public String toString() {
		return "Query [id=" + id + ", technology=" + technology
				+ ", query_raised_by=" + query_raised_by + ", query=" + query
				+ ", solutions=" + solutions + ", solution_given_by="
				+ solution_given_by + "]";
	}
	public Query(int id, String technology, String query_raised_by, String query,
			String solutions, String solution_given_by) {
		super();
		this.id = id;
		this.technology = technology;
		this.query_raised_by = query_raised_by;
		this.query = query;
		this.solutions = solutions;
		this.solution_given_by = solution_given_by;
	}
	public Query() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getQuery_raised_by() {
		return query_raised_by;
	}
	public void setQuery_raised_by(String query_raised_by) {
		this.query_raised_by = query_raised_by;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getSolutions() {
		return solutions;
	}
	public void setSolutions(String solutions) {
		this.solutions = solutions;
	}
	public String getSolution_given_by() {
		return solution_given_by;
	}
	public void setSolution_given_by(String solution_given_by) {
		this.solution_given_by = solution_given_by;
	}
	
}
