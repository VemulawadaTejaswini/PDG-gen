public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.next();
        String line2 = scanner.next();
        String line3 = scanner.next();
        int a = Integer.parseInt(line1);
        int b = Integer.parseInt(line2);
        int c = Integer.parseInt(line3);
        int num;
        if(a > b){
            num = a;
            a = b;
            b = num;
            }
        if(a > c){
            num = a;
            a = c;
            c = num;
        }
        if(b > c){
            num = b;
            b = c;
            c = num;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
