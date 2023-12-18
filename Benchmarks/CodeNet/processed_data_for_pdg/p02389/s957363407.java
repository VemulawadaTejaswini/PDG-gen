public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] num = str.split(" ",0);
        int a,b;
        a = Integer.valueOf(num[0]);
        b = Integer.valueOf(num[1]);
        System.out.println(a*b+" "+2*(a+b));
        scan.close();
    }
}
