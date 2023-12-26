public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String output = "No";
        main:
        for (int i = 1; i <= 9; i ++) {
            for (int j = i; j <= 9; j ++) {
                if (i * j == n) {
                    output = "Yes";
                    break main;
                }
            }
        }
        System.out.println(output);
    }
}
