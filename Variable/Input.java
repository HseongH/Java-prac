import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 아무거나 입력해주세요");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("입력내용: %s%n", input);
		System.out.printf("num = %d%n", num);
	}
}
