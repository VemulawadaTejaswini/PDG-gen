public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ab=reader.readLine().split(" ");
        int a=Integer.parseInt(ab[0]);
        int b=Integer.parseInt(ab[1]);
        if(a<b){
        	System.out.println("a < b");
        }else if(a>b){
        	System.out.println("a > b");
        }else{
        	System.out.println("a == b");
        }
	}
}
