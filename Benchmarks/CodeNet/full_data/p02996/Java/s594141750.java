import java.util.*;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Work> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(new Work(sc.nextLong(), sc.nextLong()));
        }
        long totalWork = 0;
        boolean flg = true;
        list.sort(Comparator.comparingLong(Work::getB));
        for(int i = 0; i < list.size(); i++){
            totalWork += list.get(i).getA();
            if(totalWork > list.get(i).getB()){
                flg = false;
                break;
            }
        }
        System.out.println(flg ? "Yes" : "No");
        
    }
    
    public static class Work{
        private long A;
        private long B;
        public Work(long A, long B){
            this.A = A;
            this.B = B;
        }
        public long getA(){
            return A;
        }
        public long getB(){
            return B;
        }
    }
}
