public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int count = 0;
        do{
            input = sc.nextInt();
            if(input != 0){
                System.out.println("Case " + ++count + ": " +  input);
            }
        }while(input != 0);
    }
}
