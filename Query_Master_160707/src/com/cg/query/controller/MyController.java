package com.cg.query.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.cg.query.dto.Query;
import com.cg.query.service.IQueryService;


@Controller
public class MyController {
	@Autowired
	IQueryService iqueryservice;
	
	@RequestMapping(value="run",method=RequestMethod.GET)
	public String sayHello()
	{
		return "Welcome";
	}
	@RequestMapping(value = "/retrieve")
	public String retrieve_Detail(Model model) {
		Query query = new Query();
		model.addAttribute("query", query);
		return "Retrieve_Query";
	}

	@RequestMapping(value = "/retrieve_Query")
	public String retrieveEmployee(@ModelAttribute("query") Query query,BindingResult result,
			Model model) {
		Query QueryRes = iqueryservice.updateQuery(query);
		String target=null;
		if(QueryRes==null || QueryRes.getId()==0)
		{
			target="Failure";
		model.addAttribute("error","NULL Pointer Exception Occured");
		}
		else{
			target="Display";
			model.addAttribute("QueryList", QueryRes);	
		}
		
		return target;
	}

	@RequestMapping(value = "/update")
	public String updateQuery(Model model) {
		Query query = new Query();
	
		
		model.addAttribute("query", query);
		return "Update_trainee";
	}

	@RequestMapping(value = "/Update_Query")
	public String update_TraineeId(@ModelAttribute("query") Query query,
			Model model) {
	    query = iqueryservice.fetch(query.getId());
		query.setId(query.getId());
		
		
		model.addAttribute("QueryRes", query);
		return "Update_Trainee";
	}

	@RequestMapping(value = "/Update_Persisted_Query")
	public String updatedQuery(@ModelAttribute("QueryRes") Query query,
			Model model) {
		
		query.setId(query.getId());
		query.setTechnology(query.getTechnology());
	query.setQuery(query.getQuery());
		query.setQuery_raised_by(query.getQuery_raised_by());
		query.setSolutions(query.getSolutions());
		query.setSolution_given_by(query.getSolution_given_by());
		System.out.println(query.getSolution_given_by());
		model.addAttribute("QueryRes", query);
		return "UpdateSuccess";
	}

	
}
