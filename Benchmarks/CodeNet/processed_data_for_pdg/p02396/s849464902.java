public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x;
        int y=0;
   while(true){
    x = sc.nextInt();
     if ( x == 0 ) break;   
     y++;
     System.out.println("Case "+y+ ": "+x);
    }
   }
}
