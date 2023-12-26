public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String input = br.readLine();
            if(input.equals("-")){
                break;
            }
            int shuffle = Integer.parseInt(br.readLine());
            for(int i = 0; i < shuffle; i++){
                int h = Integer.parseInt(br.readLine());
                input = input.substring(h) + input.substring(0, h);
            }
            System.out.println(input);
        }
    }
}
