package Cacpheptoansosanh;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("Nhap a = ");
		a = sc.nextInt();
		System.out.print("Nhap b = ");
		b = sc.nextInt();
		
		System.out.println(a + " == " + b + " : "+ (a==b));
		System.out.println(a + " != " + b + " : "+ (a!=b));
		System.out.println(a + " < " + b + " : "+ (a<b));
		System.out.println(a + " <= " + b + " : "+ (a<=b));
		System.out.println(a + " > " + b + " : "+ (a>b));
		System.out.println(a + " >= " + b + " : "+ (a>=b));
		
		System.out.println("---------------");
		System.out.println("Cả 2 số là só chẵn: "+ (a%2==0&&b%2==0));
		System.out.println("Có ít nhất 1 số chẵn: "+ (a%2==0||b%2==0));
	}
}
