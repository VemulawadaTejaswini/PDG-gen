public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br   = new BufferedReader(isr);
        PrintWriter out     = new PrintWriter(System.out);
        int i = 0;
        String line;
        String[] numList = new String[2];
        try {
            while ((line = br.readLine()) != null) {
                numList = line.split(" ");
                int num0 = Integer.parseInt(numList[0]);
                int num1 = Integer.parseInt(numList[1]);
                int sum = num0 + num1;
                System.out.println((int)Math.log10(sum) + 1);
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
