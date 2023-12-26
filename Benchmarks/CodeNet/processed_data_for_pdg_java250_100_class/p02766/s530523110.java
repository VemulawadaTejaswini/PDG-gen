public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);
        List<String> mylist = new ArrayList<>();
        String strinput = reader.readLine();
        while (strinput != null) {
            mylist.add(strinput);
            strinput = reader.readLine();
        }
        String arr01[] = mylist.get(0).split(" ");
        int n = Integer.valueOf(arr01[0]);
        int k = Integer.valueOf(arr01[1]);
        int cnt = 0;
        while (n >= 1) {
            n = n / k;
            cnt += 1;
        }
        System.out.println(cnt);
    }
}
