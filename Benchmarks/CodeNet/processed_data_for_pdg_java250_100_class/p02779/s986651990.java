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
        String arr02[] = mylist.get(1).split(" ");
        int n = Integer.valueOf(arr01[0]);
        List<String> list01 = Arrays.asList(arr02);
        List<String> list02 = list01.stream().distinct().collect(Collectors.toList());
        System.out.println(list01.size() == list02.size() ? "YES" : "NO");
    }
}
