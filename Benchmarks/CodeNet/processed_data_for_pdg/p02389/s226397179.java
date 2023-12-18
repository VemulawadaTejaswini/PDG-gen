public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x*y;
        int w = 2*(x+y);
        System.out.printf("%d %d\n",z,w);
    }
}
