public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String op = "==";
        if( a < b ) op = "<";
        else if( a > b ) op = ">";
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("a " + op + " b");
        pw.flush();
    }
}
