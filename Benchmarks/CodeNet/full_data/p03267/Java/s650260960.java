import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        sc.close();
        int n=0, m=0;
        while(l>(1<<n++));
        StringBuilder sb =new StringBuilder();
        int sum=0;
        for(int bit=0;bit<n-1;bit++){
            sb.append((bit+1)+" "+(bit+2)+" "+0+"\n");
            m++;
            if(bit<n-2){
                sb.append((bit+1)+" "+(bit+2)+" "+(1<<bit)+"\n");
                m++;
                if((l&(1<<bit))!=0){
                    sb.append((bit+1)+" "+(n+1)+" "+(l-sum-(1<<bit))+"\n");
                    sum+=(1<<bit);
                    m++;
                }
            }
        }
        System.out.println(n+" "+m);
        System.out.print(sb);
    }
}
