package com.tplan.tpanexternalserver.controller.serviceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Service;

import com.tplan.domain.Company;
import com.tplan.tpanexternalserver.controller.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	private static String SELECT_COMPANY_BY_ID="select id,name,introduce from company where id = ?";
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Company getCompanyById(int id) {
		Company company= new Company();
		
		jdbcTemplate.query(SELECT_COMPANY_BY_ID, new Object[]{id},new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				company.setId(id);
				company.setName(rs.getString("name"));
				company.setDescribe(rs.getString("introduce"));
			}
		});
		return company;
	}

}
