public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        int yyyy = Integer.valueOf(time.substring(0,4)).intValue();
        int mm = Integer.valueOf(time.substring(5,7)).intValue();
        int dd = Integer.valueOf(time.substring(8,10)).intValue();
        if (2019 < yyyy) {
            System.out.println("TBD");
        } else if (2019 == yyyy) {
            if (4 < mm) {
                System.out.println("TBD");
            } else {
                System.out.println("Heisei");
            }
        } else {
            System.out.println("Heisei");
        }
    }
}
