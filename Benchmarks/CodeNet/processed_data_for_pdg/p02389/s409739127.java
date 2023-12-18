public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int[] intArr = new int[2];
        intArr[0] = Integer.parseInt(strArr[0]);
        intArr[1] = Integer.parseInt(strArr[1]);
        int length = (intArr[0] + intArr[1]) * 2;
        int square = intArr[0] * intArr[1];
        System.out.println(square + " " + length);
    }
}
