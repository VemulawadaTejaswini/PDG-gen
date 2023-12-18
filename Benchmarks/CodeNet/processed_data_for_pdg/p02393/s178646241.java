public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String param[] = input.split(" ");
        int a = Integer.parseInt(param[0]);
        int b = Integer.parseInt(param[1]);
        int c = Integer.parseInt(param[2]);
        if(a > b) {
            int a1 = a;
            int b1 = b;
            a = b1;
            b = a1;
        }
        if (b > c) {
            int b2 = b;
            int c1 = c;
            b = c1;
            c = b2;
        }
        if (a > b) {
            int a2 = a;
            int b2 = b;
            a = b2;
            b = a2;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
