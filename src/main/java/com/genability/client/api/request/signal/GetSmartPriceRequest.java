package com.genability.client.api.request.signal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.genability.client.api.request.AbstractRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSmartPriceRequest extends AbstractRequest implements Serializable {

  @JsonProperty("fromDateTime")
  private DateTime fromDateTime;

  @JsonProperty("toDateTime")
  private DateTime toDateTime;

  @JsonProperty("masterTariffId")
  private Long masterTariffId;

  @JsonProperty("zipCode")
  private String zipCode;

  @JsonProperty("postCode")
  private String postCode;

  @JsonProperty("country")
  private String country;

  @JsonProperty("addressString")
  private String addressString;

  @JsonProperty("customerClass")
  private String customerClass;

  @JsonProperty("endUse")
  private String endUse;

  @JsonProperty("groupBy")
  private String groupBy;

  @JsonProperty("territoryId")
  private Long territoryId;

  @JsonProperty("consumptionAmount")
  private Double consumptionAmount;

  @JsonProperty("demandAmount")
  private Double demandAmount;

  // Getters and Setters
  public DateTime getFromDateTime() {
    return fromDateTime;
  }

  public void setFromDateTime(DateTime fromDateTime) {
    this.fromDateTime = fromDateTime;
  }

  public DateTime getToDateTime() {
    return toDateTime;
  }

  public void setToDateTime(DateTime toDateTime) {
    this.toDateTime = toDateTime;
  }

  public Long getMasterTariffId() {
    return masterTariffId;
  }

  public void setMasterTariffId(Long masterTariffId) {
    this.masterTariffId = masterTariffId;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getAddressString() {
    return addressString;
  }

  public void setAddressString(String addressString) {
    this.addressString = addressString;
  }

  public String getCustomerClass() {
    return customerClass;
  }

  public void setCustomerClass(String customerClass) {
    this.customerClass = customerClass;
  }

  public String getEndUse() {
    return endUse;
  }

  public void setEndUse(String endUse) {
    this.endUse = endUse;
  }

  public String getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(String groupBy) {
    this.groupBy = groupBy;
  }

  public Long getTerritoryId() {
    return territoryId;
  }

  public void setTerritoryId(Long territoryId) {
    this.territoryId = territoryId;
  }

  public Double getConsumptionAmount() {
    return consumptionAmount;
  }

  public void setConsumptionAmount(Double consumptionAmount) {
    this.consumptionAmount = consumptionAmount;
  }

  public Double getDemandAmount() {
    return demandAmount;
  }

  public void setDemandAmount(Double demandAmount) {
    this.demandAmount = demandAmount;
  }

  @Override
  @JsonIgnore
  public List<NameValuePair> getQueryParams() {
    List<NameValuePair> qparams = new ArrayList<>();

    addParam(qparams, "fromDateTime", fromDateTime, ISO_8601_SHORT_DATE_FORMATTER);
    addParam(qparams, "toDateTime", toDateTime, ISO_8601_SHORT_DATE_FORMATTER);
    addParam(qparams, "masterTariffId", masterTariffId);
    addParam(qparams, "zipCode", zipCode);
    addParam(qparams, "postCode", postCode);
    addParam(qparams, "country", country);
    addParam(qparams, "addressString", addressString);
    addParam(qparams, "customerClass", customerClass);
    addParam(qparams, "endUse", endUse);
    addParam(qparams, "groupBy", groupBy);
    addParam(qparams, "territoryId", territoryId);
    addParam(qparams, "consumptionAmount", consumptionAmount);
    addParam(qparams, "demandAmount", demandAmount);

    return qparams;
  }
}

