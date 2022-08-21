package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;

    }
    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw (Integer sum)throws LimitException{
        if (amount < sum){
                throw new LimitException("У вас нет денег",getAmount());
            }
        amount -=sum;
        }
    }
