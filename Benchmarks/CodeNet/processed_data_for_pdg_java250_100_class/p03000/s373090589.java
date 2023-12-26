public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		long N =  Long.parseLong(W.split(" ")[0]);
		long X =  Long.parseLong(W.split(" ")[1]);
		String[] Wi = in.readLine().split(" ");
		int n =1;
		long p=0;
		for(int i = 0;i<Wi.length;i++){
			p+=Integer.parseInt(Wi[i]);
			if(p <= X){
				n++;
			}
		}
		System.out.println(n);
	}
}
