public class Main{
    public static void main (String[] args){
        int a;
        int b;
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        b = reader.nextInt();
        if(a < b){
            System.out.println("a < b");
        }
        else if(a > b){
            System.out.println("a > b");
        }
        else{
            System.out.println("a == b");
        }
        reader.close();
    }
}
