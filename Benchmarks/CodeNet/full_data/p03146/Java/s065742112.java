import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1000000];
        a[0] = sc.nextInt();
        
        for(int i = 1;i < 1000000;i++){
            if(a[i-1]%2 == 0){//奇数の処理
                a[i] = 3*a[i-1]+1;
            }else{//偶数の処理
                a[i] = a[i-1]/2;
            }
            for(int j = 1;j < i;j++){
                if(a[i] == a[j]){
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}