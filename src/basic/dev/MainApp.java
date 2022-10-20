package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao thang trong nam");
		int n;
		n = sc.nextInt();
		switch (n) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("Thang co 31 ngay");
		break;
		case 4, 6, 9, 11:
			System.out.println("Thang co 30 ngay");
		case 2:
			System.out.println("Thang co 28 ngay");
			break;
			default:
				System.out.println("Loi he thong");
			
		}
		

	}

}
