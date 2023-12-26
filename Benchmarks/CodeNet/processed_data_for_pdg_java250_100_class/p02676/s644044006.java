public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();
        if(s.length() > k) {
            s = s.substring(0,k);
            s += "...";
        }
        System.out.println(s);
    }
}
