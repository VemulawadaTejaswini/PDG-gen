public class Main {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        String str =out.nextLine();
        String[] sss=str.split(" ");
        int a= Integer.parseInt(sss[0]);
        int b= Integer.parseInt(sss[1]);
        int c= Integer.parseInt(sss[2]);
        int t;
        if(a>b) {t=a;a=b;b=t;}
        if(b>c) {t=b;b=c;c=t;}
        if(a>b) {t=a;a=b;b=t;}
        System.out.println(a+" "+b+" "+c);
    }
}
