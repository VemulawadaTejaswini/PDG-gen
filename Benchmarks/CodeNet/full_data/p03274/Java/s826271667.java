import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
		    int N  = scanner.nextInt();
		    int K = scanner.nextInt();
		    
		    //連続するK本のろうそくに着けることは明らかである。
		    int[] rousoku = new int[N];
		    
		    for(int i = 0; i < N; i++) 
		    {
		    	rousoku[i] = scanner.nextInt();
		    }
		    //N本のろうそくを読み込んだ。
		    
		    int min = rousoku[K-1] - rousoku[0]+(int)Math.min(Math.abs(rousoku[0]),Math.abs(rousoku[K-1]));
		    //初期は一番左のからK本。一本ずつずらす。
		    
		    for(int j = 0;  K + j <= N; j++ )
		    {
		    	if( rousoku[K+j-1] - rousoku[j]+(int)Math.min(Math.abs(rousoku[j]),  rousoku[K+j-1]) < min)
		    	{
		    		min =  rousoku[K+j-1] - rousoku[j]+(int)Math.min(Math.abs(rousoku[j]),  rousoku[K+j-1]);
		    	}
		    }
		    
		    System.out.println(min);
		    
		    scanner.close(); }
		  }
