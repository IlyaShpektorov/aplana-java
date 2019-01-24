package Task17;

import java.io.*;
import java.util.Scanner;

/*
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt, 
 * а потом в этот же файл перезаписывать текстовые данные, введенные вручную. 
 * Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
public class Task17 {

	public static void main(String[] args) throws IOException {
		String s;
		String str;
		String FILE_NAME = "src\\\\Task17\\\\test.txt";
		int lineCount=0;
          
          //чтение
		try (BufferedReader br = 
				new BufferedReader(new FileReader(FILE_NAME))){
	
         while((s = br.readLine())!=null) {
				System.out.println(s);
			}        			
		} catch(IOException exc) {
	System.out.println("Ошибка:" + exc);
		}
		//кол-во строк
		
		BufferedReader buf=
				new BufferedReader(new FileReader(FILE_NAME));

        while((s=buf.readLine())!=null)
        {
                lineCount++;
        }
        System.out.println("Line Count : "+lineCount);
       
        buf.close();
		
		//ввод
		BufferedReader br = 
				new BufferedReader(
					new InputStreamReader(System.in));
		System.out.println("стоп ввода: stop");
		
		try (FileWriter fw = new FileWriter(FILE_NAME))
		{
			do {
				System.out.println(": ");
				str = br.readLine();
				
				if(str.compareTo("stop")== 0) break;				
				str = str+"\r\n";			
				fw.write(str);
			        
			} while(str.compareTo("stop") != 0);
			     
		}catch(IOException exc) {
			System.out.println("Ошибка:" + exc);
		}
		}
	}


