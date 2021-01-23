package com.java.module1;

public class SBIBank implements BankInterface, InternationalBankInterface {

    
      
    int branchCount = 5;
    static int currency = 10;

    @Override
    public void closeAcct(){
        System.out.println("Close SBI Acct"+ branchCount);

    }

    public void openAcct(){
        System.out.println("Openacct .."+currency);
    }

    @Override
    public void currencyRate() {
        int currency = 20;
        System.out.println("Currency "+currency);

    }


    public static void main(String[] args){
        SBIBank sbi = new SBIBank();
        sbi.currencyRate();
        System.out.println("...."+sbi.branchCount);
        sbi.closeAcct();
        sbi.openAcct();
        sbi.branchCount=10;
        currency=25;
        sbi.currencyRate();
        System.out.println("...."+sbi.branchCount);
        sbi.closeAcct();
        sbi.openAcct();
    }
}
