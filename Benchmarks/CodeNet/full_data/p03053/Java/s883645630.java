import java.util.*;

public class Main{
	static int[][] check = new int[1500][1500];
	static int[][] distance = new int[1500][1500];
	static int h,w;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	 h = sc.nextInt();
	 w = sc.nextInt();
	char[][] a = new char[1500][1500];
	int max=0;
	String moji;
	for(int i=0;i<h;i++){
		moji = sc.next();
		for(int j=0;j<w;j++){
			distance[i][j]=0;
			check[i][j]=0;
			a[i][j]=moji.charAt(j);
			if(a[i][j]=='#') check[i][j]=1;
		}
	}

	for(int i=0;i<h;i++){
		for(int j=0;j<w;j++){
			if(check[i][j]!=1) {
				serch(i,j);
			}
			//System.out.print(distance[i][j]);
			if(max<distance[i][j]) max=distance[i][j];
		}
		//System.out.println();
	}
	System.out.println(max);
	}
	
	 static void serch(int i,int j){
		 check[i][j]=-1;
		if(i>0&&check[i-1][j]==0) serch(i-1,j);
		if(i<h-1&&check[i+1][j]==0) serch(i+1,j);  
		if(j>0&&check[i][j-1]==0) serch(i,j-1);
		if(j<w-1&&check[i][j+1]==0) serch(i,j+1);
		int min=h+w;
		if(i>0&&min>distance[i-1][j]&&check[i-1][j]==1) min=distance[i-1][j];
		if(i<h-1&&min>distance[i+1][j]&&check[i+1][j]==1) min=distance[i+1][j];
		if(j>0&&min>distance[i][j-1]&&check[i][j-1]==1) min=distance[i][j-1];
		if(j<w-1&&min>distance[i][j+1]&&check[i][j+1]==1) min=distance[i][j+1];
		distance[i][j]=min+1;
		if(min!=h+w) check[i][j]=1;
		else check[i][j]=0;
	}
}

