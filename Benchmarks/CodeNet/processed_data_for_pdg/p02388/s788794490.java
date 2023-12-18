public class Main {
        public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            int x = Integer.parseInt(line);
            System.out.println(x*x*x);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) { 
             System.out.println("The input age was not correct.");
        }
    }
}
