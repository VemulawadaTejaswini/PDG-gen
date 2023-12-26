public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println( ( x * 4 < y || x * 2 > y ||  y % 2 == 1 ) ? "No" : "Yes" );
        sc.close();
    }
}
