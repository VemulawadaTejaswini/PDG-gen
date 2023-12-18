public class Main {
    public static void main(String args[]) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strArr[] = br.readLine().split(" ");
        int intArr[] = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        if (intArr[0] > intArr[1]) {
            int tmp = intArr[0];
            intArr[0] = intArr[1];
            intArr[1] = tmp;
        }
        if (intArr[1] > intArr[2]) {
            int tmp = intArr[1];
            intArr[1] = intArr[2];
            intArr[2] = tmp;
        }
        if (intArr[0] > intArr[1]) {
            int tmp = intArr[0];
            intArr[0] = intArr[1];
            intArr[1] = tmp;
        }
        System.out.println(intArr[0] + " " + intArr[1] + " " + intArr[2]);
    }
}
