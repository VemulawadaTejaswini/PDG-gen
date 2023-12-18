public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b<a){
            int temp=b;
            b=a;
            a=temp;
        }
        int c = sc.nextInt();
        if(c<b){
            int temp=c;
            c=b;
            b=temp;
        }
        if(b<a){
            int temp=b;
            b=a;
            a=temp;
        }
        System.out.println(a+" "+b+" "+c);
        sc.close();
    }
}
