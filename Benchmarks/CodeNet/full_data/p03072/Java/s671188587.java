import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int po[]=new int[n];
        for(int i=0;i<n;i++)po[i]=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            boolean b=true;
            for(int j=0;j<i;j++){
                if(po[i]<po[j])b=false;
            }
            if(b)count++;
        }
        System.out.println(count);
    }
}
