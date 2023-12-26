public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);
        ArrayList<String> mylist = new ArrayList<>();
        String strinput = reader.readLine();
        while (strinput != null) {
            mylist.add(strinput);
            strinput = reader.readLine();
        }
        String s = mylist.get(0);
        String t = mylist.get(1);
        Pattern p1 = Pattern.compile(s + "[a-z]");
        Matcher m1 = p1.matcher(t);
        System.out.println(m1.find() ? "Yes" : "No");
    }
}
