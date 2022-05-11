import java.util.Scanner;

public class ez019_2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        
        A = A * 60;
        int D = A + B + C;
        int F = D/60;
        int G = D%60;
        
      //F가 24를 넘는다면?
		if (F>=24) {
			F= F-24;
		}
        
        System.out.println(F + " "+ G);
       
    }
}