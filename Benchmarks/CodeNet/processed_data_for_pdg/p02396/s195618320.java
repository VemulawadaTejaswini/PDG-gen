public class Main{
        public static void main(final String[] args){
            final Scanner sc = new Scanner(System.in);
            for(int i = 1; ; i++){
                int x = sc.nextInt();
                if(x == 0){
                    break;
                }else{
                    System.out.printf("Case %d: %d\n", i, x);
                }
            }
            sc.close();
        }
}
