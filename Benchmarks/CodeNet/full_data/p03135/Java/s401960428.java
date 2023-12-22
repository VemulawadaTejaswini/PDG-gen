public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String[] inputNumbers = inputStr.split(" ");
        double T = Double.parseDouble(inputNumbers[0]);
        double X = Double.parseDouble(inputNumbers[1]);
        if (1<=T && T<=100 && 1<=X && X<= 100) {
            double result = T/X;
            System.out.println(result);
        } else {
            System.exit(1);
        }
    }
}