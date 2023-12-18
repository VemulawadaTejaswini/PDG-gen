public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = in.readLine();
            String[] inputs = input.split("\\s+");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            System.out.println(String.join(" ", new String[] {String.valueOf(a * b), String.valueOf((a + b) * 2)}));
        } catch (IOException ex) {
        }
    }
}
