import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int quesNum = sc.nextInt();
        String input = sc.next();

        List<Integer> acs = new ArrayList<>();
        boolean aFlag = false;
        for(int j = 0; j < len; j++){
            if(aFlag){
                if(input.charAt(j)=='C')acs.add(j-1);
                aFlag = false;
            }
            aFlag = input.charAt(j) == 'A';
        }
        
        for(int i = 0; i < quesNum; i++){
            int ans = 0;
            int left = sc.nextInt();
            int right = sc.nextInt();
            for(int j = 0; j < acs.size(); j++){
                int num = acs.get(j);
                if(num >= right-1)break;
                if(num >= left-1)ans++;
            }

            System.out.println(ans);
        }
    }
}