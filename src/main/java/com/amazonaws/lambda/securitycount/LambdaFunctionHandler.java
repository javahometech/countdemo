package com.amazonaws.lambda.securitycount;

import java.util.Iterator;

import com.amazonaws.lambda.securitycount.resp.RecordsCountResp;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.ScanFilter;
import com.amazonaws.services.dynamodbv2.document.ScanOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<Object, RecordsCountResp> {
	private static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_WEST_2).build();
	private static DynamoDB dynamoDB = new DynamoDB(client);
	RecordsCountResp resp = new RecordsCountResp();
	@Override
	public RecordsCountResp handleRequest(Object input, Context context) {
		context.getLogger().log("Input: " + input);
		resp.setOfferingIdCount(getOfferingIdCount());
		resp.setIssueIdCount(getissueIdCount());
		return resp;
	}

	private static int getissueIdCount() {
		Table table = dynamoDB.getTable("OFFER_SEC_LEVEL");
		final String offeringIdAtribute = "Issue_ID";
		ScanFilter filter = new ScanFilter(offeringIdAtribute).exists();
		ItemCollection<ScanOutcome> items = table.scan(filter);
		Iterator<Item> iter = items.iterator();
		while (iter.hasNext()) {
			iter.next();
		}
		System.out.println(items.getAccumulatedItemCount());
		return items.getAccumulatedItemCount();
	}
	
	private static int getOfferingIdCount() {
		Table table = dynamoDB.getTable("OFFER_SEC_LEVEL");
		final String offeringIdAtribute = "Offering ID";
		ScanFilter filter = new ScanFilter(offeringIdAtribute).exists();
		ItemCollection<ScanOutcome> items = table.scan(filter);
		Iterator<Item> iter = items.iterator();
		while (iter.hasNext()) {
			iter.next();
		}
		System.out.println(items.getAccumulatedItemCount());
		return items.getAccumulatedItemCount();
	}
	public static void main(String[] args) {
		getOfferingIdCount();
		getissueIdCount();
	}

}
