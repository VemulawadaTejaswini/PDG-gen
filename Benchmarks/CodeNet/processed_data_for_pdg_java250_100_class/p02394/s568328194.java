public class Main{
    public static void main(String[] args) throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        String result = "No";
        if ((0<=x-r)&(W>=x+r)) {
            if ((y-r>=0)&(y+r<=H)){
                result = "Yes";
            }
        }
        System.out.println(result);
    }
}
