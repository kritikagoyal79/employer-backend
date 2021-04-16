package com.flecso.payroll.impl;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.flecso.payroll.response.GetCompanyDetailsResponse;

public class GetCompanyDetails implements RequestHandler<Object, GetCompanyDetailsResponse> {

    public GetCompanyDetailsResponse handleRequest(Object input, Context context) {
        return new GetCompanyDetailsResponse("{\"Name & Registered Address\":\"Flecso \\nB-903 Saket Callipolis \\n Sarjapur Main Road \\nKarnataka \\n560035\"}",
                "{\"PAN\":\"BGGPS5813L\",\"TAN\":\"BGGPS5813L\",\"GSTIN\":\"23ATNPS1703L1ZI\"}",
                "{\"KYC Status\":\"Verification not initiated\"}", "{\"PF Status\":\"Enabled\",\"ESIC Status\":\"Enabled\",\"PT Status\":\"Enabled\"}",
                "{\"TRACES\":\"Set\",\"PF\":\"Set\",\"ESIC\":\"Not Set\",\"PT\":\"Not Set\"}");
    }
}
