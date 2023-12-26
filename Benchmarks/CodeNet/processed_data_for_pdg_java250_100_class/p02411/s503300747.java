public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(
                    new InputStreamReader(System.in));
            String sStr;
            while ((sStr = stdReader.readLine()) != null) {
                String[] inputs = sStr.split(" ");
                int m = Integer.valueOf(inputs[0]);
                int f   = Integer.valueOf(inputs[1]);
                int r   = Integer.valueOf(inputs[2]);
                if (m == -1 && f == -1 && r == -1) {
                    break;
                }
                if (m==-1 || f == -1 || (m+f <30)) {
                    System.out.print("F");
                } else if ( m+f >= 80) {
                    System.out.print("A");
                } else if  (m+f < 80 && m+f >=65) {
                    System.out.print("B");
                } else if ( (m+f >=50 && m+f < 65) || r>=50) {
                    System.out.print("C");
                } else if (m+f>=30 && m+f<50) {
                    System.out.print("D");
                } else if (m+f<30) {
                    System.out.print("F");
                }
                System.out.println();
            }
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}
