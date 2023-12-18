public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int x;
        try{
        line = reader.readLine();
        x = Integer.parseInt(line);
        x=x*x*x;
        System.out.println(x);
        }catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
