package com.ga.ex2;

public class Roman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));

    }

    public static String intToRoman(int value) {
        String[] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5,9, 10, 40, 50, 90,100, 400, 500,900, 1000};
        String result = "";

       for(int i = symbols.length - 1; i >= 0 ; i--){
           while(value >= values[i]){
               result += symbols[i];
               value -= values[i];
           }
       }
        return result;
    }

}
