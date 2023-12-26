public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        double h = scan.nextInt();
        double m = scan.nextInt();
        double ans;
        double k = Math.abs(5.500000000000000000000000000*m-30.000000000000000000000000000*h);
        if(k>180 && k!=360){
            ans= Math.sqrt(a*a+b*b-2*a*b*(Math.cos(Math.toRadians(k))));
        }else if(k<180){
            ans= Math.sqrt(a*a+b*b-2*a*b*(Math.cos(Math.toRadians(k))));
        }else if(k==180){
            ans=a+b;
        }else{
             ans = Math.abs(a-b);
        }
        System.out.println(ans);
    }
}
