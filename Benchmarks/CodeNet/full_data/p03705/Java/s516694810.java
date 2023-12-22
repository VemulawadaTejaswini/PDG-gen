import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    char[] building = br.readLine().toCharArray();
	    int sum = 0;
	    int length = building.length;
	    if(length > 5000){}
	    for(int i = 1;i<=length;i++){
	        if(building[i-1] == 'U'){
	            sum += (i - 1) * 2;
	            sum += length - i;
	        }
	        else if(building[i-1] == 'D'){
	            sum += i - 1;
	            sum += (length - i) * 2;
	        }
	    }}
	    else{
	    for(int i = 0;i<length;i++){
	        for(int l = 0;l<length;l++){
	            if(i == l) continue;
	            if((i < l && building[i] == 'D') || (i > l && building[i] == 'U')){
	                sum += 2;
	            }
	            else{
	                sum++;
	            }
	        }
	    }
	    }
	    System.out.println(sum);
	}
	    
}
