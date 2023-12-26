public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numK = sc.nextInt();
        int numX = sc.nextInt();
        int initNum = numX - numK + 1;
        String retStr = "" + initNum;
        for(int i = initNum + 1; i < numX + numK; i++){
            retStr = retStr + " " + i;
        }
        System.out.println(retStr);
    }
}
