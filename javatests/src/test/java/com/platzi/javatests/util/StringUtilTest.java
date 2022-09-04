package com.platzi.javatests.util;

class StringUtilTest {
    public static void main(String[] args) {

        String result = StringUtil.repeat("Hola",3);
        if (!result.equals("HolaHolaHola")){
            System.out.println("ERROR");
        }

        String result2 = StringUtil.repeat("Hola",2);
        if (!result2.equals("HolaHola")){
            System.out.println("ERROR");
        }
    }
}