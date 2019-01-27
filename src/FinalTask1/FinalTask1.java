package FinalTask1;

import java.util.Scanner;

//Написать программу, которая будет выводить таблицу умножения для введенного пользователем числа с клавиатуры.

public class FinalTask1 {

	public static void main(String[] args) {
	
			  System.out.print("Введите цифру:  ");
			  
			         int num=new Scanner(System.in).nextInt();
			  
			         for (int i = 1; i <=10 ; i++) {
				         System.out.println(num + " * "+ i +" = "+num*i);
			  
			     }


	}

}
