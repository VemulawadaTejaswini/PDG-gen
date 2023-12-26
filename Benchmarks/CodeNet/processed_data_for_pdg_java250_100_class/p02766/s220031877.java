public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int digit = 0;
        while(N != 0){
            N = N/K;
            digit++;
        }
        System.out.println(digit);
    }
}
