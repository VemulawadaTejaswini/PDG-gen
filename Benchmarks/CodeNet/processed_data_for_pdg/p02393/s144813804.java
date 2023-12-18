public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = 0;
        if(a < b){
            n = a;
            a = b;
            b = n;
        }
        if(a < c){
            n = a;
            a = c;
            c = n;
        }
        if(b < c){
            n = b;
            b = c;
            c = n;
        }
        System.out.println(c + " " + b + " " + a);
    }
}
