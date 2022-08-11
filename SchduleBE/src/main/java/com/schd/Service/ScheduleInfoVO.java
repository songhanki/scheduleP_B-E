package com.schd.Service;


import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class ScheduleInfoVO {
	
	int SCH_SEQ;
	String SCH_NAME;
	Date SCH_STRDATE;
	Date SCH_EDDATE;
	String SCH_COMMENT;
	String SCH_YN;
	String USE_YN;
	String USER_ID;
	

	public int getSCH_SEQ() {
		return SCH_SEQ;
	}
	public void setSCH_SEQ(int sCH_SEQ) {
		SCH_SEQ = sCH_SEQ;
	}
	public String getSCH_NAME() {
		return SCH_NAME;
	}
	public void setSCH_NAME(String sCH_NAME) {
		SCH_NAME = sCH_NAME;
	}
	public Date getSCH_STRDATE() {
		return SCH_STRDATE;
	}
	public void setSCH_STRDATE(Date sCH_STRDATE) {
		SCH_STRDATE = sCH_STRDATE;
	}
	public Date getSCH_EDDATE() {
		return SCH_EDDATE;
	}
	public void setSCH_EDDATE(Date sCH_EDDATE) {
		SCH_EDDATE = sCH_EDDATE;
	}
	public String getSCH_COMMENT() {
		return SCH_COMMENT;
	}
	public void setSCH_COMMENT(String sCH_COMMENT) {
		SCH_COMMENT = sCH_COMMENT;
	}
	public String getSCH_YN() {
		return SCH_YN;
	}
	public void setSCH_YN(String sCH_YN) {
		SCH_YN = sCH_YN;
	}
	public String getUSE_YN() {
		return USE_YN;
	}
	public void setUSE_YN(String uSE_YN) {
		USE_YN = uSE_YN;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	
}
