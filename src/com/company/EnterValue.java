package com.company;

import java.util.Scanner;

class EnterValue {
    private static String[] rome = new String[]{"I", "II","III","IV","V","VI","VII","VIII", "IX", "X"};
    private static String[] partOfExpression = new String[]{};
    private static boolean checkRome1 = false, checkRome2 = false;
    static void entering() throws IllegalException{
        String inputExpression;
        System.out.println("Введите выражение:");
        Scanner scanner = new Scanner(System.in);
        inputExpression = scanner.nextLine();
        partOfExpression = inputExpression.split(" ");
        validation();
    }
    static void validation() throws IllegalException {
        for (String i : rome) {
            if (i.equals(partOfExpression[0])) {
                checkRome1 = true;
            }
            if (i.equals(partOfExpression[2])) {
                checkRome2 = true;
            }
        }
        if ((!checkRome1 && checkRome2) || (checkRome1 && !checkRome2)) {
            throw new IllegalException("Нельзя использовать римские и арабские цифры в одном выражении.");
        }
        if (checkRome1 && checkRome2) {
            System.out.println(Convertor.decToRoman(Calc.Calculate
                    (Convertor.romanToDecimal(partOfExpression[0]), Convertor.romanToDecimal(partOfExpression[2]), partOfExpression[1])));
        }
        if (!checkRome1 && !checkRome2) {
            if ((Integer.parseInt(partOfExpression[0]) < 1 || Integer.parseInt(partOfExpression[0]) > 10) ||
                    (Integer.parseInt(partOfExpression[2]) < 1 || Integer.parseInt(partOfExpression[2]) > 10)){
                throw new IllegalException("Числа должны быть в диапазоне от 1 до 10 включительно.");
            } else {
                System.out.println(Calc.Calculate(Integer.parseInt(partOfExpression[0]),
                        Integer.parseInt(partOfExpression[2]), partOfExpression[1]));
            }
        }
    }
}
