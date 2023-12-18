public class Main{
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            if(a < b){
            System.out.println("a < b");
            }else if(a > b){
            System.out.println("a > b");
            }else{
            System.out.println("a == b");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
