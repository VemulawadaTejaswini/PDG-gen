package marksProject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.io.*;

class studentMarks {

	public static void main(String[] args) throws Exception{
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String tests = br.readLine();
				if(tests.length()==1){
		          System.out.println("No");
		        } else{
		          if(tests.length()%2==0){
		            int i=0;
		            while(i<tests.length()){
		              String temp=tests.substring(i,2);
		              if(!temp.equals("hi")){
		                break;
		              }
		              i=i+2;
		            }
		            if(i>tests.length()){
		               System.out.println("Yes");
		            }
		            
		          } else{
		            System.out.println("No");
		          }
		          
		        }
		                             
		    }

}
