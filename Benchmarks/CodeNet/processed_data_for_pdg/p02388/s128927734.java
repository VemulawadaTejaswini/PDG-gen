public class Main {
    public static void main(String[] args){
        try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){
            int x = Integer.parseInt(r.readLine());
            System.out.println(x * x * x);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
