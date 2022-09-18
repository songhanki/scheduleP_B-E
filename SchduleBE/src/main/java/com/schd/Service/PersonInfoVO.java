package com.schd.Service;

import org.springframework.stereotype.Repository;

@Repository
public class PersonInfoVO {
	int PER_SEQ;
	String PER_ID;
	String PER_NAME;
	String PER_PASS;
	
	public int getPER_SEQ() {
		return PER_SEQ;
	}
	public void setPER_SEQ(int pER_SEQ) {
		PER_SEQ = pER_SEQ;
	}
	public String getPER_ID() {
		return PER_ID;
	}
	public void setPER_ID(String pER_ID) {
		PER_ID = pER_ID;
	}
	public String getPER_NAME() {
		return PER_NAME;
	}
	public void setPER_NAME(String pER_NAME) {
		PER_NAME = pER_NAME;
	}
	public String getPER_PASS() {
		return PER_PASS;
	}
	public void setPER_PASS(String pER_PASS) {
		PER_PASS = pER_PASS;
	}
}
