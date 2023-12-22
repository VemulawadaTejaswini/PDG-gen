import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
PriorityQueue<Integer> a = new PriorityQueue<>();
PriorityQueue<Integer> b = new PriorityQueue<>();
for(int i=0;i<n;++i)a.add(sc.nextInt());
for(int i=0;i<n;++i)b.add(sc.nextInt());
long mod = (long)1e9+7;
int ac=0, bc=0;
long ans =1;
a.add(Integer.MAX_VALUE);b.add(Integer.MAX_VALUE);
while(a.size()>1 || b.size()>1){
if(a.peek() < b.peek()){
a.poll();
if(bc==0)++ac;
else ans = ans * (long)(bc--)%mod;
}else{
b.poll();
if(ac==0)++bc;
else ans = ans * (long)(ac--)%mod;
}
}
System.out.println(ans);
}
}
