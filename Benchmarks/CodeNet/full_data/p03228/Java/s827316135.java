import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
int []n=new int[2];
        int n[0] = sc.nextLine();
int n[1] = sc.nextLine();
int k = sc.nextLine();
for(int i=0;i<k;i++){
n[k%2]=n[k%2]/2;
n[(k+1)%2]+=n[k%2];
}
System.out.println(n[0]+" "+n[1]);
    }
}