public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int date = Integer.parseInt(str.replace("/", ""));
        if (date <= 20190430) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
