import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = 1;
        Long c = 0;
        Long d = 0;
        Long e,f;
		Long [][] in = new Long [a][2];
        for(int i=0;i<a;i++){e = sc.nextLong();
                             f = sc.nextLong();
                             in[i][0] = e-f;
                             in[i][1] = e+f;
                            }
        Arrays.sort(in[][1]);
         for(int i=1;i<a;i++){if(d<=in[i][0]){b++;
                                             d=in[i][1];}
            
         }
		System.out.println(b);
	}
}
