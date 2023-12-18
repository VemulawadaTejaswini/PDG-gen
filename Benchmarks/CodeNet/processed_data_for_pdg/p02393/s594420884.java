public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(b > a){
            if(c > b){
                System.out.printf("%d %d %d\n", a, b, c);
            }else if(c > a){
                System.out.printf("%d %d %d\n", a, c, b);
            }else{
                System.out.printf("%d %d %d\n", c, a, b);
            } 
        }
        if(a > b){
            if(c > a){
                System.out.printf("%d %d %d\n", b, a, c);
            }else if(c > b){
                System.out.printf("%d %d %d\n", b, c, a);
            }else{
                System.out.printf("%d %d %d\n", c, b, a);
            }
        }
    }
}
