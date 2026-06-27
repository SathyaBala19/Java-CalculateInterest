package com.wipro.bank.acc;

public class RDAccount extends Account {
    private int tenure;
    private float principal;

    public RDAccount() {
    }

    public RDAccount(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }

    @Override
    public float calculateAmountDeposited() {
        return principal * tenure * 12;
    }

    @Override
    public float calculateInterest() {
        float totalDeposit = calculateAmountDeposited();
        float rate = getRateOfInterest();

        return totalDeposit * (float)Math.pow(1 + rate / 400, tenure * 4) - totalDeposit;
    }
}