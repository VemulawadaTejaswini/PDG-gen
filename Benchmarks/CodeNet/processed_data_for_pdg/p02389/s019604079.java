public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.println(length * breadth + " " + (length + breadth) * 2);
    }
}
