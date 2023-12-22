public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if(b-a+c-b <= d*2 || c-a <= d){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}