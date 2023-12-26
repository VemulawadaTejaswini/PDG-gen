public class Main{
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line = stdReader.readLine()) != null) {
                String[] input = line.split(" ", 0);
                int width  = Integer.parseInt(input[0]);
                int height = Integer.parseInt(input[1]);
                int x = Integer.parseInt(input[2]);
                int y = Integer.parseInt(input[3]);
                int r = Integer.parseInt(input[4]);
                int top = y + r;
                int bottom = y - r;
                int right = x + r;
                int left = x - r;
                String ans = "Yes";
                if(top > height) {
                    ans = "No";
                }
                if(bottom < 0) {
                    ans = "No";
                }
                if(right > width) {
                    ans = "No";
                }
                if(left < 0) {
                    ans = "No";
                }
                System.out.println(ans);
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
}
