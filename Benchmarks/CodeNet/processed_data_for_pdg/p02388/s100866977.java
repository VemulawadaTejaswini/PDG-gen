public class Main {
    public static void main(String[] srgs) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int x = Integer.parseInt(reader.readLine());
            System.out.println(x*x*x);
        } catch(IOException e) {
            System.out.println(e);
        } catch(NumberFormatException e) {
            System.out.println("wrong number is entered.");
        }
    }
}
