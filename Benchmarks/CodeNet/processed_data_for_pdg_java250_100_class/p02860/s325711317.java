public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.next());
        String str = sc.next();
        Pattern dupPattern = Pattern.compile("([ \\w]+)\\1", Pattern.CASE_INSENSITIVE);
        Matcher matcher = dupPattern.matcher(str);
        while (matcher.find()) {
            str = str.replaceAll("([ \\w]+)\\1", "$1");
        }
        if ((len != str.length())&&(len % str.length()) == 0) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
