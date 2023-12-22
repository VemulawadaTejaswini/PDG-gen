import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String s = scanner.nextLine();
        s = scanner.nextLine();
        boolean a[] = new boolean[N];
        boolean ans[] = new boolean[N];
        boolean checkAllx = true;
        boolean ok = false;

        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)=='o') {
                a[i]=true;
                checkAllx = false;
            }else{
                a[i]=false;
            }
        }

        
        if (checkAllx) {
            for (int i = 0;i<N;i++){
                System.out.print("W");
            }
            System.exit(0);
        }

        //羊羊
        ans[0] = ans[1] = true;
        setAns(ans, a ,N);
        if (a[0]&&ans[N-1]) {//最後羊の時
            if(a[N-1]){//最後羊o
                if (ans[N-2]) {
                    output(ans);                    
                }
            }else{//最後羊x
                if(!ans[N-2]){
                    output(ans);
                }
            }
        }
        
        if (!a[0]&&!ans[N-1]) {//最後狼の時
            if(!a[N-1]){
                if (ans[N-2]) {
                    output(ans);                    
                }//最後狼x
            }else{
                if(!ans[N-2]){
                    output(ans);
                }//最後狼o
            }
        }

        //羊狼
        ans[0] = true;
        ans[1] = false;
        setAns(ans, a ,N);
        if (!a[0]&&ans[N-1]){//最後羊の時
            if (a[N-1]) {
                if (ans[N-2]) {
                    output(ans); 
                }//最後羊o
            }else{
                if (!ans[N-2]){//最後羊x
                    output(ans);
                }
            }
        }

        if(a[0]&&!ans[N-1]){//最後狼の時
            if (!a[N-1]){
                if (ans[N-2]){
                    output(ans);
                }
            }//最後狼x
            else{
                if (!ans[N-2]){
                    output(ans);
                }
            }
            //最後狼o
        }

        //狼狼
        ans[0] = ans[1] = false;
        setAns(ans, a ,N);
        if (a[0]&&ans[N-1]) {//最後羊の時
            if(a[N-1]){//最後羊o
                if (!ans[N-2]) {
                    output(ans);                    
                }
            }else{//最後羊x
                if(ans[N-2]){
                    output(ans);
                }
            }
        }
        
        if (!a[0]&&!ans[N-1]) {//最後狼の時
            if(!a[N-1]){
                if (!ans[N-2]) {
                    output(ans);                    
                }//最後狼x
            }else{
                if(ans[N-2]){
                    output(ans);
                }//最後狼o
            }
        }

        //狼羊
        ans[1] = true;
        ans[0] = false;
        setAns(ans, a ,N);
        if (!a[0]&&ans[N-1]){//最後羊の時
            if (a[N-1]) {
                if (!ans[N-2]) {
                    output(ans); 
                }//最後羊o
            }else{
                if (ans[N-2]){//最後羊x
                    output(ans);
                }
            }
        }

        if(a[0]&&!ans[N-1]){//最後狼の時
            if (!a[N-1]){
                if (!ans[N-2]){
                    output(ans);
                }
            }//最後狼x
            else{
                if (ans[N-2]){
                    output(ans);
                }
            }
            //最後狼o
        }

        System.out.println("-1");
    }

    static boolean[] setAns(boolean[] ans,boolean[] s,int z){
        for (int i = 2;i < z;i++){
            boolean ox;//trueなら隣同じ
            if (ans[i-1] == true){
                if (s[i-1] == true){
                    ox = true;
                }else{
                    ox = false;
                }
            }else{
                if (s[i-1] == true){
                    ox = false;
                }else{
                    ox = true;
                }
            }

            if(ox){
                ans[i] = ans[i-2];
            }else{
                ans[i] = !ans[i-2];
            }
        }
        return ans;
    }

    static void output(boolean x[]){
        for (boolean b : x) {
            if (b) {
                System.out.print("S");
            } else {
                System.out.print("W");
            }
        }
        System.exit(0);
    }
}