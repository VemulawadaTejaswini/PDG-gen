public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        String s=sc.next();
        char[] e=s.toCharArray();
        String p=sc.next();
        for (int i = 0; i < s.length(); i++) {
            String check="";
            for (int j = 0; j < s.length(); j++) {
                check+=e[(i+j)%s.length()];
            }
            if(check.contains(p)){
                out.println("Yes");
                exit(0);
            }
        }
        out.println("No");
    }
}
