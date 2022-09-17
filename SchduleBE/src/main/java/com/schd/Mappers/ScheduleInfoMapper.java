package com.schd.Mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.schd.Service.ScheduleInfoVO;

@Repository
@Mapper
public interface ScheduleInfoMapper {
	public List<ScheduleInfoVO> SelectScheduleAllList();
	public List<ScheduleInfoVO> SelectScheduleDayList(String date);
	public List<ScheduleInfoVO> SelectScheduleOne(String seq);
	public int InsertScheduleOne(ScheduleInfoVO scheduleInfoVO);
	public int UpdateScheduleOne(ScheduleInfoVO scheduleInfoVO);
	public int DeleteScheduleOne(ScheduleInfoVO scheduleInfoVO);
	
	
}
