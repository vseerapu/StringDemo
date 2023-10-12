
public class GetTheCharectacter {

	public static void main(String[] args) {
		
		String str = "My Name is Ramana";
		
		int var1 = str.codePointAt(1);
		int var2 = str.codePointAt(9);
		
		System.out.println(str);
		System.out.println("var1- " + var1);
		System.out.println("var2- "+ var2);
		
		int count = str.codePointCount(0, str.length());
		System.out.println(count);
		System.out.println(str.length());
	}
}
