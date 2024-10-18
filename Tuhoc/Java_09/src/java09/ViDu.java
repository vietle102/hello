package java09;

import java.util.Scanner;

//Nhập dữ liệu từ bàn phím
public class ViDu {
	public static void main(String[] args) {
		/*tạo 1 cái class scanner
		 * B1: nhập Scanner -> ctrl + cách
		 * B2: chọn Scanner - java.util
		 * B3: khai báo biến dùng để nhập (ở đây mình dùng biến sc)
		 */
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Nhập vào họ và tên: ");
	// kiểu dữ liệu + tên biến = biến scanner.(các phương thức)
		String hoVaTen = sc.nextLine();
		
		System.out.println("Nhập mã sinh viên: ");
		long maSinhVien = sc.nextLong();
		
		System.out.println("Nhập vào điểm thi: ");
		float diemThi = sc.nextFloat();
		
		System.out.println("Họ và tên: "+hoVaTen);
		System.out.println("Mã sinh viên: "+maSinhVien);
		System.out.println("Điểm thi: "+diemThi);
	}
}
