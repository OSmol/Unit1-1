package my.pack;
import java.lang.Math;

public class Task8 {
	public static void main(String[] args) {
		double a, b, c, res; //4 �������������� ����� 
		
		a=1;
		b=1;
		c=1;
		
		if(a>0) {
			res=(b+Math.sqrt(b*b+4*a*c))/2*a-Math.pow(a, 3)*c+Math.pow(b, -2);
		}else {
			System.out.println("���������� a ����� ����, ��� �����������");
			res=Double.NaN;
		}

		System.out.println("�������� ��������� ����� "+res);
	}

}
