public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ", 0);
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		if(a < b){
		 System.out.println("a < b");
		}else if(a > b){
		 System.out.println("a > b");
		}else{
		 System.out.println("a == b");
		}
	}
}
