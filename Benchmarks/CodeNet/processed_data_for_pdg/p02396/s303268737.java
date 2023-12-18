public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNo = 1;
        String msg = "";
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) { break; }
            System.out.println( String.format("Case %1$s: %2$s", caseNo, num) );
            caseNo++;
        }
    }
}
