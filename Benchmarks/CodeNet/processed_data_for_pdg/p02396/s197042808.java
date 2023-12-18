public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int count = 0;
            while(line.equals("0") == false){
            	System.out.println("Case "+ ++count + ": " +line);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
