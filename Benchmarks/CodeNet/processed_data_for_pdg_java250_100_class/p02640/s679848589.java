public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();   
        int Y = in.nextInt();   
        if( Y%2 == 1 || 2*X > Y || (Y-(X*2))/2 > X ){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
