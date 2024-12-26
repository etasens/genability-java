package com.genability.client.types.signal;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

public class PriceChange {

  @JsonProperty("name")
  private String name;

  @JsonProperty("fromDateTime")
  private String fromDateTime;

  @JsonProperty("toDateTime")
  private String toDateTime;

  @JsonProperty("rateAmount")
  private BigDecimal rateAmount;

  @JsonProperty("rateMeanDelta")
  private BigDecimal rateMeanDelta;

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFromDateTime() {
    return fromDateTime;
  }

  public void setFromDateTime(String fromDateTime) {
    this.fromDateTime = fromDateTime;
  }

  public String getToDateTime() {
    return toDateTime;
  }

  public void setToDateTime(String toDateTime) {
    this.toDateTime = toDateTime;
  }

  public BigDecimal getRateAmount() {
    return rateAmount;
  }

  public void setRateAmount(BigDecimal rateAmount) {
    this.rateAmount = rateAmount;
  }

  public BigDecimal getRateMeanDelta() {
    return rateMeanDelta;
  }

  public void setRateMeanDelta(BigDecimal rateMeanDelta) {
    this.rateMeanDelta = rateMeanDelta;
  }
}
