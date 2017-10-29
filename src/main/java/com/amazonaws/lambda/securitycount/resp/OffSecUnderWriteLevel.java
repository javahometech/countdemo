package com.amazonaws.lambda.securitycount.resp;

public class OffSecUnderWriteLevel {
	private Integer offeringId;
	private Integer issueId;
	private Integer securityRecordId;
	public Integer getOfferingId() {
		return offeringId;
	}
	public void setOfferingId(Integer offeringId) {
		this.offeringId = offeringId;
	}
	public Integer getIssueId() {
		return issueId;
	}
	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}
	public Integer getSecurityRecordId() {
		return securityRecordId;
	}
	public void setSecurityRecordId(Integer securityRecordId) {
		this.securityRecordId = securityRecordId;
	}
	
}
