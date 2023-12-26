public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        Pattern p = Pattern.compile("[A][A-Z]*[Z]");
        Matcher matcher = p.matcher(s);
        int max = 0;
        while (matcher.find()) {
            int length = matcher.group().length();
            if (max < length) {
                max = length;
            }
        }
        System.out.println(max);
    }
}
