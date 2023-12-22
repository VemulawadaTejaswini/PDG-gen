import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        String q = sc.nextLine();
        int data[] = new int[length+1];
        for(int i = 2;i<=length;i++){
            if(q.substring(i -2,i).equals("AC")){
                data[i] = data[i-1] + 1;
            }else{
                data[i] = data[i-1];
            }
        }
        int tmp = 0;
        int ans[] = new int[n];
        for(int i = 0;i<n;i++){
            tmp = sc.nextInt();
            ans [i] = data[sc.nextInt()] - data[tmp];
            sc.nextLine();
        }
        for(int i = 0;i<n;i++){
            System.out.println(ans[i]);        
        }
    }
}