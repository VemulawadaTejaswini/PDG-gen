import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        String s = sc.next();
//        Long x = sc.nextLong();
        String list[] = new String[n];
        int num[] = new int[n+1];
        int order[] = new int[n+1];

        for(int i=0;i<n;i++){
            list[i] = sc.next();
            num[i]=list[i].toCharArray()[0];
            order[i]= i;
        }

        for(int i=1;i<=n;i++){
            for(int j=i-1;j>0;j--){
                if(num[j-1]>num[j]){
                    num[n]=num[j];
                    num[j]=num[j-1];
                    num[j-1]=num[n];
                    order[n]=order[j];
                    order[j]=order[j-1];
                    order[j-1]=order[n];
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(list[order[i]]);
        }
        System.out.println("");
    }
}

