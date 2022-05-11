import java.util.Scanner;

public class ez016_2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		System.out.print((year % 4 == 0) ? ((year % 400 == 0) ? "1" : (year % 100 == 0) ? "0" : "1") : "0");
	}
}