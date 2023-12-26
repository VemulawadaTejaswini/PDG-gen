public class Main{
    public static void main(String[] args) {
        int a = 0;
        String operator = "";
        int b = 0;
        Scanner sc = new Scanner(System.in);
        String out = "";
        while (true) {
            while (sc.hasNext()) {
                a = sc.nextInt();
                operator = sc.next();
                b = sc.nextInt();
                break;
            }
            if (operator.equals("?")) {
                break;
            } else if (operator.equals("/")) {
                out = out + a / b + "\n";
            } else if (operator.equals("*")) {
                out = out + a * b + "\n";
            } else if (operator.equals("+")) {
                out = out + (a + b) + "\n";
            } else if (operator.equals("-")) {
                out = out + (a - b) + "\n";
            }
        }
        System.out.print(out);
    }
}
