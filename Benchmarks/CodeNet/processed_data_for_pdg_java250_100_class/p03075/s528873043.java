public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = 0;
        for (int i = 0; i < 4; i++) {
            max = sc.nextInt();
        }
        int k = sc.nextInt();
        if (k < max - min) {
            System.out.print(":(");
        } else {
            System.out.print("Yay!");
        }
    }
}
