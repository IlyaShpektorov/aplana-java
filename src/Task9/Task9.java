package Task9;

import java.util.Scanner;

public class Task9 {
/*Произведите ввод данных с клавиатуры в матрицу, 
 * а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.*/
	public static void main(String[] args) {
		               
	        int a, b;
	        // высота матрицы
	        a = 3;
	        //ширина матрицы
	        b = 4;	 
	        
	        Scanner in = new Scanner(System.in);
	        
	        int[][] arr = new int[a][b];
	        
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print("Укажите значение массива для [" + i + "][" + j + "]:");
	                arr[i][j] = in.nextInt();
	            }   
	        }
	        in.close();

	        
	        for (int j = 0; j <=  arr.length; j++) {
	        	
	        	//выводим значения только самой первой строки * 3
	        	System.out.print(" "  + arr[0][j]*3 + "\t");
	        	}
	        

	}
}
