public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = a+b;
        int d = a-b;
        int c = a*b;
        if(p>d){
            if(c>p){
                System.out.print(c);
                return;
            }else{
                System.out.print(p);
                return;
            }
        } else {
            if(c>d){
                System.out.print(c);
                return;
            } else{
                System.out.print(d);
                return;
            }
        }
    }
}
