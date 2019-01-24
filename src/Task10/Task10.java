package Task10;
//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран. 

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		System.out.println("Введите строку: ");
		Scanner string = new Scanner(System.in);
		String phrase = string.nextLine();
		System.out.println("Вы ввели " + phrase);
		
	}
}
