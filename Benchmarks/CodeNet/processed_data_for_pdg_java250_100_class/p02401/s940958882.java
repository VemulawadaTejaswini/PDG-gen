public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line = stdReader.readLine()) != null) {
                String[] input = line.split(" ", 0);
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[2]);
                String mark = input[1];
                if(mark.equals("?")) {
                    break;
                }
                if(mark.equals("+")) {
                    System.out.println(a + b);
                    continue;
                }
                if(mark.equals("-")) {
                    System.out.println(a - b);
                    continue;
                }
                if(mark.equals("*")) {
                    System.out.println(a * b);
                    continue;
                }
                if(mark.equals("/")) {
                    System.out.println(a / b);
                    continue;
                }
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
}
