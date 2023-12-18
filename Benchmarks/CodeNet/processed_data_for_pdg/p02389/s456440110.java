public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        try{
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println((a*b)+ " " +2*(a+b));
        }catch(InputMismatchException e){
            System.out.println(e);
        }
    }
}
