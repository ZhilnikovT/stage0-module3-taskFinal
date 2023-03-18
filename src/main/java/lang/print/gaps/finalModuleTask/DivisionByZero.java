package lang.print.gaps.finalModuleTask;

import java.io.IOException;

public class DivisionByZero {
    public static void main(String[] args) {
        double number = 10;
        try{  
            System.out.println(number/0);
        } catch(ArithmeticException e){
        }             
    }
}
