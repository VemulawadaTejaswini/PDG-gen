public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); 
        int B = scanner.nextInt(); 
        int C = scanner.nextInt(); 
        int X = scanner.nextInt(); 
        int count = 0;
        for (int s=0; s <= A; s++) {
            for (int t=0; t <= B; t++) {
                for (int u=0; u <= C; u++) {
                    if (500 * s + 100 * t + 50 * u == X) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
