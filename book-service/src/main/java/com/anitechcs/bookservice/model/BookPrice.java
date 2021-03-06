package com.anitechcs.bookservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Price of the book
 */
@ApiModel(description = "Price of the book")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BookPrice   {
  @JsonProperty("currency")
  private String currency;

  @JsonProperty("amount")
  private Float amount;

  @JsonProperty("mrp")
  private Float mrp;

  public BookPrice currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency
   * @return currency
  */
  @ApiModelProperty(value = "Currency")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BookPrice amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Price amount
   * @return amount
  */
  @ApiModelProperty(value = "Price amount")


  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public BookPrice mrp(Float mrp) {
    this.mrp = mrp;
    return this;
  }

  /**
   * MRP price
   * @return mrp
  */
  @ApiModelProperty(value = "MRP price")


  public Float getMrp() {
    return mrp;
  }

  public void setMrp(Float mrp) {
    this.mrp = mrp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookPrice bookPrice = (BookPrice) o;
    return Objects.equals(this.currency, bookPrice.currency) &&
        Objects.equals(this.amount, bookPrice.amount) &&
        Objects.equals(this.mrp, bookPrice.mrp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, amount, mrp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookPrice {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    mrp: ").append(toIndentedString(mrp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

