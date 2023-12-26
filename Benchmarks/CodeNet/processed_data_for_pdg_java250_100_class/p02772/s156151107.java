public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String retStr = "APPROVED";
        for(int i = 0; i < num; i++){
            int testNum = sc.nextInt();
            if(testNum % 2 == 0 && (testNum % 3 != 0 && testNum % 5 != 0)){
                retStr = "DENIED";
            }
        }
        System.out.println(retStr);
    }
}
