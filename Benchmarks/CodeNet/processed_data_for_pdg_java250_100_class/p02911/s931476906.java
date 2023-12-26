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
        int q = Integer.valueOf(arr01[2]);
        Integer arr_point[] = new Integer[n];
        Arrays.fill(arr_point, 0);
        for (int i = 1; i < 1 + q; i++) {
            String arr_temp[] = mylist.get(i).split(" ");
            int a = Integer.valueOf(arr_temp[0]);
            arr_point[a - 1] += 1;
        }
        for (int j = 0; j < n; j++) {
            if (q - k + 1 <= arr_point[j]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
