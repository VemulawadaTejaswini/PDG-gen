public class Main {
    public static void main(String args[]){
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String line;
        int x;
        try {
            line = reader.readLine();
            x = Integer.parseInt(line);
            System.out.println(x*x*x);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
