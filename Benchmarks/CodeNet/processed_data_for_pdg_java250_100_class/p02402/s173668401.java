public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
        int[] n = new int[X];
        long sum = 0;
        for(int i = 0; i < X; i++){
        	n[i] = scan.nextInt();
        	sum = sum + n[i];
        }
        Arrays.sort(n);
        System.out.print(String.format("%d", n[0]));
        System.out.print(" ");
        System.out.print(String.format("%d", n[X-1]));
        System.out.println(" " + sum);
	}
}
