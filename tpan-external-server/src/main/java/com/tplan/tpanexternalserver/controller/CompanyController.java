package com.tplan.tpanexternalserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tplan.domain.Company;
import com.tplan.tpanexternalserver.controller.service.CompanyService;
import com.tplan.util.GsonUtil;

@RestController
@RequestMapping(value = "company")
public class CompanyController {

	@Autowired
	CompanyService companyService;

	@GetMapping("/get/{id}")
	@ResponseBody
	public String getCompanyById(@PathVariable("id") int id) {
		
		Company company = companyService.getCompanyById(id);

		return GsonUtil.ObjectToGson(company);

	}

}
