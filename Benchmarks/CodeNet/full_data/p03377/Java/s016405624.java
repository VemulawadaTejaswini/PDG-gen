public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();

        if(A < X){
            if((A+B) > X){
                System.out.println("YES");
            }
        }else{
            System.out.println("NO");
        }

    }
}
