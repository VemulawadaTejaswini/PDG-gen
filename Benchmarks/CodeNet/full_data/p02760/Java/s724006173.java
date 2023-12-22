import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				a[i][j]=sc.nextInt();
			}
		}
		int n=sc.nextInt();
		boolean[][] ch=new boolean[3][3];
		for(int i=0; i<n; i++){
			int b=sc.nextInt();
			for(int j=0; j<3; j++){
				for(int t=0; t<3; t++){
					if(a[j][t]==b){
						ch[j][t]=true;
					}
				}
			}
		}
		for(int i=0; i<3; i++){
			boolean tmp=true;
			for(int j=0; j<3; j++){
				if(!ch[i][j]){
					tmp=false;
				}
			}
			if(tmp){
				System.out.println("Yes");
				return;
			}
		}
		for(int i=0; i<3; i++){
			boolean tmp=true;
			for(int j=0; j<3; j++){
				if(!ch[j][i]){
					tmp=false;
				}
			}
			if(tmp){
				System.out.println("Yes");
				return;
			}
		}
		boolean tmp=true;
		for(int i=0; i<3; i++){
			if(!ch[i][i]){
				tmp=false;
			}
		}
		if(tmp){
			System.out.println("Yes");
			return;
		}
		tmp=true;
		for(int i=0; i<3; i++){
			if(!ch[i][2-i]){
				tmp=false;
			}
		}
		if(tmp){
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
	}
}
