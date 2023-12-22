import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[4];
        for(int i=0;i<4;i++){
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        if(n[0]!=1 && n[1]!=4 && n[2]!=7 && n[3]!=9)System.out.println("YES");
        else System.out.println("NO");
    }
}
