import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Scanner ss=new Scanner(System.in);
        int N=sc.nextInt();
        int [] a;
        a=new int[N];
        for(int i=0;i<=N-1;i++){
            a[i]=sc.nextInt();
        }
        int [] b;
        b=new int[N];
        for(int j=0;j<=N-1;j++){
            b[j]=ss.nextInt();
        }
        int sum=0;
        for(int ll:a){
            sum += ll;
        }
        int sumsum=0;
        for (int xx:b){
            sumsum += xx;
        }
        for(int w=1;;w++){
            if(sum*w==sumsum*w){System.out.println("Yes");
            break;

            }else{System.out.println("No");
        break;}

        }
        
    }
    }

