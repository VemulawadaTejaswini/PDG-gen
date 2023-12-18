public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt();
        String s;
        if(a==b)s="==";
        else if(a>b)s=">";
        else s="<";
        System.out.printf("a %s b\n",s);
    }
}
