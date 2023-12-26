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
        String s = arr01[0];
        Boolean chkflg = true;
        for (int i = 0; i < s.length(); i++) {
            String stemp = s.substring(i, i + 1);
            if (i % 2 != 0) {
                if (stemp.equals("R")) {
                    chkflg = false;
                    break;
                }
            } else {
                if (stemp.equals("L")) {
                    chkflg = false;
                    break;
                }
            }
        }
        System.out.println(chkflg ? "Yes" : "No");
    }
}
