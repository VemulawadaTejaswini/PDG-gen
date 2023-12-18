public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=0; a!=0; i++){
            System.out.println("Case "+(i+1)+": "+a);
            a = scan.nextInt();
        }
    }
}
