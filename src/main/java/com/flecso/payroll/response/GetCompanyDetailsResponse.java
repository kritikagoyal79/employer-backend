package com.flecso.payroll.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCompanyDetailsResponse {
    String nameAndAddress;
    String taxSetUp;
    String kyc;
    String providentFundESICProfessionalTax;
    String externalCredentials;
}
