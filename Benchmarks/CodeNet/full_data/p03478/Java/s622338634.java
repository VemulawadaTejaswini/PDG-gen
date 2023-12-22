import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();  
        int b = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++) {
        	int x = (i/10000)+(i%1000/1000)+(i%1000/100)+(i%100/10)+(i%10);
        if(x>=a&&x<=b){
        	sum+=i;
        }
        if(i==n) {
        	System.out.println(sum);
        }
        }
        }
}