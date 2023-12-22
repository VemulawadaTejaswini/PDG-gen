import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
  		int[][] s=new int[m][n];
  		int k=0;
  		for(int c=0;c<m;c++){
          k=sc.nextInt();
          for(int d=0;d<k;d++){
    		s[c][d]=sc.nextInt();
          }
    	}

  		int[] p=new int[m];
		for(int c=0;c<m;c++){
    		p[c]=sc.nextInt();
    	}
  		int ans=0;
    	for(int i=0;i<(1<<n);i++){
        	for(){
            }
        }
 	

    	System.out.println(ans);
    }
}