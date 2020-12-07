package com.company;

import java.util.ArrayList;

class Convertor {
    private static String[] rome = new String[]{"I", "IV","V","IX","X","XL","L", "XC", "C"};
    static int [] arab = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100};
    static String decToRoman(int dec) {
        String roman = "";
        for (int i = arab.length -1; i >= 0; i--) {
            while (dec >= arab[i]) {
                roman += rome[i];
                dec -= arab[i];
            }
        }
        return roman.toUpperCase();
    }
    public static int romanToDecimal(String roman){
        int result = 0;
        String[] partOfNumber;
        partOfNumber = roman.split("");
        int[] convertNumber = new int[]{};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < partOfNumber.length; i ++){
            for (int j = 0; j < rome.length; j++){
                if(partOfNumber[i].equals(rome[j])){
                    arrayList.add(arab[j]);
                }
            }
        }
        for(int i = 0; i < arrayList.size() - 1; i++){
            if(arrayList.get(i) >= arrayList.get(i+1)){
                result += arrayList.get(i);
            }
            else{
                result -= arrayList.get(i);
            }
        }
        result += arrayList.get(arrayList.size() - 1);
        return result;
    }
}