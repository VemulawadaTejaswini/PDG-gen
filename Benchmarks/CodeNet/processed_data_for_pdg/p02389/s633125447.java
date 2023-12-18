public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int area = a * b;
        int circumference = 2*(a+b);
        System.out.println(area + " " + circumference);
    }
}
