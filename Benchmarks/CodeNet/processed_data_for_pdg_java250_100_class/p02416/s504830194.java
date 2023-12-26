public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int sum=0;
            String s=br.readLine();
            if(s.equals("0")){
                break;
            }
            for (int c : s.toCharArray()) {
                sum+=c-48;
            }
            System.out.println(sum);
        }
    }
}
