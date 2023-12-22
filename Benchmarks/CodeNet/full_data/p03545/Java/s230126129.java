import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int d[] = new int[4];
        for(int i=0;i<4;i++){
            d[i] = x%10;
            x /= 10;
        }
        int a = d[3];//1のくらい
        int b = d[2];
        int c = d[1];
        int e = d[0];
        int k = 1;
        int j = 0;

        switch(k){
            case 1:j = a+b+c+e; if(j==7){System.out.println(a+  "+" + b + "+" + c + "+" + e + "=7" ); break;}
            case 2:j = a-b+c+e; if(j==7){System.out.println(a+  "-" + b + "+" + c + "+" + e + "=7" ); break;}
            case 3:j = a-b+c-e; if(j==7){System.out.println(a+  "-" + b + "+" + c + "-" + e + "=7" ); break;}
            case 4:j = a-b-c+e; if(j==7){System.out.println(a+  "-" + b + "-" + c + "+" + e + "=7" ); break;}
            case 5:j = a-b-c-e; if(j==7){System.out.println(a+  "-" + b + "-" + c + "-" + e + "=7" ); break;}
            case 6:j = a+b-c+e; if(j==7){System.out.println(a+  "+" + b + "-" + c + "+" + e + "=7" ); break;}
            case 7:j = a+b+c-e; if(j==7){System.out.println(a+  "+" + b + "+" + c + "-" + e + "=7" ); break;}
            case 8:j = a+b-c-e; if(j==7){System.out.println(a+  "+" + b + "-" + c + "-" + e + "=7" ); break;}
            default:System.out.println("間違い"); break;
        }
    }

}
