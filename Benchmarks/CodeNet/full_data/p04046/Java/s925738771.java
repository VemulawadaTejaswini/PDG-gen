import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
	int H=sc.nextInt();
	int W=sc.nextInt();
	int A=sc.nextInt();
	int B=sc.nextInt();
	int[] dx={-1,0};
	int[] dy={0,-1};
	int[][] step=new int[W+1][H+1];
	step[1][1]=1;
	for(int i=1;i<=W;i++){
	    for(int j=1;j<=H;j++){
		for(int k=0;k<2;k++){
		    int x=i+dx[k];
		    int y=j+dy[k];
		    if(1<=x&&x<=W&&1<=y&&y<=H&&(!(x<=B&&H-A+1<=y))){
			step[i][j]+=step[x][y]%1000000007;
		    }
		}
	    }
	}
	out.println(step[W][H]%1000000007);
    }
}
