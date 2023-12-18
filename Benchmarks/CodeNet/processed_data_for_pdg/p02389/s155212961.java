public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    
        int x = sc.nextInt();  
        int y = sc.nextInt();
        int size = x*y;
        int per = 2*(x+y);
        System.out.println(size +" "+ per);  
    }
}
