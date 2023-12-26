public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        line = line.trim();
        String[] readLineArray = line.split("[\\s+]");
        int a = Integer.parseInt(readLineArray[0]);
        int b = Integer.parseInt(readLineArray[1]);
        if(a>b){
            System.out.println("a > b");
        }
        else if(a<b){
            System.out.println("a < b");
        }
        else {
            System.out.println("a == b");
        }
    }
}
