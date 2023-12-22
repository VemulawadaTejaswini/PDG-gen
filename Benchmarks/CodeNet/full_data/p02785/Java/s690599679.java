import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
		Long [] in = new Long [a];
        for(int i=0;i<a;i++){in[i] = sc.nextLong();
                            }
        Arrays.sort(in);
		Long c = in[0]-in[0];
        for(int i=0;i<a-b;i++){c+=in[i];}      
		System.out.println(c);
	}
}
