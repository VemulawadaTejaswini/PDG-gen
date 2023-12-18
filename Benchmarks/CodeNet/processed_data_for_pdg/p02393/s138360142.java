public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a < b && a < c){
            System.out.println(a + " " + Math.min(b, c) + " " + Math.max(b, c));
        }
        else if(b < a && b < c){
            System.out.println(b + " " + Math.min(a, c) + " " + Math.max(a, c));
        }
        else{
            System.out.println(c + " " + Math.min(a, b) + " " + Math.max(a, b));
        }
        sc.close();
    }
}
