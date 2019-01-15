package Task7;

import java.util.Scanner;

//Необходимо с помощью цикла вывести на экран числа от 1 до 50.
public class Task7 {

	public static void main(String[] args) {
	Task7 cycle = new Task7();
	System.out.println("while");
	cycle.w();
	System.out.println("for");
	cycle.f();
	System.out.println("do while");
	cycle.dw();


	}
	public static void w() {
		int x = 1;
		while (x <= 50) {
			System.out.println(x);
			x++;		
		}
	}
	
	public static void f() {
	for (int i = 1; i <= 50; i++) {
		  System.out.println(i);
		}
	}
	
	public static void dw() {
	int t = 1;
	do {
		System.out.println(t);
	    t++;             
	} while (t <= 50);
	}
	
}
