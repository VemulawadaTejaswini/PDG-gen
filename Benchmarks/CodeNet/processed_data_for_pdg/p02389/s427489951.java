public class Main{
    public static void main (String[] args){
        int area=0, len=0;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        area = a*b;
        len = a*2+b*2;
        System.out.println(area+" "+len);
    }
}
