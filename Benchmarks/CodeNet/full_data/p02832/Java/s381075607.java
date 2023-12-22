import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = -1;
        int fin = Integer.MAX_VALUE;
        int cnt = 0;
        boolean jdg = false;
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            int num = sc.nextInt();
            list.add(num);
            if(min > num)
                min = num;
        }
        int min1 = list.get(list.size()-1);
        for(int i = list.size()-1;i >= 0;i--){
            if(min1 <= list.get(i)){
                cnt++;
            }else{
                min1 = list.get(i);
            }
        }
            System.out.println((cnt >= 1 && n != cnt ) || (n == list.get(0))?cnt-1:-1);
        

    }
}