public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();
        if(a<b){
            if(b<c){
                System.out.printf("%d %d %d\n",a,b,c);
            }else if(a<c){
                System.out.printf("%d %d %d\n",a,c,b);
            }else{
                System.out.printf("%d %d %d\n",c,a,b);
            }
        }else if(a>b){
            if(a<c){
                System.out.printf("%d %d %d\n",b,a,c);
            }else if(c<b){
                System.out.printf("%d %d %d\n",c,b,a);
            }else {
                System.out.printf("%d %d %d\n",b,c,a);
            }
        }
        sc.close();
    }
}
