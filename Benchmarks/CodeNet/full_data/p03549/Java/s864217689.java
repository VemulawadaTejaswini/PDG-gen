import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ihund = n-m;
		int kaitoums = m * 1900 + ihund * 100;
		for(;m>0;m--){
			kaitoums *= 2;
		}
		System.out.println(kaitoums);
    }
}
