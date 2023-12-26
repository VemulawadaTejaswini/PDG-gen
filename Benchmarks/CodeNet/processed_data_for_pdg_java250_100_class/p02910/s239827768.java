class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        String b = "Yes";
        for (int i=0; i<S.length(); i++) {
            if (i % 2 == 0) {
                if ("L".equals(S.substring(i, i+1))) {
                    b = "No";
                    break;
                }
            } else {
                if ("R".equals(S.substring(i, i+1))) {
                    b = "No";
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        PrintWriter out = new PrintWriter(System.out);
        out.println(sb);
        out.flush();
    }
}
