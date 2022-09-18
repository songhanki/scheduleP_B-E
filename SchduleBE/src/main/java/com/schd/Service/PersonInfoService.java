package com.schd.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schd.Mappers.PersonInfoMapper;

@Service
public class PersonInfoService {
	
	@Autowired
	PersonInfoMapper personInfoMapper;
	
	public int CheckPersonID(String per_id) {
		return personInfoMapper.CheckPersonID(per_id);
	}
	
	public int InsertPerson(PersonInfoVO personInfoVO) {
		return personInfoMapper.InsertPerson(personInfoVO);
	}
	
	public int ScheduleLogin(PersonInfoVO personInfoVO) {
		return personInfoMapper.ScheduleLogin(personInfoVO);
	}
}
