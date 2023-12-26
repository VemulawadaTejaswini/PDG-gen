public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        sc.close();
        int count = 0;
        for(;;){
            if(h<=0){
                break;
            }
            h -= a;
            count ++;
        }
        System.out.println(count);
    }
}
