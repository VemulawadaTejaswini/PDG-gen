import java.util.Scanner;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	        int b = sc.nextInt();
                int count = 0;
        for(int x = a; x <= b; x++){
                if(x-(x%10000) == x%10 && (x%10000)-(x%1000) == (x%100)-(x%10)){
                count++;
                }
        }
		System.out.println(count);
	}
}