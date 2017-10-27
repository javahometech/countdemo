package com.amazonaws.lambda.securitycount.resp;

public class RecordsCountResp {
	private Integer offeringIdCount;
	private Integer issueIdCount;

	public Integer getIssueIdCount() {
		return issueIdCount;
	}
	public void setIssueIdCount(Integer issueIdCount) {
		this.issueIdCount = issueIdCount;
	}
	public Integer getOfferingIdCount() {
		return offeringIdCount;
	}
	public void setOfferingIdCount(Integer offeringIdCount) {
		this.offeringIdCount = offeringIdCount;
	}
}
