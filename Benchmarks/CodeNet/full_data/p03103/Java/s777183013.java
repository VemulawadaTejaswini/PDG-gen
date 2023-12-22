import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long a[]=new long[n];
        int b[]=new int[n];
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            b[i]=sc.nextInt();
            map.put(String.valueOf(a[i]),b[i]);
        }
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                a[i]+=a[i+1];
                a[i+1]=0;
                b[i]+=b[i+1];
                b[i+1]=0;
            }
        }
        for(int i=0;i<n;i++){
            map.put(String.valueOf(a[i]),b[i]);
        }
        Arrays.sort(a);
        long total=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(String.valueOf(a[i]))){
                if(m>map.get(String.valueOf(a[i]))){
                    m-=map.get(String.valueOf(a[i]));
                    total+=a[i]*map.get(String.valueOf(a[i]));
                }else{
                    total+=m*a[i];
                    break;
                }
            }
        }
        System.out.println(total);

    }
}