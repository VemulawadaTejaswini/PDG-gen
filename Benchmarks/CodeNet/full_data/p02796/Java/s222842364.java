import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Robot> li = new ArrayList<Robot>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int a = sc.nextInt();
            li.add(new Robot(x-a,x+a));
        }
        Collections.sort(li);
        int ans = 0;
        int left = Integer.MAX_VALUE;
        for(Robot r : li){
            if(left >= r.r){
                ans++;
                left = r.l;
            }else{
                left = Math.max(left,r.l);
            }
        }
        System.out.println(ans);
    }
}

class Robot implements Comparable<Robot>{
    int l,r;
    public Robot(int l, int r){
        this.l = l;
        this.r = r;
    }
    
    public int compareTo(Robot r){
        if(this.r > r.r){
            return -1;
        }else if(this.r < r.r){
            return 1;
        }else{
            return 0;
        }
    }
}