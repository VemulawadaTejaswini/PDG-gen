import java.util.Scanner;


public class Main {
	
	static int[][] memory;
	
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
   
        int[][] number =new int[H*W+1][2];
        
        int count = 0;
        int[] member = new int[5];
        
        for(int i = 0;i<H;i++){
        	
        	for(int j=0;j<W;j++){
        		
        		int current_number = sc.nextInt();
        		number[current_number][0]= i;
        		number[current_number][1]= j;
        	}
        	
        	
        }
        
        int Q = sc.nextInt();
        int[] ans = new int[Q];
        
        for(int i=0;i<Q;i++){
        	int L = sc.nextInt();
        	int R = sc.nextInt();
        	
        	
        	for(int j=0;L!=R;L+=D){
        		
        		
        		
        		ans[i] += Math.abs(number[L][0]-number[L+D][0]);
        		ans[i] += Math.abs(number[L][1]-number[L+D][1]);
        		
        		
        	}
        	
        }
        
        for(int i=0;i<Q;i++)System.out.println(ans[i]);
        		
	}

		

    
}