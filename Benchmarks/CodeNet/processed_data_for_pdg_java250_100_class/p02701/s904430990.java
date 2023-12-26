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
        HashSet<String> hs = new HashSet<String>();
        for (int i = 1; i < 1 + n; i++) {
            hs.add(mylist.get(i));
        }
        System.out.println(hs.size());
    }
}
