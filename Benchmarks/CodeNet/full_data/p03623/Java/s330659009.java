public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

         a = x - a;
         b = x - b;

        if(a<b){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}