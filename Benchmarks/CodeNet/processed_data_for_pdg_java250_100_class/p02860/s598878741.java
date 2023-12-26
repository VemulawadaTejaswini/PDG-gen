public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);
        List<String> mylist = new ArrayList<>();
        String strinput = reader.readLine();
        while (strinput != null) {
            mylist.add(strinput);
            strinput = reader.readLine();
        }
        String arr01[] = mylist.get(0).split(" ");
        String arr02[] = mylist.get(1).split(" ");
        Integer n = Integer.valueOf(arr01[0]);
        String s = arr02[0];
        Boolean chkflg = false;
        if (n % 2 == 0) {
            if (s.substring(0, n / 2).equals(s.substring(n / 2, n))) {
                chkflg = true;
            }
        }
        System.out.println(chkflg ? "Yes" : "No");
    }
}
