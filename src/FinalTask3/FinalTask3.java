package FinalTask3;

import java.util.Scanner;

//Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей.

public class FinalTask3 {

	public static void main(String[] args) {
		 Scanner course = new Scanner(System.in);
		 Scanner money = new Scanner(System.in);
		 System.out.println("Введите курс доллара: ");
		 	int c = course.nextInt();
		 System.out.println("Введите кол-во рублей: ");
		 	int r = course.nextInt();
		 	
		 	int dollar = r*c;
		 	
		 	System.out.println("За " + r + " рублей вы получаете " + dollar + " долларов.");
	}

}
