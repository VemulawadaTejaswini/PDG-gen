public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String s;
        s = sc.nextLine();
        StringBuffer sb;
        sb = new StringBuffer(s);
        s = sb.reverse().toString();
        System.out.println(s);
    }
}
