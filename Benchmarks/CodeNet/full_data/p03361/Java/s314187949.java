import java.util.*;

public class Main {
	public static void check(int h,int w,char c[][]){
		for(int i=0;i<h+2;i++){
			if(i==0||i==h+1)continue;
				for(int j=0;j<w+2;j++){
					if(c[i][j]=='.'||j==0||j==w+1){
						continue;
					}else{
						if(c[i+1][j]=='#'||c[i-1][j]=='#'||c[i][j+1]=='#'||c[i][j-1]=='#'){
							continue;
						}else{
							System.out.print("No");
							return;
							}
					}
	          }
		}
		System.out.print("Yes");
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int H=s.nextInt();
		int W=s.nextInt();
		String st[]=new String[H+2];
		char c[][]=new char[H+2][W+2];
        System.out.println();
		for(int i=0;i<H+1;i++){
			st[i]=s.nextLine();
		}
		
		for(int i=1;i<H+1;i++){
			for(int j=1;j<W+1;j++){
				c[i][j]=st[i].charAt(j-1);
			}
		  }
		 Main a=new Main();
		 a.check(H,W,c);
		}
	}