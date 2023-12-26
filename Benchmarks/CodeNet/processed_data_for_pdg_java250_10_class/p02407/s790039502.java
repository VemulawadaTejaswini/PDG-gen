public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    int n = Integer.parseInt(str);
	    str = br.readLine();
	    String [] ary = str.split(" ");
	    for (int i= n-1; i>=0 ; i--){
	    	if (i !=0 ){
	    	 System.out.print(ary[i]+" ");}
	    	else { System.out.print(ary[i]);
	    	       System.out.print("\n");
	    	}
	     }
	}
	}
