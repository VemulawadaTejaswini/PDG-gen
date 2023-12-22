import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int[][] A = new int[3][3];
	for(int i=0;i<3;i++){
	    for(int j=0;j<3;j++){
		A[i][j] = stdIn.nextInt();
	    }
	}
	int N = stdIn.nextInt();
	for(int k=0;k<N;k++){
	    int b = stdIn.nextInt();
	    for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		    if(b==A[i][j]){
			A[i][j]=0;
		    }
		}
	    }
	}
	
	boolean flag=false;
	for(int i=0;i<3;i++){
	    if(A[i][0]==0&&A[i][1]==0&&A[i][2]==0){
		flag=true;
	    }
	    if(A[0][i]==0&&A[1][i]==0&&A[2][i]==0){
		flag=true;
	    }
	}
	if(A[0][0]==0&&A[1][1]==0&&A[2][2]==0){
	    flag=true;
	}	
	if(A[2][0]==0&&A[1][1]==0&&A[0][2]==0){
	    flag=true;
	}
	if(flag==true){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}