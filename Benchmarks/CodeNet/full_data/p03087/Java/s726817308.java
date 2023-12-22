import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int quesNum = sc.nextInt();
        String input = sc.next();

        int[] acs = new int[len];
        boolean aFlag = false;
        int cnt = 0;
        for(int j = 0; j < len; j++){
            if(aFlag){
                if(input.charAt(j)=='C')cnt++;
                aFlag = false;
            }
            else aFlag = input.charAt(j) == 'A';
            acs[j] = cnt;
        }
        
        for(int i = 0; i < quesNum; i++){
            int ans = 0;
            int left = sc.nextInt();
            int right = sc.nextInt();
          
            ans = acs[right-1] - acs[left-1];
            System.out.println(ans);
        }
    }
}