import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int ans;
		
		int xs = x2 - x1;
		int ys = y2 - y1;
		
		int x3 = x2 - ys;
		int y3 = y2 + xs;
		int x4 = x3 - xs;
		int y4 = y3 - ys; 
		
   		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
		
   		sc.close();
        return ;

    }
    
}

