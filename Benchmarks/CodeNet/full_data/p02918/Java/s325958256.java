import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        char[] c=sc.next().toCharArray();
        sc.close();
        int h=0;
        for(int i=0;i<n;i++) if(i<n-1 && c[i]==c[i+1]) h++;
        h+=2*k;
        System.out.println(h<=n-1?h:n-1);
    }
}