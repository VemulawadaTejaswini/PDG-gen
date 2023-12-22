import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int D=Integer.parseInt(sc.next());
int N=Integer.parseInt(sc.next());
    switch (D) {
        case 0:
            System.out.println(N);
            break;
        case 1:
            {
                int i=0,count=0;
                while(true){i++;
                if(i%100==0&&1%10000!=0)count++;
                if(count==N){System.out.println(i);break;}
                }               break;
            }
        default:
            {
                int i=0,count=0;
                while(true){i++;
                if(i%10000==0&&i%1000000!=0)count++;
                if(count==N){System.out.println(i);break;}
                }               break;
            }
    }


}
}