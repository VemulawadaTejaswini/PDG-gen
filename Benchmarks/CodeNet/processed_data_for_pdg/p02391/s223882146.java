public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        if(a > b) {
        System.out.println("a > b");
        }else if(a < b) {
        System.out.println("a < b");
        }else if(a == b){
        System.out.println("a == b");}
    }
}
