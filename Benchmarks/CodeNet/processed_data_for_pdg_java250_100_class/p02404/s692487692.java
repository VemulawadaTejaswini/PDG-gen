public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		  try{
			  while(true){
			     String ab = input.readLine();
		         String []strAry = ab.split(" ");
		         int  a=Integer.parseInt(strAry[0]);
	             int b=Integer.parseInt(strAry[1]);
	             int count=0;
	             int countb=0;
	              if(a==0&&b==0){
	        	      break;
	               }
	                  for(int i=0; i<a; i++){
	                	  countb=0;
	        	          for(int j=0; j<b; j++){
	        	        	  if(count==a-1||count==0){
	        	                 System.out.print('#');
	        	        	  }else{
	        	        		  countb++;
	        	        		  if(countb==1||countb==b){
	        	        			  System.out.print('#');
	        	        		  }else{
                                       System.out.print('.');
	        	        		  }
	        	        	  }
	        	           }
	        	          count++;
	        	          System.out.println("");
	                  }
	                  System.out.println("");
	              }
		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }
	}
}
