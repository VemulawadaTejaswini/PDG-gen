public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
          int value = sc.nextInt();
          x -= value;
          if (value < min) {
            min = value;
          }
        }
        int ans = n;
		System.out.println(n + (int)Math.floor(x / min));
	}
}
