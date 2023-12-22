import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
		int [] in = new int [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                             c+=in[i];
                            }
		Arrays.sort(in);
        
		double d = c/(4*a);
        if(in[a-b]<d){System.out.println("No");}
		else{System.out.println("Yes");}
	}
}
