package Task5;

import java.util.Scanner;

//¬вести с консоли число в бинарном формате. ѕеревести его в int и вывести на экран 
//дл€ проверки 100101 = 37; 1100001001 = 777

public class Task5 {
	
	public static void main(String[] args) {
		
	Task5 binToInt = new Task5();
	binToInt.toINT2();
	binToInt.toINT1();
	
	}
	
	 public static int fpow(int a, int b) {
	        int result = 1;
	        for (int i = 0; i < b; i++) {
	            result *= a;
	        }
	        return result;
	    }
	 
	private static void toINT2() {	   
		Scanner in = new Scanner(System.in);
		System.out.println("”кажите числовое значение в бинарном формате: ");
		String bin = in.nextLine();
		  int fin = 0, a = 0, stepen = 0;
	       char[] symbols = bin.toCharArray();
	       for(int len = symbols.length-1; len >= 0; len--){
	           int temp = 0;
	           a = Character.getNumericValue(symbols[len]);
	           temp = a * fpow(2, stepen);
	           stepen++;
	           fin += temp;
	       }
	       
	       System.out.println(fin); 
	}

	
	public  void toINT1() {
		Scanner in = new Scanner(System.in);
		System.out.println("”кажите числовое значение в бинарном формате: ");
		String bin = in.nextLine();
		int inNum = Integer.parseInt(bin, 2); 
		in.close();  
		System.out.println(inNum); 
	}

}



