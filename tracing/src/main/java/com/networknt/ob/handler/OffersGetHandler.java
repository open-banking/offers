package com.networknt.ob.handler;

import com.networknt.handler.LightHttpHandler;
import com.networknt.httpstring.AttachmentConstants;
import com.networknt.utility.Constants;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class OffersGetHandler implements LightHttpHandler {
    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        Map<String, Object> auditInfo = exchange.getAttachment(AttachmentConstants.AUDIT_INFO);
        String userId = (String)auditInfo.get(Constants.USER_ID_STRING);
        String responseBody = null;
        if("stevehu".equals(userId)) {
            responseBody = "{\"Data\":{\"Offer\":[{\"AccountId\":\"22289\",\"OfferId\":\"Offer1\",\"OfferType\":\"LimitIncrease\",\"Description\":\"Credit limit increase for the account up to £10000.00\",\"Amount\":{\"Amount\":\"10000.00\",\"Currency\":\"GBP\"}},{\"AccountId\":\"22289\",\"OfferId\":\"Offer2\",\"OfferType\":\"BalanceTransfer\",\"Description\":\"Balance transfer offer up to £2000\",\"Amount\":{\"Amount\":\"2000.00\",\"Currency\":\"GBP\"}},{\"AccountId\":\"31820\",\"OfferId\":\"Offer3\",\"OfferType\":\"LimitIncrease\",\"Description\":\"Credit limit increase for the account up to £50000.00\",\"Amount\":{\"Amount\":\"50000.00\",\"Currency\":\"GBP\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/offers/\"},\"Meta\":{\"TotalPages\":1}}";
        } else if ("ericbroda".equals(userId)) {
            responseBody = "{\"Data\":{\"Offer\":[{\"AccountId\":\"42281\",\"OfferId\":\"Offer1\",\"OfferType\":\"LimitIncrease\",\"Description\":\"Credit limit increase for the account up to £10000.00\",\"Amount\":{\"Amount\":\"10000.00\",\"Currency\":\"GBP\"}},{\"AccountId\":\"42281\",\"OfferId\":\"Offer2\",\"OfferType\":\"BalanceTransfer\",\"Description\":\"Balance transfer offer up to £2000\",\"Amount\":{\"Amount\":\"2000.00\",\"Currency\":\"GBP\"}},{\"AccountId\":\"41221\",\"OfferId\":\"Offer3\",\"OfferType\":\"LimitIncrease\",\"Description\":\"Credit limit increase for the account up to £50000.00\",\"Amount\":{\"Amount\":\"50000.00\",\"Currency\":\"GBP\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/offers/\"},\"Meta\":{\"TotalPages\":1}}";
        }
        if(responseBody != null) {
            exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
            exchange.getResponseSender().send(responseBody);
        } else {
            exchange.setStatusCode(404);
            exchange.getResponseSender().send("");
        }
    }
}
