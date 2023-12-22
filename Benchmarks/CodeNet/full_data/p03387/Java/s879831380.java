import java.util.*;
public class Main {
		public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
        int a[] =new int [3];
				Arrays.sort(a);
				if((a[3]-a[1]+a[3]-a[2]) % 2 ==0){
						System.out.println(a[3]-a[1]+a[3]-a[2]) / 2);
				}
				else{
						a[3] += 1;
						a[2] += 1;
						System.out.println(a[3]-a[1]+a[3]-a[2]) / 2 + 1);
				}
