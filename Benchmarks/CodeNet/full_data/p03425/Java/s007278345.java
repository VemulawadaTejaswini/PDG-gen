import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        int a = 0;
        int r = 0;
        int c = 0;
        int h = 0;
        for(int i = 0; i < n; i++){
            String str = sc.next().substring(0,1);
            if(str.equals("M")){
                m++;
            }
            if(str.equals("A")){
                a++;
            }
            if(str.equals("R")){
                r++;
            }
            if(str.equals("C")){
                c++;
            }
            if(str.equals("H")){
                h++;
            }
        }
        long ans = m*a*r + m*a*c + m*a*h + m*r*c + m*r*h + m*c*h + a*r*c + a*r*h + a*c*h + r*c*h;
        System.out.println(ans);
    }
}