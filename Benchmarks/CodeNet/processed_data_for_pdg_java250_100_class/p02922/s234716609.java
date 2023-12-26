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
        String s1 = arr01[0];
        Integer a = Integer.valueOf(s1);
        String s2 = arr01[1];
        Integer b = Integer.valueOf(s2);
        Boolean chkflg = true;
        int i = 0;
        while (chkflg) {
            if (a + (i - 1) * (a - 1) >= b) {
                chkflg = false;
            } else {
                i += 1;
            }
        }
        System.out.println(i);
    }
}
