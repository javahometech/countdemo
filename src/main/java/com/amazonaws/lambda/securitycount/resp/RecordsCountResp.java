package com.amazonaws.lambda.securitycount.resp;

public class RecordsCountResp {
	
	private SecurityRecordCount secRecordCount;
	private OffSecUnderWriteLevel offSecUnderWriteLevel;
	
	public SecurityRecordCount getSecRecordCount() {
		return secRecordCount;
	}
	public void setSecRecordCount(SecurityRecordCount secRecordCount) {
		this.secRecordCount = secRecordCount;
	}
	public OffSecUnderWriteLevel getOffSecUnderWriteLevel() {
		return offSecUnderWriteLevel;
	}
	public void setOffSecUnderWriteLevel(OffSecUnderWriteLevel offSecUnderWriteLevel) {
		this.offSecUnderWriteLevel = offSecUnderWriteLevel;
	}
}
