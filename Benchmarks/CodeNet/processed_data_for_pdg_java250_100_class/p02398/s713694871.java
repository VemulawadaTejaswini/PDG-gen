public class Main {
	public static void main(String[] args)throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = br.readLine();
	    line = line.trim();
	    String[] readLineArray = line.split("[\\s+]");
	    int count = 0;
	    int a = Integer.parseInt(readLineArray[0]);
	    int b = Integer.parseInt(readLineArray[1]);
	    int c = Integer.parseInt(readLineArray[2]);
	    for (int i = a;i<=b;i++){
	    	if(c%i ==0){
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}
}
