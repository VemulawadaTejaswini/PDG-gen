public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strLen = sc.nextInt();
        String str = sc.next();
        if(strLen % 2 == 0){
            String firstStr = str.substring(0, strLen / 2);
            String lastStr = str.substring(strLen / 2, strLen);
            if(firstStr.equals(lastStr)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
