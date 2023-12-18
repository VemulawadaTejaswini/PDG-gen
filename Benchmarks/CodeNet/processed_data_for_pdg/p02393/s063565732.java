public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a <= b && b <= c && a <= c){
            System.out.println(a + " " + b + " " + c);
        } else if (a <= c && c <= b && a <= b){
        System.out.println(a +" "+ c +" "+ b);
    } else if (b <= a && b <= c && c <= a){
        System.out.println(b +" "+ c +" "+ a);
    } else if (b <= a && a <= c && b <= c){
        System.out.println(b +" "+ a +" "+ c);
    } else if (c <= b && b <= a && c <= a){
        System.out.println(c +" "+ b +" "+ a);
    } else if (c <= a && c <= b && a <= b){
        System.out.println(c +" "+ a +" "+ b);
    } else{
    }
}
}
