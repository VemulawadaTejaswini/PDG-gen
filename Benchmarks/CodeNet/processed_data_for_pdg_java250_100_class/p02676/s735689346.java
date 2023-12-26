public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        String out = "";
        if(s.length() <= k){
            out = s;
        } else {
            out = s.substring(0, k).concat("...");
        }
        System.out.println(out);
    }
}
