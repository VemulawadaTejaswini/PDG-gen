public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int i = 0;
        for(i=1;;i++){
            int x = stdIn.nextInt();
            if(x == 0){
                break;
            }
            System.out.printf("Case %d: %d\n",i,x);
        }
        stdIn.close();
    }
}
