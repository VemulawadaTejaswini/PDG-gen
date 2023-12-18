public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        int x;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            x = Integer.parseInt(br.readLine());
        }
        System.out.println(x * x * x);
    }
}
