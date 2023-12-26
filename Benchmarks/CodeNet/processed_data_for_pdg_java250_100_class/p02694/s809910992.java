public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = Long.parseLong(sc.next());
        double money = 100.0;
        double rate = 1.01;
        int count = 0;
        while(money <= X) {
            money = Math.floor(money);
            money = money * rate;
            count++;
        }
        System.out.println(count);
    }
}
