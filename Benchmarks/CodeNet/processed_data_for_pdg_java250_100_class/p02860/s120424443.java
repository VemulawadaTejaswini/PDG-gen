public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String first = s.substring(0, n/2);
        String end = s.substring(n/2, n);
        if (n % 2 == 1 || !first.equals(end)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        sc.close();
    }
}
