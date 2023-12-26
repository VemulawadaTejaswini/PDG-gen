public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int num = 0;
        for(int i= 0; i <= n; i++) {
            if (i%2 != 0) {
                num++;
            }
        }
        double result = (double)num / n;
        System.out.println(result);
    }
}
