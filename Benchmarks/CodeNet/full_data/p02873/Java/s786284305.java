import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s=sc.next();
        ArrayList<String> a=new ArrayList<String>();
       int n=s.length();
       for(int i=0;i<n;i++){
        	a.add(String.valueOf(s.charAt(i)));
       } 
      
      //ArrayList<Long> num=new ArrayList<Long>();
      int[] num=new int[n+1];
      for (int i=0;i<n;i++){
        if(i==0){
        	if(a.get(0).equals("<")){
              num[0]=0;
            }else{
            	continue;
            }
        }else if(a.get(i-1).equals(">")&&a.get(i).equals("<")){	//><
        	num[i]=0;
            int j=i-1;
        	while(j>=0&& a.get(j).equals(">") ){	//  >が続く限り増加
               	num[j]=Math.max(num[j+1]+1,num[j]);
               	j--;
        	}
        }else if(a.get(i).equals("<")){	//<<
        	num[i]=num[i-1]+1;
        }else if(a.get(i-1).equals("<") && a.get(i).equals(">")){		//<>
        	num[i]=num[i-1]+1;
        }   
      }
      
          	if(a.get(n-1).equals("<")){
              	num[n]=num[n-1]+1;
            }else{
            	num[n]=0;
                int j=n-1;
        	    while(j>=0&& a.get(j).equals(">") ){	//  >が続く限り増加
               		num[j]=Math.max(num[j+1]+1,num[j]);
               		j--;
        		}
            }
        
      long o=0;
      for (int i=0;i<n+1;i++){
          System.out.println(num[i]);
          o+=num[i];
      }
      System.out.println(o);
    }  
}