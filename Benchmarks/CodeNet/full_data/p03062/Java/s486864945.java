import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b=new int[n];
        int sum=0;
        int flag=0;
        int temp=1000000;
        for(int i=0;i<n;++i){
          b[i]= sc.nextInt();
          flag+=b[i]<0?1:0;
          b[i]*=b[i]<0?-1:1;
          sum+=b[i];
          temp=temp<b[i]?temp:b[i];
        }
        if(flag%2==0){
          System.out.println(sum);
        }else{
          System.out.println(sum-2*temp);
        }
    }
}
