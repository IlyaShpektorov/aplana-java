package Task15;
import java.io.*;
/*
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt 
 */
public class Task15 {

	public static void main(String[] args) {
		
	String s;
	try (BufferedReader br = 
			new BufferedReader(new FileReader("src\\Task15\\test.txt"))){
		while((s = br.readLine())!=null) {
			System.out.println(s);
		}
	} catch(IOException exc) {
System.out.println("Ошибка:" + exc);
	}

}}
