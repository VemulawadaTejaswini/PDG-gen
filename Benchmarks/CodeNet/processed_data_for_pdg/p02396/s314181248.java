public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    long count = 1;
        while(true){
            int x = Integer.parseInt(br.readLine());
            if(x == 0) break;
                sb.append("Case "+ count +": "+ x + "\n");
                count++;
        }
        System.out.print(sb);
    }
}
