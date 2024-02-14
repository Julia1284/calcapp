package ru.yulialyapushkina.calcapp._main;

import ru.yulialyapushkina.calcapp.service.ResultWriterService;
import ru.yulialyapushkina.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 6;
        int result1 = Calculator.calcSum(num1,num2);
        int result2 = Calculator.calcDiff(num1,num2);
        int result3 = Calculator.calcProd(num1,num2);
        ResultWriterService.printResult(num1, num2, result1, "sum");
        ResultWriterService.printResult(num1, num2, result2, "difference");
        ResultWriterService.printResult(num1, num2, result3, "product");
    }
}
