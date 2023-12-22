import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
        int b = 0;		
        for(int i=0;i<a-1;i++){for(int j=i+1;j<a;j++){b+=in[i]*in[j];                             
                                                     }
                              }      
		System.out.println(b);
	}
}
