public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
        String in = reader.readLine();
        int x =Integer.parseInt(in);
        System.out.println(x*x*x);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e){
            System.out.println("No data");
        }
    }
}
