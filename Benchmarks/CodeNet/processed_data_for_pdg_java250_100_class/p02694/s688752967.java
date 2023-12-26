public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        sc.close();
        long amount = 100;
        int count = 0;
        while (amount < x) {
            amount += amount / 100;
            count++;
        }
        int result = count;
        System.out.println(result);
    }
}
