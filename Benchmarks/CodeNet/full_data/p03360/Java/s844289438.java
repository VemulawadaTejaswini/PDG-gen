import java.util.*;

public class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int[] table = new int[3];
	int temp = 0;
	
	for(int i=0;i<3;i++){
	    table[i] = sc.nextInt();
	}
	
	int k = sc.nextInt();

	for(int i=0;i<2;i++){
	    
	    for(int j=i+1;j<3;j++){
		if(table[i]<table[j]){
		    temp = table[i];
		    table[i] = table[j];
		    table[j] = temp;
		}
	    }
	}


      	for(int j=0;j<k;j++){
	    
		if(table[0]>table[1]){
		    table[0] = table[0] * 2;
		}else{
		    table[1] = table[1]*2;
		    temp = table[0];
		    table[0] = table[1];
		    table[1] = temp;
		}
	    
	}

	int sum = 0;

	for(int i=0;i<3;i++){
	
	    sum = sum + table[i];
	}
      	System.out.println(sum);
    }
}
