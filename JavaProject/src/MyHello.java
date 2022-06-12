import java.util.Scanner;

public class MyHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("==================================");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("\u0aaf");
		//myInput();
	}

	static void myInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入的内容是6787：" + sc.next());
		while (sc.hasNext()) {
			System.out.println("您输入的是78998:" + sc.next());
		}

	}
	static void myTest( int i) {
		
	}

}
