import java.util.*;

public class Main{

    static class Pair {
        long a,b;
        public Pair(long a,long b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        Pair[] tasks = new Pair[n];

        for(int i = 0; i < n; i++){
            tasks[i] = new Pair(sc.nextLong(), sc.nextLong());
        }

        Arrays.sort(tasks, new Comparator<Pair>(){
            public int compare(Pair o1, Pair o2){
                return (int) (o1.b - o2.b);
            }
        });

        boolean flag = true;
        long sum = 0;

        for(int i = 0; i < n; i++){
            sum += tasks[i].a;
            if(sum > tasks[i].b){
                flag = false;
                break;
            }
        }

        if(flag) System.out.println("Yes");
        else System.out.println("No");

    }

}
