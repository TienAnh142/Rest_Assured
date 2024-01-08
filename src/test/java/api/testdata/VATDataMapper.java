package api.testdata;

import java.io.File;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class VATDataMapper {

	@JsonProperty("requestBoschUserId")
	String requestBoschUserId;

	@JsonProperty("requestBoschUserName")
	String requestBoschUserName;

	@JsonProperty("vatCountry")
	String vatCountry;

	@JsonProperty("rbCustGrpId")
	int rbCustGrpId;

	@JsonProperty("rbCustGrpShort")
	String rbCustGrpShort;

	@JsonProperty("companyCode")
	String companyCode;

	@JsonProperty("companyCodeShort")
	String companyCodeShort;

	@JsonProperty("vatCountryCust")
	String vatCountryCust;

	@JsonProperty("custRegistration")
	String custRegistration;

	@JsonProperty("custVatNumber")
	String custVatNumber;

	@JsonProperty("vatRegExpectDate")
	Date vatRegExpectDate;

	@JsonProperty("requestReason")
	String requestReason;

	@JsonProperty("vatID")
	String vatID;

	@JsonProperty("bearerToken")
	String bearerToken;

	@JsonProperty("userName")
	String userName;

	@JsonProperty("password")
	String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static VATDataMapper getVATData() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			return mapper.readValue(new File(System.getProperty("user.dir") + "/src/test/resources/VATRequest.json"),
					VATDataMapper.class);
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public String getVatID() {
		return vatID;
	}

	public void setVatID(String vatID) {
		this.vatID = vatID;
	}

	public String getRequestBoschUserId() {
		return requestBoschUserId;
	}

	public void setRequestBoschUserId(String requestBoschUserId) {
		this.requestBoschUserId = requestBoschUserId;
	}

	public String getRequestBoschUserName() {
		return requestBoschUserName;
	}

	public void setRequestBoschUserName(String requestBoschUserName) {
		this.requestBoschUserName = requestBoschUserName;
	}

	public String getVatCountry() {
		return vatCountry;
	}

	public void setVatCountry(String vatCountry) {
		this.vatCountry = vatCountry;
	}

	public int getRbCustGrpId() {
		return rbCustGrpId;
	}

	public void setRbCustGrpId(int rbCustGrpId) {
		this.rbCustGrpId = rbCustGrpId;
	}

	public String getRbCustGrpShort() {
		return rbCustGrpShort;
	}

	public void setRbCustGrpShort(String rbCustGrpShort) {
		this.rbCustGrpShort = rbCustGrpShort;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyCodeShort() {
		return companyCodeShort;
	}

	public void setCompanyCodeShort(String companyCodeShort) {
		this.companyCodeShort = companyCodeShort;
	}

	public String getVatCountryCust() {
		return vatCountryCust;
	}

	public void setVatCountryCust(String vatCountryCust) {
		this.vatCountryCust = vatCountryCust;
	}

	public String getCustRegistration() {
		return custRegistration;
	}

	public void setCustRegistration(String custRegistration) {
		this.custRegistration = custRegistration;
	}

	public String getCustVatNumber() {
		return custVatNumber;
	}

	public void setCustVatNumber(String custVatNumber) {
		this.custVatNumber = custVatNumber;
	}

	public Date getVatRegExpectDate() {
		return vatRegExpectDate;
	}

	public void setVatRegExpectDate(Date vatRegExpectDate) {
		this.vatRegExpectDate = vatRegExpectDate;
	}

	public String getRequestReason() {
		return requestReason;
	}

	public void setRequestReason(String requestReason) {
		this.requestReason = requestReason;
	}

	public String getBearerToken() {
		return bearerToken;
	}

	public void setBearerToken(String bearerToken) {
		this.bearerToken = bearerToken;
	}

}
