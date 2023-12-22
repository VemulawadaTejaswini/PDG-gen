public class Main {
    
    public static void main(String[] args) {
        System.out.println("start test");
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int c = b / a;
        
        if(c == 0) {
            System.out.println(a + b);
        } else {
            System.out.println(b - a);
        }
    }
}