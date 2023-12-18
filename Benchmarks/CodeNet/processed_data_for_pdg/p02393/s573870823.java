public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int tmp;
        if(a > b){
            tmp = a;
            a = b;
            b = tmp;
        }
        if(c < a){
            tmp = c;
            c = b;
            b = a;
            a = tmp;
        }else if(c < b){
            tmp = c;
            c = b;
            b = tmp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
