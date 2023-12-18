public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>b){
            if(a>=c&&b>=c){
                System.out.println(c + " " + b + " " + a);
            }else if(a>=c&&c>-b){
                System.out.println(b + " " + c + " " + a);
            }else{
                System.out.println(b + " " + a + " " + c);
            }
        }else{
            if(b>-c&&a>=c){
                System.out.println(c + " " + a + " " + b);
            }else if(b>=c&&c>=a){
                System.out.println(a + " " + c + " " + b);
            }else{
                System.out.println(a + " " + b + " " + c);
            }
        }
    }
}
