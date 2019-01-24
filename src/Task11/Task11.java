package Task11;

import java.util.Scanner;

import Task10.Task10;

//Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран. 
public class Task11 {

	public static void main(String[] args) {
		
		System.out.println("Введите слова с пробелами: ");
		Scanner string = new Scanner(System.in);
		String phrase = string.nextLine();
		System.out.println("Вы ввели: " + phrase.replaceAll("\\s+", ""));
		
	}
	
}
