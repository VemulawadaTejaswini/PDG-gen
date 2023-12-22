public class Main {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int input = Integer.parseInt(str);
        if(str.indexOf("7") != -1)System.out.println("Yes");
        else System.out.println("No");
    }
}