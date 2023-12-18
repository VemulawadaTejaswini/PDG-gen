public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b < a){
            int w = a;
            a = b;
            b = w;       
        }
        if(c < b){
            int x = b;
            b = c; 
            c = x;      
        }
        if(b < a){
            int y = a;
            a = b;
            b = y;     
        }
        System.out.println(a+" "+b+" "+c);
    }
}
