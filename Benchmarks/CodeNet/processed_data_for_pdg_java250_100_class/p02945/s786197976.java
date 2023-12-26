public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = a + b;
        int m = a - b;
        int t = a * b;
        int values[] = {p, m, t};
        int max      = values[0];
        for (int index = 1; index < values.length; index ++) {
            max = Math.max(max, values[index]);
        }
        System.out.println(max);
	}
}
