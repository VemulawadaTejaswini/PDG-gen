public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String symbol = "";
        if(a > b)
            symbol = ">";
        else if (a < b)
            symbol = "<";
        else
            symbol = "==";
        System.out.println("a " + symbol + " b");
    }
}
