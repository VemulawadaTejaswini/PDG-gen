public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNo = 0;
        String s;
        while ( (s = br.readLine()) != null ) {
            caseNo++;
            int i = Integer.parseInt(s);
            if (i == 0) {
                break;
            }
            System.out.println("Case " + caseNo + ": " + i );
        }
    }
}
