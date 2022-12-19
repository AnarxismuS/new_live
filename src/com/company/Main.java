package com.company;

import java.util.ArrayList;

/**
 * Данный класс содержит упражнения для ума по настроению
 * Анука проверим как работает гит 
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(fromBinaryToDecimal("101010"));

        int[] arr = {4, 2, 5, 6};
        System.out.println(min_array(arr));
        System.out.println(my_equals("Алиса", "Алиса"));

        String str = "Алиса";
        System.out.println(str.codePointCount(0, str.length()));

        char[] charsArray = getChars(str);
        int[] сodePoints = str.codePoints().toArray();
        for (int i = 0; i < charsArray.length; i++) {

            System.out.print(" " + charsArray[i] + ":" + сodePoints[i]);
        }

        String[] list1 = {"CD", "AC", "BA", "AA", "AB", "CE"};

        String[] list2 = lexGraphSort(list1);

        for(int i = 0; i < list2.length; i++){
            System.out.print(" " + list2[i]);
        }
        System.out.println();
        char[] literals = {'a','b','c',' ','7', '\n', 'z'};
        System.out.print( testStringBilder(literals));
        ArrayList<Basket> baskets = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            baskets.add(new Basket(i));
        }

        System.out.println(imageToData(800, 600, 10, 10));
    }
        //Метод, попытка перевода из двоичной системы в десятичную
        static int fromBinaryToDecimal (String item){
            int number = 0;
            for (int i = 0; i < item.length(); i++) {
                number += (item.charAt(i) - '0') * (Math.pow(2, item.length() - i - 1));
            }
            return number;
        }
        //Метод находит минимальный элемент массива
        static int min_array ( int array[]){
            int result = array[0];
            for (int i : array) {
                if (i < result) result = i;

            }
            return result;
        }
        //Метод провряет одинаковые ли строки
        static boolean my_equals (String str1, String str2){
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

            boolean flag = false;
            if (s1.length != s2.length) {
                return false;
            } else {

            }
            for (int i = 0; i < s1.length; i++) {
                if (s1[i] == s2[i]) flag = true;
                else flag = false;

                if (!flag) break;
            }
            return flag;
        }
        //Разбить строку на символ.
        static char[] getChars (String str){
            char chars[] = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                chars[i] = str.charAt(i);
            }
            return chars;
        }
       /**
        Еще один метод урод, попытка использовать только compareTo().
        Метод использует сортировку пузырьком которая опирается на значения compareTo() 1, 0,-1
        Сортирует строки лексикографически. Не используй его на людях.
        Лучше используй пример с Жавараша.
       **/
        private static String[] lexGraphSort (String[] sarray){
            String buf;
            for(int i = 0; i < sarray.length-1; i++) {
                for(int j = sarray.length - 1; j > i; j--){
                    if (sarray[j - 1].compareTo(sarray[j]) >= 0) {
                        buf = sarray[j - 1];
                        sarray[j - 1] = sarray[j];
                        sarray[j] = buf;
                    }
                }
            }
            return sarray;
        }

        //Метод просто тестит стандартную работу стрингбилдера. Говорят так быстрее.
        private static String testStringBilder(char[] chars){
            StringBuilder builder = new StringBuilder();
            for (char lieral : chars){
                builder.append(lieral);
            }
            return builder.toString();
        }

    public static double imageToData(int w, int h, int widthStep, int heightStep){

        double numInput= ((w/widthStep*2-1)*(h / heightStep*2-1));
        return numInput;
        }
}
class Basket{
    int count = 0;
    public Basket(int number){
        this(10, "Вася");
        System.out.println("Объект номер: " + number);
    }

    public Basket(int number, String name){

            System.out.println("Вызван конструктор через this: " + number + name);
        }

    }
