package Task8;

import java.util.Arrays;
import java.util.Scanner;

/*
 Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.
 */
public class Task8 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		    int numbers [] = new int[3];

		    
		    for (int i = 0; i < numbers.length; i++)
		    {
		        System.out.println("Введите цифру");
		        numbers[i] = in.nextInt();
		       int x = numbers[i]*2;
		    }
		    for (int i = 0; i < numbers.length; i++) {
		        System.out.print ( " " + numbers[i] * 2); 
		    }
	}
}
