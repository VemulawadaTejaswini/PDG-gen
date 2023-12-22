import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int []n=new int[3];
int m[]=new int[]{5,5,7};
for(int i=0;i<3;i++){
n[i]=sc.nextInt();
}
Arrays.sort(n);
boolean b=false;
for(int i=0;i<3;i++){
if(n[i]!=m[i]){
b=true;
break;
}
}
if(b)
        System.out.println("YES");
else System.out.println("NO");
}}