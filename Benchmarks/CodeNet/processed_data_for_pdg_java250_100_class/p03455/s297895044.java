public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);    
        int a = sc.nextInt();    
        int b = sc.nextInt();
        if ((a % 2 == 0) || (b % 2 == 0)) {
            System.out.print("Even");
        }
        else {
            System.out.print("Odd");
        }
    }
}
