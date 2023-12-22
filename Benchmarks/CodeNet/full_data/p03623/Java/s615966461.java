public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

         int akyori = Math.abs(x - a);
         int bkyori = Math.abs(x - b);

        if(akyori<bkyori){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}