import java.util.*;
    public class Main{
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    
	    int numM = scan.nextInt();
	    int[] numArray = new int[numM]; 
	    
	    int snk = 0;
	    int[] answer = new int[numM];
	    int minDif;
		for(int i = 0; i < numM;i++){
		    numArray[i] = scan.nextInt();
		}
		for(int j = 0; j < numM; j++){
		    
		    for(int i =0; i <numM; i++){
			snk = snk + Math.abs(numArray[i] - (i+1+j));
		    }
		    answer[j] = snk;
		    snk = 0;
		}
		minDif = answer[0];
		for(int i =1; i <numM; i++){
		    if(minDif > answer[i]){
			minDif = answer[i];
		    }
		}
		System.out.println(minDif);
		
	    
	   
	}
    }

