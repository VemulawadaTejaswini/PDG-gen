public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for(int i=0;i<3; i++){
            int x;
            if(a>b){
                x=a;
                a=b;
                b=x;
            }
            if(b>c){
                x=b;
                b=c;
                c=x;
            }
        }
        System.out.println(a+" "+b+" "+c);
    }
}
