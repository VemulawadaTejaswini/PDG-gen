public class Main{
    public static void main(String args[]){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            System.out.println(num * num * num);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
