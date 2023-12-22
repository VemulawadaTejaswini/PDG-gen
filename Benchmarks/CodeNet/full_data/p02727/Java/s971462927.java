import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
		int e = sc.nextInt();
        int f = 0;
		long [] in = new long [c];
        long [] in2 = new long [d];
        long [] in3 = new long [e];
        long [] in4 = new long [a+b+e];
        for(int i=0;i<c;i++){
                             in[i] = sc.nextLong();
                            }
        for(int i=0;i<d;i++){
                             in2[i] = sc.nextLong();
                            }
        for(int i=0;i<e;i++){
                             in3[i] = sc.nextLong();
                            }
		Arrays.sort(in);
        Arrays.sort(in2);
        Arrays.sort(in3);
        for(int i=0;i<a;i++){
                             in4[i] = in[c-a+i];
                            }
        for(int i=0;i<b;i++){
                             in4[a+i] = in2[d-b+i];
                            }
        for(int i=0;i<e;i++){
                             in4[a+b+i] = in3[i];
                            }
        Arrays.sort(in4);
        for(int i=e;i<a+b+e;i++){ans+=in4[i];}  
		System.out.println(ans);
	}
}
