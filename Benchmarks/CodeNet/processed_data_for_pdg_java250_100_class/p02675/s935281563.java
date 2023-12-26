public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String temp = n.substring(n.length() - 1);
        String match = "[0168]{1}";
        if (temp.equals("3")) {
            System.out.println("bon");
        } else if (temp.matches(match)) {
            System.out.println("pon");
        } else {
            System.out.println("hon");
        }
    }
}
