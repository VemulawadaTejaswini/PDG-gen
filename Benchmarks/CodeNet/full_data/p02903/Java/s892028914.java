//第 4 問: ABC 087 B - Coins (200 点)
     
    import java.util.Scanner;
     
    public class TEST1{
     
    	public static void main(String[] args){
     
    		Scanner scan = new Scanner(System.in);
     
    		int H,W,A,B = 0;
     
    		H = scan.nextInt();
    		W = scan.nextInt();
    		A = scan.nextInt();
    		B = scan.nextInt();
     
    		scan.close();
     
    		for(int i=0; i < H; i++)
    		{
    			for(int j=0; j < W; j++)
    			{
    				if( (j<A && i<B) || (j>=A && i>=B) ){
    					System.out.print(1);
    				}
     
    				/*
    				else if(j>=A && i>=B) {
    					System.out.print(1);
    				}
    				*/
     
    				else
    				{
    					System.out.print(0);
    				}
    			}
    			 System.out.println();
    		}
    	}
    }
     
