public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x,y,z;
        if(a>=b && a>=c){
            x=a;
            if(b>c){
                y=b;
                z=c;
            } else {
                y=c;
                z=b;
            }
        } else if(b>=a && b>=c){
            x=b;
            if(a>c){
                y=a;
                z=c;
            } else {
                y=c;
                z=a;
            }
        } else {
            x=c;
            if(a>b){
                y=a;
                z=b;
            } else {
                y=b;
                z=a;
            }
        }
        System.out.printf("%d %d %d\n",z,y,x);
        sc.close();
    }   
}
