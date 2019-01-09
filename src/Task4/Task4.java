package Task4;

import java.util.Scanner;

/* Задача №4: Отработка арифметических операций Задание
Написать программу, которая будет выполнять следующие действия:

1. Ввод трех чисел с клавиатуры X,Y,Z

2. Нахождение и вывод на экран среднего арифметического чисел X,Y,Z

3. Деление среднего арифметического на 2 без остатка 

4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно" */


public class Task4 {

	public static void main(String[] args) {
	Task4 count = new Task4(); 
	count.count();
	}
		
	public void count() {
		Scanner in = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        int x = in.nextInt();

        System.out.println("Введите значение y: ");
        int y = in.nextInt();

        System.out.println("Введите значение z: ");
        int z = in.nextInt();
        
        in.close();        
        
 int n = (x+y+z) / 3;
 
 	System.out.println("Ср.арифм. = " + n);
 	
 	if (n/2 > 3) {
 		System.out.println("Программа выполнена корректно");
 	}
	}
}
