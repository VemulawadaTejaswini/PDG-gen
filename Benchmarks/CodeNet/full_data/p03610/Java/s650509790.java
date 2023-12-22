import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] p = new int[s];
        int pl = 2;
        int res = 0;
        
        for(int i = 0; i < s; i++){

        	res = p[i];
        	i++;
        	} 
        System.out.println(res);
    }
}