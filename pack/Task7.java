package my.pack;

public class Task7 {
	public static void main(String[] args) {
		double a, sq; //����� � ������� �������������� 
		
		a=4.2;
		
		if(a>0) {
			sq=a*(a/2);
		}else {
			System.out.println("����� �������������� ����� ����");
			sq=Double.NaN;
		}

		System.out.println("����� �������������� � ������ "+a+" ����� "+sq);
	}

}
