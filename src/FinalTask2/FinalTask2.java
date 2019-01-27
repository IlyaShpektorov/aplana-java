package FinalTask2;

import java.util.Scanner;

//Написать программу сортировки по возрастанию заданного пользователем массива чисел

public class FinalTask2 {
	public static void main(String[] args) {
	
		 Scanner in = new Scanner(System.in);
		 Scanner lenght = new Scanner(System.in);
		 System.out.println("Введите длину массива: ");
		 	int e = lenght.nextInt();
		    int nums [] = new int[e];

		    
		    for (int i = 0; i < nums.length; i++)
		    {
		        System.out.println("Введите цифру");
		        nums[i] = in.nextInt();
		    }
		
		
	    System.out.print("Исходный порядок массива: ");
	    for (int i = 0; i < nums.length; i++)
	    System.out.print( nums[i] + " ");
	    System.out.println();
	    
	    for(int i = nums.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++){         
	            if( nums[j] > nums[j+1] ){
	                int tmp = nums[j];
	                nums[j] = nums[j+1];
	                nums[j+1] = tmp;
	            }
	        }
	    }
	    
	    System.out.print("Новый порядок: ");
	    for (int i = 0; i < nums.length; i++)
	    System.out.print( nums[i] + " ");

	}
}
