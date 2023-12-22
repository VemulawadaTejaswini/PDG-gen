import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] w = new String[n];
        boolean ans = true;
        for(int i =0;i<n;i++){
            w[i]= sc.next();
        }
        for(int i = 0;i<n-1;i++){
            if(!w[i].substring(w[i].length()).equals(w[i+1].substring(0,0))){
                ans = false;
                break;
            }
        }
        Arrays.sort(w);
        for(int i = 0;i<n-1;i++){
            if(w[i].equals(w[i+1])){
                ans = false;
                break;
            }
        }
        if(ans){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}