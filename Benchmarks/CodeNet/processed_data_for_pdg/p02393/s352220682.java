public class Main{
    public static void main(String[] args){
        int a, b, c;
        int min, mid, max;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if (a < b){
            if (b < c){
                System.out.println(a+" "+b+" "+c);
            }else if (a < c){
                System.out.println(a+" "+c+" "+b);
            }else{
                System.out.println(c+" "+a+" "+b);
            }
        }else{
            if (c < b){
                System.out.println(c+" "+b+" "+a);
            }else if (a < c){
                System.out.println(b+" "+a+" "+c);
            }else{
                System.out.println(b+" "+c+" "+a);
            }
        }
    }
}
