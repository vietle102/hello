package Vidu;

import java.util.Scanner;

public class Vidu {
          public static void main(String[] args) {
			int a, b;
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap a: ");
			a = sc.nextInt();
			
			System.out.print("Nhap b: ");
			b = sc.nextInt();
			
			int tong = a + b;
			System.out.println(a+" + "+b+" = "+tong);
			
			int hieu = a - b;
			System.out.println(a+" - "+b+" = "+hieu);
			
			int tich = a * b;
			System.out.println(a+" x "+b+" = "+tich);
			
			double thuong = (double) a / b;
			System.out.println(a+" / "+b+" = "+thuong);
			
			int layDu = a % b;
			System.out.println(a+" % "+b+" = "+layDu);
		}
}
