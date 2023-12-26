public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(),j;
		if (n % 2 == 0){
			j = n/2;
		}else{
			j = 1 + (n -1 )/2;
		}
		float x = (float)j/n;
		System.out.println(x);
	}
}
