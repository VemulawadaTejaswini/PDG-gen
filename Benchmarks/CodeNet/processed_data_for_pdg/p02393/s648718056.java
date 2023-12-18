public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b){
            int k = a;
            a = b;
            b = k;
        }
        if(b > c){
            int k = b;
            b = c;
            c = k;
        }
        if(a > b){
            int k = a;
            a = b;
            b = k;
        }
        System.out.printf("%d %d %d\n",a,b,c);
        sc.close();
    }
}
