public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = 0;
        if(a > b){
            x = a;
            a = b;
            b = x;   
        }
        if(a > c){
            x = a;
            a = c;
            c = x;  
        }
        if(b > c){
            x = b;
            b = c;
            c = x;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
