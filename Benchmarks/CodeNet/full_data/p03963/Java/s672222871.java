public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        System.out.println(k*(long)Math.ceil(n/2.0)*Math.max(((k-1)*(n/2)), 1));
    }
}
