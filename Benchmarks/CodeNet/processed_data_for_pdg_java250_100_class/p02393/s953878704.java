public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        line = line.trim();
        String[] readLineArray = line.split("[\\s+]");
        int[] threeNum  = new int[3];
        threeNum[0] = Integer.parseInt(readLineArray[0]);
        threeNum[1] = Integer.parseInt(readLineArray[1]);
        threeNum[2] = Integer.parseInt(readLineArray[2]);
        Arrays.sort(threeNum);
        System.out.println(threeNum[0]+" "+threeNum[1]+" "+threeNum[2]);
    }
}
