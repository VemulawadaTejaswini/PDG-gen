public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double def = 100;
        long x = sc.nextLong();
        boolean flg = true;
        int count = 0;
        while(flg) {
            def = Math.floor(1.01 * def);
            count++;
            if (x <= def) {
                flg = false;
            }
        }
        System.out.println(count);
    }
}
