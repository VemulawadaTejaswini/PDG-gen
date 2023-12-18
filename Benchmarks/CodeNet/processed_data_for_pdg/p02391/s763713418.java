public class Main{
        public static void main(final String[] args){
            final Scanner sc = new Scanner(System.in);
            final int a = sc.nextInt();
            final int b = sc.nextInt();
            if(a > b){
                System.out.println("a > b");
            }else if(a <  b){
                System.out.println("a < b");
            }else{
                System.out.println("a == b");
            }
            sc.close();
        }
}
