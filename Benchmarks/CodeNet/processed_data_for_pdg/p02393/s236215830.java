public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            if(b>c){
                System.out.printf("%d %d %d\n",c,b,a);
            }else{
                System.out.printf("%d %d %d\n",b,c,a);
            }
        }else if(b>a && b>c){
            if(a>c){
                System.out.printf("%d %d %d\n",c,a,b);
            }else{
                System.out.printf("%d %d %d\n",a,c,b);
            }
        }else if(c>b && c>a){
            if(a>b){
                System.out.printf("%d %d %d\n",b,a,c);
            }else{
                System.out.printf("%d %d %d\n",a,b,c);
                }
            }
        sc.close();
    }
}
