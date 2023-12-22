import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 1000000001;
        for(int i=0; i<n; i++){
                int temp = sc.nextInt();
                max = Math.max(max, temp);
                min = Math.min(min, temp);
        }
        System.out.println(max-min);
    }
}
