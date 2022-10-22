package br.com.dio;

public class LoanMoney {

    public static double interestRateOverThirtyDays(){
        return 0.2;
    }

    public static double interestRateBelowThirtyDays(){
        return 0.1;
    }

    public static void calculator(double valor, int days){
        if (days > 0 && days < 31){
            double result = (valor * interestRateBelowThirtyDays()) + valor;
            System.out.println("R$ "+ result);
        } else {
            double result = (valor * interestRateOverThirtyDays()) + valor;
            System.out.println("R$ " + result);
        }
    }

}
