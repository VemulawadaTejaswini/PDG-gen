import java.util.*;
import java.io.*;
 
public class Main {
	
	
	public static int cusumCount(int[][] cusum, int x, int y){
		if(x>=0&&y>=0) return cusum[x][y];
		else return 0;
	}
	public static int cusumCount(int[][] cusum, int x1,int y1, int x2, int y2){
		return cusumCount(cusum,x2,y2) - cusumCount(cusum,x1-1,y2) - cusumCount(cusum,x2,y1-1) + cusumCount(cusum,x1-1,y1-1);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        final int Q = sc.nextInt();
        sc.nextLine();
        boolean[][] blue = new boolean[N][M];
        //[0][0]   [0][1]   [0][2] ... [0][M-1]
        //[1][0]   [1][1]   [1][2] ... [1][M-1]
        // :
        // :
        //[N-1][0] [N-1][1]   ...... [N-1][M-1]
        
        
        for(int n=0;n<N;n++){
        	String row = sc.nextLine();
        	for(int m=0;m<M;m++){
        		blue[n][m] = (row.charAt(m)=='1');
        	}
        }
        int[][] blueCUSUM = new int[N][M];
        //the number of blue cell in [0][0]~[n][m]
        for(int n=0;n<N;n++){
        	for(int m=0;m<M;m++){
        		if(n==0){
        			if(m==0){
        				if(blue[n][m])blueCUSUM[n][m]=1;
        				else blueCUSUM[n][m]=0;
        			}else{
        				if(blue[n][m])blueCUSUM[n][m]=blueCUSUM[n][m-1]+1;
        				else blueCUSUM[n][m] = blueCUSUM[n][m-1];
        			}
        		}else{
        			if(m==0){
        				if(blue[n][m])blueCUSUM[n][m]=blueCUSUM[n-1][m]+1;
        				else blueCUSUM[n][m] = blueCUSUM[n-1][m];
        			}else{
        				if(blue[n][m])blueCUSUM[n][m]=blueCUSUM[n-1][m]+blueCUSUM[n][m-1]-blueCUSUM[n-1][m-1]+1;
        				else blueCUSUM[n][m]=blueCUSUM[n-1][m]+blueCUSUM[n][m-1]-blueCUSUM[n-1][m-1];
        			}
        		}
        	}
        }
        
        boolean[][] rowJoint = new boolean[N][M-1]; //-
        for(int n=0;n<N;n++){
        	for(int m=0;m<M-1;m++){
        		rowJoint[n][m] = (blue[n][m]&&blue[n][m+1]);
        	}
        }
        int[][] rowCUSUM = new int[N][M-1];
        for(int n=0;n<N;n++){
        	for(int m=0;m<M-1;m++){
        		if(n==0){
        			if(m==0){
        				if(rowJoint[n][m])rowCUSUM[n][m]=1;
        				else rowCUSUM[n][m]=0;
        			}else{
        				if(rowJoint[n][m])rowCUSUM[n][m]=rowCUSUM[n][m-1]+1;
        				else rowCUSUM[n][m] = rowCUSUM[n][m-1];
        			}
        		}else{
        			if(m==0){
        				if(rowJoint[n][m])rowCUSUM[n][m]=rowCUSUM[n-1][m]+1;
        				else rowCUSUM[n][m] = rowCUSUM[n-1][m];
        			}else{
        				if(rowJoint[n][m])rowCUSUM[n][m]=rowCUSUM[n-1][m]+rowCUSUM[n][m-1]-rowCUSUM[n-1][m-1]+1;
        				else rowCUSUM[n][m]=rowCUSUM[n-1][m]+rowCUSUM[n][m-1]-rowCUSUM[n-1][m-1];
        			}
        		}
        	}
        }
        
        
        boolean[][] colJoint = new boolean[N-1][M]; //|
        for(int n=0;n<N-1;n++){
        	for(int m=0;m<M;m++){
        		colJoint[n][m] = (blue[n][m]&&blue[n+1][m]);
        	}
        }
        int[][] colCUSUM = new int[N-1][M];
        for(int n=0;n<N-1;n++){
        	for(int m=0;m<M;m++){
        		if(n==0){
        			if(m==0){
        				if(colJoint[n][m])colCUSUM[n][m]=1;
        				else colCUSUM[n][m]=0;
        			}else{
        				if(colJoint[n][m])colCUSUM[n][m]=colCUSUM[n][m-1]+1;
        				else colCUSUM[n][m] = colCUSUM[n][m-1];
        			}
        		}else{
        			if(m==0){
        				if(colJoint[n][m])colCUSUM[n][m]=colCUSUM[n-1][m]+1;
        				else colCUSUM[n][m] = colCUSUM[n-1][m];
        			}else{
        				if(colJoint[n][m])colCUSUM[n][m]=colCUSUM[n-1][m]+colCUSUM[n][m-1]-colCUSUM[n-1][m-1]+1;
        				else colCUSUM[n][m]=colCUSUM[n-1][m]+colCUSUM[n][m-1]-colCUSUM[n-1][m-1];
        			}
        		}
        	}
        }
        
        
        
        for(int q=0;q<Q;q++){
        	int x1 = sc.nextInt()-1;
        	int y1 = sc.nextInt()-1;
        	int x2 = sc.nextInt()-1;
        	int y2 = sc.nextInt()-1;
        	
        	int bCount = cusumCount(blueCUSUM,x1,y1,x2,y2);
        	int rCount = cusumCount(rowCUSUM,x1,y1,x2,y2-1);
        	int cCount = cusumCount(colCUSUM,x1,y1,x2-1,y2);
        	System.out.println(bCount - rCount - cCount);
        }
        
        
    }
}