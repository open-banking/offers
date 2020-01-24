package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBOffer1  {

    private String OfferId;
    private String AccountId;
    private String Description;
    private java.time.LocalDateTime StartDateTime;
    private java.time.LocalDateTime EndDateTime;
    private String Rate;
    private OBActiveOrHistoricCurrencyAndAmount Amount;
    private OBActiveOrHistoricCurrencyAndAmount Fee;
    private Integer Value;
    private String Term;
    private String URL;
    private OBExternalOfferType1Code OfferType;

    public OBOffer1 () {
    }

    @JsonProperty("OfferId")
    public String getOfferId() {
        return OfferId;
    }

    public void setOfferId(String OfferId) {
        this.OfferId = OfferId;
    }

    @JsonProperty("AccountId")
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @JsonProperty("StartDateTime")
    public java.time.LocalDateTime getStartDateTime() {
        return StartDateTime;
    }

    public void setStartDateTime(java.time.LocalDateTime StartDateTime) {
        this.StartDateTime = StartDateTime;
    }

    @JsonProperty("EndDateTime")
    public java.time.LocalDateTime getEndDateTime() {
        return EndDateTime;
    }

    public void setEndDateTime(java.time.LocalDateTime EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    @JsonProperty("Rate")
    public String getRate() {
        return Rate;
    }

    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    @JsonProperty("Amount")
    public OBActiveOrHistoricCurrencyAndAmount getAmount() {
        return Amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount Amount) {
        this.Amount = Amount;
    }

    @JsonProperty("Fee")
    public OBActiveOrHistoricCurrencyAndAmount getFee() {
        return Fee;
    }

    public void setFee(OBActiveOrHistoricCurrencyAndAmount Fee) {
        this.Fee = Fee;
    }

    @JsonProperty("Value")
    public Integer getValue() {
        return Value;
    }

    public void setValue(Integer Value) {
        this.Value = Value;
    }

    @JsonProperty("Term")
    public String getTerm() {
        return Term;
    }

    public void setTerm(String Term) {
        this.Term = Term;
    }

    @JsonProperty("URL")
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @JsonProperty("OfferType")
    public OBExternalOfferType1Code getOfferType() {
        return OfferType;
    }

    public void setOfferType(OBExternalOfferType1Code OfferType) {
        this.OfferType = OfferType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBOffer1 OBOffer1 = (OBOffer1) o;

        return Objects.equals(OfferId, OBOffer1.OfferId) &&
               Objects.equals(AccountId, OBOffer1.AccountId) &&
               Objects.equals(Description, OBOffer1.Description) &&
               Objects.equals(StartDateTime, OBOffer1.StartDateTime) &&
               Objects.equals(EndDateTime, OBOffer1.EndDateTime) &&
               Objects.equals(Rate, OBOffer1.Rate) &&
               Objects.equals(Amount, OBOffer1.Amount) &&
               Objects.equals(Fee, OBOffer1.Fee) &&
               Objects.equals(Value, OBOffer1.Value) &&
               Objects.equals(Term, OBOffer1.Term) &&
               Objects.equals(URL, OBOffer1.URL) &&
               Objects.equals(OfferType, OBOffer1.OfferType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(OfferId, AccountId, Description, StartDateTime, EndDateTime, Rate, Amount, Fee, Value, Term, URL, OfferType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBOffer1 {\n");
        sb.append("    OfferId: ").append(toIndentedString(OfferId)).append("\n");        sb.append("    AccountId: ").append(toIndentedString(AccountId)).append("\n");        sb.append("    Description: ").append(toIndentedString(Description)).append("\n");        sb.append("    StartDateTime: ").append(toIndentedString(StartDateTime)).append("\n");        sb.append("    EndDateTime: ").append(toIndentedString(EndDateTime)).append("\n");        sb.append("    Rate: ").append(toIndentedString(Rate)).append("\n");        sb.append("    Amount: ").append(toIndentedString(Amount)).append("\n");        sb.append("    Fee: ").append(toIndentedString(Fee)).append("\n");        sb.append("    Value: ").append(toIndentedString(Value)).append("\n");        sb.append("    Term: ").append(toIndentedString(Term)).append("\n");        sb.append("    URL: ").append(toIndentedString(URL)).append("\n");        sb.append("    OfferType: ").append(toIndentedString(OfferType)).append("\n");
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
