public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(
                    new InputStreamReader(System.in));
            String sStr;
            while ((sStr = stdReader.readLine()) != null) {
                String[] inputs = sStr.split(" ");
                int a = Integer.valueOf(inputs[0]);
                String op = inputs[1];
                int b = Integer.valueOf(inputs[2]);
                if (op.equals("?")) {
                    break;
                }
                switch (op) {
                    case "+":
                        System.out.println(a + b);
                        break;
                    case "-":
                        System.out.println(a - b);
                        break;
                    case "*":
                        System.out.println(a * b);
                        break;
                    case "/":
                        System.out.println((int)(a / b));
                        break;
                }
            }
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}
