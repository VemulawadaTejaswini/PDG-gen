public class Main {
    public static void main(String[] args) {
        try {
            LineNumberReader lineNumReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            String inputStr = null;
            String s = null;
            String p = null;
            boolean answer = false;
            while ((inputStr = lineNumReader.readLine()) != null) {
                if (lineNumReader.getLineNumber() == 1) {
                    s = inputStr;
                }
                if (lineNumReader.getLineNumber() == 2) {
                    p = inputStr;
                    break;
                }
            }
            StringBuilder longS = new StringBuilder();
            for ( int i=0; i < 2+ p.length()/s.length(); i++){
                longS.append(s);
            }
            if (longS.indexOf(p) <= -1) {
                answer = false;
            } else {
                answer = true;
            }
            if (answer) {
                 System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            lineNumReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}
