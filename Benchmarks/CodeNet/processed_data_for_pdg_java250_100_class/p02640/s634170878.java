public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();
        String ans = "No";
        for (int i = 0; i < x + 1; i++){
          Integer sum = 2 * i + 4 * (x - i);
          if (sum == y)
            ans = "Yes";
        }
		System.out.println(ans);
	} 
}
