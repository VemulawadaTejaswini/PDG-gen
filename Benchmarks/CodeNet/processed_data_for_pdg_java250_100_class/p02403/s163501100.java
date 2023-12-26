public class Main {
    static final String HASHMARK = "#";
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(
                    new InputStreamReader(System.in));
            String sStr;
            while ((sStr = stdReader.readLine()) != null) {
                String[] inputs = sStr.split(" ");
                int h = Integer.valueOf(inputs[0]);
                int w = Integer.valueOf(inputs[1]);
                if (h == 0 && w == 0) {
                    break;
                }
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        System.out.print(HASHMARK);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}
