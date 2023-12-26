public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String result = "No";
		int c = Integer.valueOf(Integer.toString(a) + Integer.toString(b));
		for(int i = 0; i < c; i++){
		    if(i*i == c) result = "Yes";
		}
		System.out.println(result);
	}
}
