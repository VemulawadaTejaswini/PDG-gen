import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int X = sc.nextInt();
      	int Y = sc.nextInt();
      	int Z = sc.nextInt();
      
      	int[] S=new int[3];
        S[0]=X;
        S[1]=Y;
        S[2]=Z;
        
        int temp=S[0];
        S[0]=S[1];
        S[1]=temp;
        
        int tem=S[0];
        S[0]=S[2];
        S[2]=tem;
        
		for(int i=0;i<3;i++){
        System.out.println(S[i]);
        }
		
	}
}