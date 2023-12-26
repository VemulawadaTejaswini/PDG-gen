public class Main {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            StringBuffer strBuf = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '1') {
                    strBuf.append("9");
                } else if (ch == '9') {
                    strBuf.append("1");
                } else {
                    strBuf.append(ch);
                }
            }
            System.out.println(strBuf.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
