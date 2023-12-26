public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int tmp;  
        if (a > b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        if (b > c) {
            tmp = c;
            c = b;
            b = tmp;
        }
        if (a > b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        System.out.println(""+a+' '+b+' '+c);
    }
}
