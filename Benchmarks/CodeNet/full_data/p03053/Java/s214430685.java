import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int h = sc.nextInt();
	int w = sc.nextInt();
	int count=0,connect=0;
	char[][] a = new char[1500][1500]; 
	int[][] b = new int[1500][1500];
	String moji;
	for(int i=0;i<h;i++){
		moji = sc.next();
		for(int j=0;j<w;j++){
			a[i][j]=moji.charAt(j);
		}
	}
	while(true){
		connect=0;
		for(int i=0;i<h;i++) for(int j=0;j<w;j++) b[i][j]=0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(a[i][j]=='#'&&b[i][j]==0){
					if(i>=1&&a[i-1][j]=='.'){
						 a[i-1][j]='#';
						 b[i-1][j]++;
						 connect++;
					}
					if(i<h-1&&a[i+1][j]=='.'){
						 a[i+1][j]='#';
						 b[i+1][j]++;
						 connect++;
					}
					if(j>=1&&a[i][j-1]=='.'){
						a[i][j-1]='#';
						b[i][j-1]++;
						connect++;
					}
					if(j<w-1&&a[i][j+1]=='.'){
						a[i][j+1]='#';
						b[i][j+1]++;
						connect++;
					}  
				}
			}
		}
		if(connect==0)break;
		count++;
	}
	System.out.println(count);
    }
}

