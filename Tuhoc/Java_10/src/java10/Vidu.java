package java10;
      //Cách chuyển đổi kiểu dữ liệu
public class Vidu {
         public static void main(String[] args) {
			int a = 100;
			int b = 2;
			
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			
		/*Ép kiểu ngầm định (Chuyển từ kiểu hẹp sang kiểu rộng hơn)
		 * tên kiểu dữ liệu + tên biến mới = tên biến cũ cần chuyển
		 */
			float c = a;
			float d = b;
			
			System.out.println("c = "+c);
			System.out.println("d = "+d);
			
		//Ép kiểu tường minh (chuyển tự kiểu rộng sang kiểu hẹp hơn, cụ thể hơn)
		
			float e = 3.5f;
			float f = 9.5f;
			
			System.out.println("e = "+e);
			System.out.println("f = "+f);
			
		//tên kiểu dữ liệu + tên biến mới = (tên kiểu dữ liệu) + tên biến cần chuyển
			
			int g = (int) e ;
			int h = (int) f ;
			 
			System.out.println("g = "+g);
			System.out.println("h = "+h);
			
		//Ép kiểu giữa nguyên thủy và đối tượng
			int x = new Integer(32);
		}
}
