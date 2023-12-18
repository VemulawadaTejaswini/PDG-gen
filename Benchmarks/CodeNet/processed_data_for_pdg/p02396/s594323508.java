public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(true) {
            int n = sc.nextInt();
            if (n != 0) {
                System.out.println("Case " + count + ": " + n);
            } else {
                break;
            }
            count ++;
        }
    }
}
