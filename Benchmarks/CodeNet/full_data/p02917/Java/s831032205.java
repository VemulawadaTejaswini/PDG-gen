import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ans = 0;
        int [] b = new int [a+1];
        b[0]=100000;
        b[a]=100000;
        for(int i=1;i<a;i++){
                             b[i] = sc.nextInt();
                            }
        for(int i=0;i<a;i++){ans+=Math.min(b[i],b[i+1]);
                            }       
		System.out.println(ans);
	}
}
