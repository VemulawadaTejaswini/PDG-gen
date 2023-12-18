public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iNyuryoku = Integer.parseInt(br.readLine());
        double x = Math.pow(iNyuryoku, 3);
        System.out.println("" + (int)x +"");
    }
}
