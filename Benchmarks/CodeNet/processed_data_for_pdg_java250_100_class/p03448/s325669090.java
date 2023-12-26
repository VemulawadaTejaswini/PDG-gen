public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= A; i++) { 
            for (int j = 0; j <= B; j++) { 
                for (int k = 0; k <= C; k++) { 
                    int candidate = 500*i + 100*j + 50*k;
                    if (candidate == X) count++;
                }
            }
        }
        System.out.println(count);
    }
}
