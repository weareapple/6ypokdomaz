package com.company;

public class Main {

    public static void main(String[] args) {

//Создать обобщенный класс и обобщенный интерфейс и
// реализовать этот интерфейс классом.
// Ограничить параметры типов классом
// Number. В главном классе создать
// несколько экземпляров обобщенного класса.

        Summa<Integer> c = new Summa<>();
        System.out.println("Сумма 2 и 9 =  "+c.addition(2,9));
        System.out.println("Вычитание 4 и 6 =  "+c.subtract(4,6));
        System.out.println("Умножение 6 и 1 = "+c.multiplication(6,1));



    }
}
