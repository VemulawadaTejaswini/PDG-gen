public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        int i = 1;
        while(true){
            str = scan.nextLine();
            if(Integer.valueOf(str) == 0){
                break;
            }
            System.out.println("Case " + i++ +": " + str);
        }
        scan.close();
    }
}
