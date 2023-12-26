public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        StringBuilder ans = new StringBuilder(br.readLine());
        ans.setCharAt(3, '8');
        writer.println(ans.toString());
        br.close();
        writer.close();
    }
}
