public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		if(a > b){
		    result = a + a - 1;
		}else if(a < b){
		    result = b + b - 1;
		}else{
		    result = a + b;
		}
        System.out.println(result);
	}
}
