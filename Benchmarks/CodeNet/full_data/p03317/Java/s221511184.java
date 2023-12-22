public class Main {
    private static java.util.Scanner sc = new java.util.Scanner(System.in);
    public static void main(String[] args) {
    	int n=sc.nextInt();
    	double k=sc.nextDouble();
        System.out.println((int)Math.ceil((n - 1)/(k- 1)));
    }
}
