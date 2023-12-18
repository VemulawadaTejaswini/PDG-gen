public class Main{
    public static void main(String[] arg){
        int x, y, i, j;
        Scanner xc = new Scanner(System.in);
        x = xc.nextInt();
        j = 3;
        y = 1;
        for(i = 0; i < j; i++){
            y = y * x;
        }
        System.out.println(y);
    }
}
