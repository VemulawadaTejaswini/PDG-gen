public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int X = scan.nextInt();
        for(int i = X - (K - 1); i < X + K; i++){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
