package com.javatutorialshub.collections.set;

import java.util.Objects;

public class Value implements Comparable<Value>{
    private Double earning;
    private Double revenue;


    public Value(Double earning, Double revenue) {
        this.earning = earning;
        this.revenue = revenue;
    }

    @Override
    public int compareTo(Value o) {
        if(earning.compareTo(o.earning) == 0) {
            return revenue.compareTo(o.revenue);
        } else {
            return earning.compareTo(o.earning);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return Objects.equals(earning, value.earning) && Objects.equals(revenue, value.revenue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(earning, revenue);
    }

    public Double getEarning() {
        return earning;
    }

    public void setEarning(Double earning) {
        this.earning = earning;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }
}
