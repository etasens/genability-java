package com.genability.client.types.signal;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import org.joda.time.DateTime;

public class SmartPrice {

  @JsonProperty("description")
  private String description;

  @JsonProperty("masterTariffId")
  private Long masterTariffId;

  @JsonProperty("fromDateTime")
  private DateTime fromDateTime;

  @JsonProperty("toDateTime")
  private DateTime toDateTime;

  @JsonProperty("detailLevel")
  private String detailLevel;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("rateMean")
  private BigDecimal rateMean;

  @JsonProperty("rateStandardDeviation")
  private BigDecimal rateStandardDeviation;

  @JsonProperty("priceChanges")
  private List<PriceChange> priceChanges;

  // Getters and Setters
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getMasterTariffId() {
    return masterTariffId;
  }

  public void setMasterTariffId(Long masterTariffId) {
    this.masterTariffId = masterTariffId;
  }

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

  public String getDetailLevel() {
    return detailLevel;
  }

  public void setDetailLevel(String detailLevel) {
    this.detailLevel = detailLevel;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BigDecimal getRateMean() {
    return rateMean;
  }

  public void setRateMean(BigDecimal rateMean) {
    this.rateMean = rateMean;
  }

  public BigDecimal getRateStandardDeviation() {
    return rateStandardDeviation;
  }

  public void setRateStandardDeviation(BigDecimal rateStandardDeviation) {
    this.rateStandardDeviation = rateStandardDeviation;
  }

  public List<PriceChange> getPriceChanges() {
    return priceChanges;
  }

  public void setPriceChanges(List<PriceChange> priceChanges) {
    this.priceChanges = priceChanges;
  }
}

