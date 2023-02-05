package ru.gb.oopseminar5.Actions;

import ru.gb.oopseminar5.Actions.Action;

public class Summing implements Action {
    public double invoke(String firstNumber, String secondNumber){
        return Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
    }
}