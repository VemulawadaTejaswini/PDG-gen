import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
  
  	static int end = 0;
  	static int start = -1;
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	String line = sc.nextLine();
      	long n = sc.nextLong();
      
      	boolean flag = true;
      	for(int i = 1; i < line.length()-1; i++)
          if(line.charAt(i) != line.charAt(i-1)){
            if(start < 0) start = i;
            flag = false;
          }
      
      	if(flag){
          System.out.println(line.length()*(n/2));
        }else{
        	if(line.charAt(0) == line.charAt(line.length()-1)){
              long c = (start+end)%2 == 0? n-1: 0;
              System.out.println(count(line)*n + c);
            }else
              System.out.println(count(line)*n) ;
        }  	  
    }
  
  	static long count(String line){
      	int i = 1;
    	long count = 0;
    	while(i <= line.length()-1){
    		if(line.charAt(i-1) == line.charAt(i)){
              count++;
              i += 2;
              end = i;
            }else{
              i++;
            }
    	}
    	return count;
    }
}