public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int flg = 0;
        if(a>b){
            int temp = 0;
            temp = a;
            a = b;
            b = temp;
            flg = 1;
        }
        if(b>c){
            int temp = 0;
            temp = b;
            b = c;
            c = temp;
        }
        if(a>b){
            int temp = 0;
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
