public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        String strInput =  BR.readLine();
        int intNum = Integer.parseInt(strInput);
        int intCubic = intNum*intNum*intNum;
        System.out.println(intCubic);
    }
}
