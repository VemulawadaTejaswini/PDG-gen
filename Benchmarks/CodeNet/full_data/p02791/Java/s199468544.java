import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        for(int i=0;i<a;i++){in[i] = sc.nextInt();
                            }
        int b = 0;
		int c = in[0];
        for(int i=0;i<a;i++){c=Math.min(c,in[i]);if(c>=in[i]){b++;
                                                 }
                            }                              
		System.out.println(b);
	}
}
