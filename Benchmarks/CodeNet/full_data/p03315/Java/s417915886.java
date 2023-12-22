import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] a = new String[4];
        String s = sc.nextLine();
        int sum = 0;
        a = s.split("");
        for(int i = 0; i < a.length; i++) {
            // a[i] = sc.nextLine().split("");
            if(a[i].equals("+")){
                sum++;
            }else{
                sum--;
            }
        }
        System.out.println(sum);
    }
}