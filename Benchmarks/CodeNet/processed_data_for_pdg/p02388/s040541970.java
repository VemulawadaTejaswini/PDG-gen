public class Main{
	public static void main (String[] args) {
	    long x1 = 1;
	    try{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		long x = Long.parseLong(br.readLine());
		if(x <= 100 && 1 <= x){
		for(int i=0; i<3; i++){
		x1 = (long)x1 * x;
		}
		System.out.println(x1);
		}else{
		}
	    }catch(IOException e){
	    }
	}
}
