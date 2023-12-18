public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while(true){
            int line = Integer.parseInt(br.readLine());
            if(line == 0){
                break;
            }
            System.out.println("Case " + i + ": " + line);
            i++;
        }
    }
}
