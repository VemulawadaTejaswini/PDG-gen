import java.util.*;

public class Main {
    public static class QueueforLong{
        private int max,front,rear,number;
        private long[] queue;
    
        public class EmptyIntQueueException extends RuntimeException{
          public EmptyIntQueueException(){}
        }
    
        public class OverflowIntQueueException extends RuntimeException{
            public OverflowIntQueueException(){}
        }
    
        public QueueforLong(int capacity){
            max=capacity;
            front=rear=number=0;
            try{
                queue=new long[max];
            }catch(OutOfMemoryError e){
                max=0;
            }
        }
    
        public long enqueue(long A){
            if(number>=max) throw new OverflowIntQueueException();
            queue[rear++]=A;
            number++;
            if(rear>=max) rear=0;
            return A;
        }
    
    public long dequeue(){
      if(number==0) throw new EmptyIntQueueException();
      long tmp=queue[front];
      queue[front]=0;
      if(++front==max) front=0;
      number--;
      return tmp;
    }
    
    public void getString(){
        System.out.print("[ ");
      for(int i=0;i<max;i++){
        System.out.print(queue[i]+" ");
      }
      System.out.println(" ]");
    }

    public long peek(){
      return queue[front];
    }
    
    public int indexOf(long c){
      for(int i=0;i<number;i++){
        if(queue[(front+i)%max]==c){
          return (front+i)%max;
        }
      }
      return -1;
    }
  }
  
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        QueueforLong queue=new QueueforLong(5*K);
        long res=0;
        
        for(int i=1;i<10;i++){
            res=queue.enqueue(i);
        }
        
        for(int i=0;i<K-1;i++){
            long tmp=queue.dequeue();
            if(tmp%10!=0){
                res=queue.enqueue((long)(tmp*10+(tmp%10)-1));
            }
            res=queue.enqueue((long)(tmp*10+(tmp%10)));
            if(tmp%10!=9){
                res=queue.enqueue((long)(tmp*10+(tmp%10)+1));
            }
        }
        
        long ans=queue.dequeue();
        
        System.out.println(ans);
    }
}
