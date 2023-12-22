import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        PriorityQueue<Job> que1 = new PriorityQueue<>( (x, y) -> x.day - y.day );
        PriorityQueue<Job> selectableJob = new PriorityQueue<>( (x, y) -> y.payment - x.payment );
        
        for ( int i = 0; i < N; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            que1.add(new Job(A, B));
        }
        
        int totalPayment = 0;
        
        for( int i = 1; i <= M; i++ ){
            while ( !que1.isEmpty() ) {
                
                if ( que1.peek().day == i ) {
                    selectableJob.add( que1.poll() );
                } else {
                    break;
                }
            }
            
            if ( !selectableJob.isEmpty()){
                totalPayment += selectableJob.poll().payment;
            }
        }
        
        System.out.println(totalPayment);
    }
}

class Job {
    int day;
    int payment;
    
    public Job (int day, int payment){
        this.day = day;
        this.payment = payment;
    }
}