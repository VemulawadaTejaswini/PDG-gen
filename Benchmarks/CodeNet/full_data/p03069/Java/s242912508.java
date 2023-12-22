import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args)throws IOException{
    //BufferedReader br = new BufferedReader(System.in);
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    
    int num = sc.nextInt();
		String[] line = sc.next().split("");
    int cnt = 0;
		int min = num;
		
		for(int i=0; i<num; i++)
		  if(line[i].equals("."))
		  	cnt++;
		
		int sum = cnt;
		for(int i=0; i<num; i++){
		  if(sum < min)
		  	min = sum;
		  if(line[i].equals("#"))
		  	sum++;
		  else sum--;
		}
		
		if(sum < min)
			min = sum;
		
		out.println(min);
    
    out.flush();
  }
}