public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
       for(int i=0;;i++){
            int a = sc.nextInt();
            if(a==0) break;
           System.out.printf("Case %d: %d\n",i+1,a);
       }
           sc.close();
    }
}
