public class Main {
    public static void main( String[] args) {
        int length;
        Scanner sc = new Scanner(System.in);
        String num = sc.next(); 
        num = num.replaceAll("0", "");  
        length = num.length();  
        System.out.println(length); 
    }
}
