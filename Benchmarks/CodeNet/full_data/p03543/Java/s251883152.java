import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        boolean is=false;
        int cnt=0;
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1])cnt++;
            else cnt=0;
            if(cnt>=2)is=true;
        }
        System.out.println(is?"Yes":"No");
    }
}
