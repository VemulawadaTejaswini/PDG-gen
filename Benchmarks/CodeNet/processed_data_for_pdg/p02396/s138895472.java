public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int i = 1;
        while ((line = br.readLine()) != null) {
            int num = Integer.parseInt(line);
            if (num == 0) {
                break;
            }
            System.out.println("Case "+ i++ +": "+ num);
        }
    }
}
