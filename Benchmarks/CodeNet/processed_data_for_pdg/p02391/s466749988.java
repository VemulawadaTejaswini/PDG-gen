public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        String message;
        if(a > b) message = "a > b";
        else if(a < b) message = "a < b";
        else message = "a == b";
        System.out.println(message);
    }
}
