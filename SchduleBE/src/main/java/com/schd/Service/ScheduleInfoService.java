package com.schd.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schd.Mappers.ScheduleInfoMapper;

@Service
public class ScheduleInfoService {
	@Autowired
    ScheduleInfoMapper scheduleInfoMapper;
	
	public List<ScheduleInfoVO> SelectScheduleAllList(){
		return scheduleInfoMapper.SelectScheduleAllList();
	}
	
	public List<ScheduleInfoVO> SelectScheduleDayList(String date){
		return scheduleInfoMapper.SelectScheduleDayList(date);
	}
	
	public List<ScheduleInfoVO> SelectScheduleOne(String seq){
		return scheduleInfoMapper.SelectScheduleOne(seq);
	}
	
	public int InsertScheduleOne(ScheduleInfoVO scheduleInfoVO) {
		return scheduleInfoMapper.InsertScheduleOne(scheduleInfoVO);
	}
	public int UpdateScheduleOne(ScheduleInfoVO scheduleInfoVO) {
		return scheduleInfoMapper.UpdateScheduleOne(scheduleInfoVO);
	}
	public int DeleteScheduleOne(ScheduleInfoVO scheduleInfoVO) {
		return scheduleInfoMapper.DeleteScheduleOne(scheduleInfoVO);
	}
	
}
