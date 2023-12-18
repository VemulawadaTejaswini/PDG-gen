public class Main{
    public static void main(String []args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            int n =Integer.parseInt(line);
            int m = n*n*n;
            System.out.println(m);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
