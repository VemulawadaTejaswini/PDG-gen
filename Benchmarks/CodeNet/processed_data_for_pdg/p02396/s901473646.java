public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        int count = 1;
        while(true) {
            tmp = sc.nextInt();
            if(tmp==0){
                break;
            }
            StringBuilder sb = new StringBuilder();
            System.out.println("Case " + String.valueOf(count) + ": " + String.valueOf(tmp));
            count++;
        }
    }
}
