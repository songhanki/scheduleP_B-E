package com.schd.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schd.Service.ScheduleInfoService;
import com.schd.Service.ScheduleInfoVO;

@RestController
//@CrossOrigin(origins="http://localhost:3000") // cors설정(react)
@CrossOrigin(origins="*") // cors설정(전체허용)
public class ScheduleMainController {
	
	@Autowired
	private ScheduleInfoService scheduleInfoService;
	
	@GetMapping("/") 
	public Map<String,String> main() {
		Map<String,String> map = new HashMap<>();
		map.put("hello", "1234");
		return map;
	}
	
	@GetMapping("/test") 
	public Map<String,String> test() {
		Map<String,String> map = new HashMap<>();
		map.put("test", "1234");
		return map;
	}
	
	/** CRUD에 따른 RequestMapping 구분
	 * @GetMapping  	- Read
	 * @PostMapping 	- Create
	 * @PutMapping  	- Update
	 * @DeleteMapping 	- Delete
	 * 
	 * */
	
	//일정 전체 검색
	@GetMapping("/SelectScheduleAllList")
	public List<ScheduleInfoVO> SelectScheduleAllList() {
	
		List<ScheduleInfoVO> all_list = scheduleInfoService.SelectScheduleAllList();
		
		return all_list;
	}
	
	//날짜별 일정 검색
	@GetMapping("/SelectScheduleDayList")
	public List<ScheduleInfoVO> SelectScheduleDayList(String date){
		List<ScheduleInfoVO> day_list = scheduleInfoService.SelectScheduleDayList(date);
		return day_list;
	}
	
	//스케쥴 넘버링값 검색
	@GetMapping("/SelectScheduleOne")
	public List<ScheduleInfoVO> SelectScheduleOne(String seq){
		List<ScheduleInfoVO> sch_list = scheduleInfoService.SelectScheduleOne(seq);
		return sch_list;
	}
	
	
	//일정 입력
	@PostMapping("/InsertScheduleOne")
	//public String InsertScheduleOne(ScheduleInfoVO scheduleInfoVO) throws ParseException {
	public String InsertScheduleOne( String sch_name, String sch_strdate, String sch_eddate, String sch_comment) throws ParseException {

		SimpleDateFormat  formatter =  new SimpleDateFormat("yyyy-MM-dd");         
		// 문자열 -> Date        
		Date strdate = formatter.parse(sch_strdate);
		Date eddate = formatter.parse(sch_eddate);
		
		ScheduleInfoVO scheduleInfoVO = new ScheduleInfoVO();
		scheduleInfoVO.setSCH_NAME(sch_name);
		scheduleInfoVO.setSCH_STRDATE(strdate);
		scheduleInfoVO.setSCH_EDDATE(eddate);
		scheduleInfoVO.setSCH_COMMENT(sch_comment);
		
		int result = scheduleInfoService.InsertScheduleOne(scheduleInfoVO);
		System.out.println(result);
		if(result == 1) { // 결과값이 1이면 성공, 그 외일때는 실패메세지 반환
			return "notok";
		}
		return "200ok";
	}
	
	//일정 수정
	@PutMapping("/UpdateScheduleOne")
	public String UpdateScheduleOne(String sch_name, String sch_strdate, String sch_eddate, int sch_seq, String sch_comment) throws ParseException {
		// 포맷터        
		SimpleDateFormat  formatter =  new SimpleDateFormat("yyyy-MM-dd");         
		// 문자열 -> Date        
		Date strdate = formatter.parse(sch_strdate);
		Date eddate = formatter.parse(sch_eddate);
		System.out.println(strdate);
		
		ScheduleInfoVO scheduleInfoVO = new ScheduleInfoVO();
		scheduleInfoVO.setSCH_SEQ(sch_seq);
		scheduleInfoVO.setSCH_NAME(sch_name);
		scheduleInfoVO.setSCH_STRDATE(strdate);
		scheduleInfoVO.setSCH_EDDATE(eddate);
		scheduleInfoVO.setSCH_COMMENT(sch_comment);
		
		int result = scheduleInfoService.UpdateScheduleOne(scheduleInfoVO);
		System.out.println(result);
		if(result == 1) { // 결과값이 1이면 성공, 그 외일때는 실패메세지 반환
			return "notok";
		}
		return "200ok";
	}
	
	//일정 삭제
	@DeleteMapping("/DeleteScheduleOne")
	public String DeleteScheduleOne(int sch_seq) {
		ScheduleInfoVO scheduleInfoVO = new ScheduleInfoVO();
		scheduleInfoVO.setSCH_SEQ(sch_seq);
		
		int result = scheduleInfoService.DeleteScheduleOne(scheduleInfoVO);
		System.out.println(result);
		if(result == 1) { // 결과값이 1이면 성공, 그 외일때는 실패메세지 반환
			return "notok";
		}
		return "200ok";
	}
	
	
	
	
}
