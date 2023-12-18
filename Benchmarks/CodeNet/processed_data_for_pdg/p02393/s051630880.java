public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int tmp;
        if(n1 > n2) {
            tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        if(n1 > n3) {
            tmp = n1;
            n1 = n3;
            n3 = tmp;
        }
        if(n2 > n3) {
            tmp = n2;
            n2 = n3;
            n3 = tmp;
        }
        System.out.println(n1 + " " + n2 + " " + n3);
    }
}
