public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] Data = br.readLine().split(" ");
        int a = Integer.parseInt(Data[0]);
        int b = Integer.parseInt(Data[1]);
        int c = Integer.parseInt(Data[2]);
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println( a +" "+ b +" "+ c );
    }
}
