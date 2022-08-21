package com.company;

public class Main {

    public static void main(String[] args) {
     BankAccount bankAccount = new BankAccount();
     bankAccount.deposit(20000d);
     while (true){
         System.out.println("Ваш баланс:"+ bankAccount.getAmount());
         try {
             bankAccount.withDraw(6000);
         }catch (LimitException e){
             System.out.println(e.getMessage()+"Было взято:"+ e.getRemainingAmount());
             try {
                 bankAccount.withDraw((int) e.getRemainingAmount());
                 System.out.println("Осталось:"+bankAccount.getAmount());
                 break;
             }catch (LimitException exception){
                 exception.printStackTrace();
             }
         }

     }
    }
}
