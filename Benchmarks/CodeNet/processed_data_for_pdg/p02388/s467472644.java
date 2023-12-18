public class Main {
    public static void main(String args[]){
        int num, result;
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        num = Integer.parseInt(input);
        result = num * num * num;
        System.out.println(result);
    }
}
