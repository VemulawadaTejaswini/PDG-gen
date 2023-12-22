import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = 1;
        Long e,f;
		Long [] in = new Long [a];
        Long [] in2 = new Long [a];
        for(int i=0;i<a;i++){e = sc.nextLong();
                             f = sc.nextLong();
                             in[i] = e-f;
                             in2[i] = e+f;
                            }         
        Arrays.sort(in);
        Arrays.sort(in2);
        Long d = in2[0];
        for(int i=1;i<a;i++){if(d<=in[i]){b++;
                                           d=in2[i];}            
        }
		System.out.println(b);
	}
}
