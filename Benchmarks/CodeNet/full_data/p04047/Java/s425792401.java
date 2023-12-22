import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [2*a];

        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
        Arrays.sort(in);
        int b = 0;
        for(int i=0;i<a;i++){
                             b+=in[2*i];
                            }
		System.out.println(b);
	}
}
