import java.util.*;
import java.io.*;

class Test{
	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String agrfs[])throws Exception{
        StringTokenizer stk=new StringTokenizer(bf.readLine());
      	int A=Integer.parseInt(stk.nextToken());
      	int B=Integer.parseInt(stk.nextToken());
      	if(A>=13){
        	System.out.println(B);
        }else if(A>=6 && A<=12){
        	System.out.println(B/2);
        }else{
        	System.out.println(0);
        }
    }

}