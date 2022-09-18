package com.schd.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schd.Service.PersonInfoService;
import com.schd.Service.PersonInfoVO;

@RestController
@CrossOrigin(origins="*")
//@CrossOrigin(origins="http://localhost:3000")
public class PersonMainController {
	@Autowired
	private PersonInfoService personInfoService;
	
	@GetMapping("/ChkId")
	public String CheckPersonID(String per_id) {
		int result = personInfoService.CheckPersonID(per_id);
		if(result>0) { // 결과값이 많다면 중복
			return "notok"; 
		}
		return "200ok";
	}
	
	@PostMapping("/InsertPerson") 
	public String InsertPerson(String per_id, String per_pass, String  per_name) {
		
		PersonInfoVO personInfoVO = new PersonInfoVO();
		personInfoVO.setPER_ID(per_id);
		personInfoVO.setPER_PASS(per_pass);
		personInfoVO.setPER_NAME(per_name);
		int result = personInfoService.InsertPerson(personInfoVO);
		if(result == 1) { // 결과값이 1이면 성공, 그 외일때는 실패메세지 반환
			
		}
		return "200ok";
	}
	
	@GetMapping("/ScheduleLogin")
	public String ScheduleLogin(String per_id, String per_pass) {
		PersonInfoVO personInfoVO = new PersonInfoVO();
		personInfoVO.setPER_ID(per_id);
		personInfoVO.setPER_PASS(per_pass);
		int result = personInfoService.ScheduleLogin(personInfoVO);
		if(result<1) { // 결과값있다면 성공
			return "notok"; 
		}
		return "200ok";
	}
	
}
