public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        int y = scan.nextInt();
        if  (x < y){
            System.out.println("a < b");
        }
        if  (x>y){System.out.println("a > b");}
        if  (x==y){System.out.println("a == b");}
    }
}
