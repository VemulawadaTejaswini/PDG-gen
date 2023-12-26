public class Main {
    public static void main(String[] args) throws IOException {
        BigDecimal x1 = new BigDecimal("1");
        BigDecimal y = new BigDecimal("30");
        BigDecimal z = new BigDecimal("10");
        BigDecimal z4 = x1.divide(y, 5, BigDecimal.ROUND_FLOOR);
        BigDecimal z5 = x1.divide(z, 5, BigDecimal.ROUND_FLOOR);
        BigDecimal z1 = new BigDecimal("1");
        BigDecimal z6 = z1.add(z4);
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);
        List<String> mylist = new ArrayList<>();
        String strinput = reader.readLine();
        while (strinput != null) {
            mylist.add(strinput);
            strinput = reader.readLine();
        }
        String arr01[] = mylist.get(0).split(" ");
        Integer k = Integer.valueOf(arr01[0]);
        Integer n = Integer.valueOf(arr01[1]);
        int mindata = n - k + 1;
        int maxdata = n + k - 1;
        List<String> res = new ArrayList<>();
        for (int i = mindata; i <= maxdata; i++) {
            res.add(String.valueOf(i));
        }
        String strdata = String.join(" ", res);
        System.out.println(strdata);
    }
}
