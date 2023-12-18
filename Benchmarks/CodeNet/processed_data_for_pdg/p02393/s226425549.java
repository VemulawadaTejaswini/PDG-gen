public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(a>b){
                int s=a;
                a=b;
                b=s;
            }
            if(b>c){
                int t=b;
                b=c;
                c=t;
            }
            if(a>b){
                int u=a;
                a=b;
                b=u;
            }
            System.out.printf("%d %d %d\n",a,b,c);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            scanner.close();
        }
    }
}
