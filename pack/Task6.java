package my.pack;

public class Task6 {
	public static void main(String[] args) {
		int n, m; //���������� ����� � ������� ������� ��������������
		double liter_count; //���������� ������ � ������� �������
		
		n=0;
		m=2;
		if(n>0&&m>0) {
				liter_count=(80/n+12)*m;
		}else {
			System.out.println("���������� ����� ��� ������� ����� ����� ����");
			liter_count=Double.NaN;
		}

		System.out.println("���������� ������ ������ � ������� ������� ����� "+liter_count);
	}

}
