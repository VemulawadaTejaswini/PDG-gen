public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String n = in.nextLine();
        if(n.charAt(0) == '7' || n.charAt(1) == '7'  || n.charAt(2)== '7')
            out.println("Yes");
        else out.println("No");
        out.close();
    }
}
