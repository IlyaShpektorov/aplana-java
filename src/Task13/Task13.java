package Task13;

import java.util.Scanner;

/*Необходимо написать программу, которая будет реализовывать следующие действия:
1. Ввод числа с клавиатуры и запись его в строковую переменную S

2. Конвертация строковой переменной S в числовую переменную X типа int

3. Конвертация числа X типа int в число Y типа double

Все три числа разных типов необходимо в столбик вывести на экран */

public class Task13 {

	public static void main(String[] args) {
		 Scanner phrase = new Scanner(System.in);
		 
		 System.out.println("Введите число: ");
		 String S = phrase.nextLine();
		 
		 int X = Integer.parseInt(S);
		 
		 double Y = X;
		 System.out.println(S +  "\n"  + X + "\n" + Y );
	}

}
