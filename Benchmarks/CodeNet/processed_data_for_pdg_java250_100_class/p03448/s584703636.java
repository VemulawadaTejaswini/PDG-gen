public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine()); 
        int b = Integer.parseInt(scanner.nextLine()); 
        int c = Integer.parseInt(scanner.nextLine()); 
        int x = Integer.parseInt(scanner.nextLine());
        int answer = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    if (i * 500 + j * 100 + k * 50 == x) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
        scanner.close();
    }
}
