public class Main {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            int x = Integer.parseInt(line);
            if(x >= 1 && x <=100){
                System.out.println(x*x*x);
            } else{
                System.out.println("The integer x should be from 1 to 100.");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e ){
            System.out.println("The number format is incorrect");
        }
    }
}
