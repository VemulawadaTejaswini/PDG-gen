public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strAry[] = br.readLine().split(" ");
        Integer.parseInt(strAry[0]);
        Integer.parseInt(strAry[1]);
        Integer.parseInt(strAry[2]);
        Arrays.sort(strAry);
        System.out.println(strAry[0] + " " + strAry[1] + " " + strAry[2]);
    }
}
