package Task4;

import java.util.Scanner;

/* ������ �4: ��������� �������������� �������� �������
�������� ���������, ������� ����� ��������� ��������� ��������:

1. ���� ���� ����� � ���������� X,Y,Z

2. ���������� � ����� �� ����� �������� ��������������� ����� X,Y,Z

3. ������� �������� ��������������� �� 2 ��� ������� 

4. ���� ���������� ����� ������ 3, �� ������� �� ����� ��������� "��������� ��������� ���������" */


public class Task4 {

	public static void main(String[] args) {
	Task4 count = new Task4(); 
	count.count();
	}
		
	public void count() {
		Scanner in = new Scanner(System.in);
        System.out.println("������� �������� x: ");
        int x = in.nextInt();

        System.out.println("������� �������� y: ");
        int y = in.nextInt();

        System.out.println("������� �������� z: ");
        int z = in.nextInt();
        
        in.close();        
        
 int n = (x+y+z) / 3;
 
 	System.out.println("��.�����. = " + n);
 	
 	if (n/2 > 3) {
 		System.out.println("��������� ��������� ���������");
 	}
	}
}
