public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i = 1;
        while(true) {
            int x = i;
            int  END_CHECK_NUM=0;
            if (x % 3 == 0) {
                System.out.print(" " + i);
                END_CHECK_NUM=1;
            }
            while(END_CHECK_NUM==0) {
                if (x % 10 == 3) {
                    System.out.print(" " + i);
                    break;
                }
                x /= 10;
                if (x==0)break;
            }
            if (++i > n) break;
        }
        System.out.println();
    }
}
