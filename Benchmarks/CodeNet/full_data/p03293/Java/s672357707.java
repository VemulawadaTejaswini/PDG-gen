import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        String t = sc.next();
        boolean can = false;
        for(int i=0;i<s.length;i++){
            StringBuilder builder = new StringBuilder();
            char[] rotated = rotateArray(s, i);
            if(!builder.append(rotated).toString().equals(t)){
                continue;
            }
            can = true;
            break;
        }
        if(can){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static char[] rotateArray(char[] c, int d){
        char[] newc = new char[c.length];
        for(int i=0;i<c.length;i++){
            newc[(i+d)%c.length] = c[i];
        }
        return newc;
    }
    
    private static void sort(int[] d, int left, int right){
        if(left>=right){return;}
        int p = d[(left+right)/2];
        int l=left, r=right;
        int tmp;
        while(l<=r){
            while(d[l]<p){l++;}
            while(d[r]>p){r--;}
            if(l<=r){
                tmp=d[l];
                d[l] = d[r];
                d[r] = tmp;
                l++; r--;
            }
        }
        sort(d, left, r);
        sort(d, l, right);
    }
}