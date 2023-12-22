import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int startWith = 0;
        int endWith = 0;
        int b_any_a = 0;
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            String str = sc.next();
            for(int x = 0;x < str.length()-1;x++){
                if(str.substring(x,x+2).equals("AB")) ans++;
            }
            if(str.charAt(0) == 'B' & str.charAt(str.length()-1) == 'A'){
                b_any_a++;
            }else{
                if(str.charAt(0) == 'B') startWith++;

                if(str.charAt(str.length()-1) == 'A') endWith++;
            } 
        }

        if(b_any_a == 0){
            ans+=Math.min(startWith,endWith);
        }else if(startWith + endWith == 0){
            ans += b_any_a - 1;
        }else if(startWith + endWith > 0){
            ans += b_any_a + Math.min(startWith,endWith);
        }

        System.out.println(ans);
    }
}