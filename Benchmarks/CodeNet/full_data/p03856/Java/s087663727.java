import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;




public class Main {
	   static int N=1010;
	   static int n;
	   static Double []x=new Double[N];
	   static Double []y=new Double[N];
	   static Double []r=new Double[N];
	   static Double []dist=new Double[N];
	   static Double [][]map1=new Double[N][N];
	   static int[] vis=new int[N];
	   
       public static void main(String[] args) {
          Scanner input=new Scanner( System.in);
          String string =input.next();
        
          int len=string.length();
          string+="       ";
          String s1="dream",s2="erase";
          int flag=1;
          for(int i=0;i<len;i++)
           {
        	  if(flag==0) break;
        	  
        	  if(string.charAt(i)=='d') {
        		  
        		  int j;
        		  for(j=i+1;j<=i+4;j++){
        			 if(string.charAt(j)!=s1.charAt(j-i)){
        				 flag=0;
        				 break;
        			 }
        		   }
        		  if(flag==0) break;
        		  i=j;
                  if(string.charAt(i)=='e'&&string.charAt(i+1)=='r')
                  {
                	  if(string.charAt(i+2)=='e'||string.charAt(i+2)=='d'||i+2==len)
                	  {
                		  i=i+1;
                	  }
                	  else i=j-1;
            
                  }
                  else
                	  i=j-1;
               }
        	  else if(string.charAt(i)=='e'){
        		  int j;
        		  for(j=i+1;j<=i+4;j++)
        		  {
        			 if(string.charAt(j)!=s2.charAt(j-i)){
        				 flag=0;
        				 break;
        			 }
        		   }
        		  if(flag==0) break;
        		  i=j;
        		  //System.out.println(i);
                  if(string.charAt(i)=='r')
                  {
                	  if(string.charAt(i+1)=='e'||string.charAt(i+1)=='d'||i+1==len)
                	  {
                		  i=i;
                	  }
                	  else i=j-1;
            
                  }
                  else i=j-1;
        	  }
        	  else {
        		 flag=0;
 				 break;
			  }
        	  //System.out.println(i);
        	  if(flag==0) break;
           }
          if(flag==0)
        	  System.out.println("NO");
          else
        	  System.out.println("YES");
     //  System.out.printf("%.10f",dist[2]);
          
	}

}
