public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        long price  = sc.nextLong();
        long happypoint = 0;
        happypoint = happypoint + (price/500) * 1000;
        price = price % 500;
        happypoint = happypoint + (price/5) * 5;
        System.out.println(happypoint);
        sc.close();
    }
}
