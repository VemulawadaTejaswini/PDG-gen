public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        st = new StringTokenizer(temp, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        br.close();
        if (a == b && a != c) System.out.println("Yes");
        else if (a == c && a != b) System.out.println("Yes");
        else if (b == c && b != a) System.out.println("Yes");
        else System.out.println("No");
    }
}
