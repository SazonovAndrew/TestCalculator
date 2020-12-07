package com.company;

class Calc {

    static int result = 0;

    public static int Calculate(int theFirstValue, int theSecondValue, String operation) throws IllegalException {
        switch (operation) {
            case "+":
                result = theFirstValue + theSecondValue;
                break;
            case "-":
                result = theFirstValue - theSecondValue;
                break;
            case "/":
                result = theFirstValue / theSecondValue;
                break;
            case "*":
                result = theFirstValue * theSecondValue;
                break;
            default:
                throw new IllegalException("Недопустимая арифметическая операция. Ожидается: +, -, /, * ");
        }
        return result;
    }
}
