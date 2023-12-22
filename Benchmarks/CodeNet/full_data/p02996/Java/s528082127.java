import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        ArrayList<Work> li = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            int d = sc.nextInt();
            Work w = new Work(t,d);
            li.add(w);
        }
        Collections.sort(li);
        int total = 0;
        for(Work w : li){
            total += w.t;
            if(total > w.d){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

class Work implements Comparable<Work>{
    int t;
    int d;
    public Work(int t, int d){
        this.t = t;
        this.d = d;
    }
    public int compareTo(Work w){
        if(this.d < w.d){
            return -1;
        }else if(this.d > w.d){
            return 1;
        }else{
            return 0;
        }
    }
}
