package Task12;

import java.util.Scanner;

/*Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные. 
  Вывести на экран строку с наибольшей длинной. */
public class Task12 {

	public static void main(String[] args) {
		
		 Scanner phrase = new Scanner(System.in);
		 System.out.println("Введите фразу 1: ");
		 String string1 = phrase.nextLine();
		 	System.out.println("Введите фразу 2: ");
		 	String string2 = phrase.nextLine();
		 	
		 	int length1 = string1.length();
		 	int length2 = string2.length();
		 	if  (length1 > length2) {
		 		System.out.println(string1);
		 	}if (length1 == length2) {
		 		System.out.println ("Строки одинаковые, попробуем еще раз!");
			}else {
		 		System.out.println(string2);
		 	} 
	}

}
