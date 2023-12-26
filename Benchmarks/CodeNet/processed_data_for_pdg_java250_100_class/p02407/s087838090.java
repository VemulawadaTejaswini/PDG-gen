public class Main{
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		  try{
			  String ab = input.readLine();
		      int a=Integer.parseInt(ab);
		      String an=input.readLine();
		      String[] strAry;
	          strAry=an.split(" ");
	          for(int i=a-1; i>=0; i--){
	               int  b=Integer.parseInt(strAry[i]);
	               if(i>0){
	                    System.out.print(b+" ");
	               }else{
	            	   System.out.print(b);
	               }
	        	}
	          System.out.println("");
		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }
	}
}
