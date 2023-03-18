package lang.print.gaps.finalModuleTask;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionByZero {
    public static void main(String[] args) {
        double number = 10;
        try{  
            System.out.println(number/0);
        } catch(ArithmeticException e){
        }             
    }
}
