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
        String n = arr01[0];
        System.out.println(n.indexOf('7') >= 0 ? "Yes" : "No");
    }
}
