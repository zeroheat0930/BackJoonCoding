import java.util.Scanner;

public class ex023_10989 {
		public static void main(String[] args) {
	    
			Scanner in = new Scanner(System.in);
			
			int a = in.nextInt();
			int s = 0;
			
			
			for(int i = 1; i <= a; i++) {
				s += i;
				
			}
			System.out.println(s);
		}
	}