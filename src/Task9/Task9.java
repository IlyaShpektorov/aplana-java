package Task9;

import java.util.Scanner;

public class Task9 {
/*����������� ���� ������ � ���������� � �������, 
 * � ����� ����� ����������� ����� ������ ������ ������� �� �����, ��� ������ ������� ���������� �� 3.*/
	public static void main(String[] args) {
		               
	        int a, b;
	        // ������ �������
	        a = 3;
	        //������ �������
	        b = 4;	 
	        
	        Scanner in = new Scanner(System.in);
	        
	        int[][] arr = new int[a][b];
	        
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print("������� �������� ������� ��� [" + i + "][" + j + "]:");
	                arr[i][j] = in.nextInt();
	            }   
	        }
	        in.close();

	        
	        for (int j = 0; j <=  arr.length; j++) {
	        	
	        	//������� �������� ������ ����� ������ ������ * 3
	        	System.out.print(" "  + arr[0][j]*3 + "\t");
	        	}
	        

	}
}
