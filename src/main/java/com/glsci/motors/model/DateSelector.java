package com.glsci.motors.model;

public class DateSelector {
    private String startDate;

    private String endDate;



    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public DateSelector() {
        super();

    }

    public DateSelector(String startDate, String endDate) {
        super();
        this.startDate = startDate;
        this.endDate = endDate;
    }


}
