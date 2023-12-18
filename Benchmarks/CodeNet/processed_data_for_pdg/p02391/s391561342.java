public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String param[] = input.split(" ");
        int a = Integer.parseInt(param[0]);
        int b = Integer.parseInt(param[1]);
        if(a < b) {
            System.out.println("a < b");
        }else if(a > b){
            System.out.println("a > b");
        }else if(a == b){
            System.out.println("a == b");
        }
    }
}
