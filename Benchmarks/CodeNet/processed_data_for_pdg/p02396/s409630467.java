public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int i = 1;
        while(true){
            int x = in.nextInt();
            if(x == 0) break;
            System.out.printf("Case %d: %d\n", i, x);
            i++;
        }
    }
}
