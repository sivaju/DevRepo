package com.iicind.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by shivakrishna on 02/08/16.
 */

@Entity
public class ResarvationEvent
{
    @Id
    private Integer ticketId;
    private Integer ResarvationId;
    private String pnrNumber;
    private String sourceLocation;
    private String destinationLocation;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = this.ticketId;
    }

    public Integer getResarvationId() {
        return ResarvationId;
    }

    public void setResarvationId(Integer resarvationId) {
        ResarvationId = resarvationId;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public ResarvationEvent() {
    }

    public ResarvationEvent(Integer ticketId, Integer resarvationId, String pnrNumber, String sourceLocation, String destinationLocation) {
        this.ticketId = ticketId;
        ResarvationId = resarvationId;
        this.pnrNumber = pnrNumber;
        this.sourceLocation = sourceLocation;
        this.destinationLocation = destinationLocation;
    }

    @Override
    public String toString() {
        return "ResarvationEvent{" +
                "ticketId=" + ticketId +
                ", ResarvationId=" + ResarvationId +
                ", pnrNumber='" + pnrNumber + '\'' +
                ", sourceLocation='" + sourceLocation + '\'' +
                ", destinationLocation='" + destinationLocation + '\'' +
                '}';
    }

}
