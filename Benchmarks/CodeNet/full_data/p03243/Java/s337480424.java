import java.util.*;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int[] a = new int[3];
        for(int i=0;i<3;i++){
            a[i]=s.charAt(i)-'0';
        }
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<3;i++) sb.append(a[2]);


        System.out.println(sb.toString());
    }
}
