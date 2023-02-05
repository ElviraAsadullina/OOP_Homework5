package ru.gb.oopseminar5.Actions;

public class Division implements Action {
    public double invoke(String firstNumber, String secondNumber){
        return Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
    }
}