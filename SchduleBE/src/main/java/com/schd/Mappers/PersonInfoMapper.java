package com.schd.Mappers;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.schd.Service.PersonInfoVO;

@Repository
@Mapper
public interface PersonInfoMapper {
	public int CheckPersonID(String per_id);
	public int InsertPerson(PersonInfoVO personInfoVO);
	public int ScheduleLogin(PersonInfoVO personInfoVO);
}
