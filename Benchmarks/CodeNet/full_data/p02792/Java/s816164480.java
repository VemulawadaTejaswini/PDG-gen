import java.util.*;
	
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] kami = new int[10][10];
        
        int k,s,tmp;
        for(int i=1;i<N+1;i++) {
        	s=i%10;
        	tmp=i;
        	while(tmp>=10) {
        		tmp=tmp/10;
        	}
        	k=tmp;
        	kami[k][s]=kami[k][s]+1;        	
        }
        long ans=0;
        for(int i=0;i<10;i++) {
        	for(int j=0;j<10;j++) {
            	ans=ans+kami[i][j]*kami[j][i];        		
        	}
        }
        System.out.println(ans);
    }
 

}