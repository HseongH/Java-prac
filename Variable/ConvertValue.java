
public class ConvertValue {
	public static void main(String[] args) {
		int x = 10, y = 5;
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println(x);
		System.out.println(y);
	}
}
