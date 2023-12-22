import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long tmpa;
        SmallQueue<Long> sq=new SmallQueue<>(n+1);
        BigQueue<Long> bq=new BigQueue<>(n+1);
        long[][] ans=new long[n-1][2];
        long swap;
        for(int i=0;i<n;i++){
            tmpa=sc.nextInt();
            sq.add(tmpa);
            bq.add(tmpa);
        }
        long tmp;
        for(int i=0;i<n-2;i++){
            tmp=Math.abs((ans[i][0]=(Long)sq.poll())-(ans[i][1]=(Long)bq.poll()));
            if(Math.abs((Long)sq.peek())>Math.abs((Long)bq.peek())){
                sq.add(tmp);
                bq.add(tmp);
                swap=ans[i][0];
                ans[i][0]=ans[i][1];
                ans[i][1]=swap;
            }else{
                sq.add(-tmp);
                bq.add(-tmp);
            }
        }
        System.out.println(Math.abs((Long)bq.peek()-(Long)sq.peek()));
        for(int i=0;i<n-2;i++){
            System.out.println(ans[i][0]+" "+ans[i][1]);
        }
        System.out.print(bq.peek()+" "+sq.peek());
    }
}
class SmallQueue<T> extends PQueue {

    @Override
    long get(Object obj) {
        Long t = (Long) obj;
        return t;
    }

    public SmallQueue(int size) {
        nums = (T[]) new Object[size];
    }
}
class BigQueue<T> extends PQueue{
    long get(Object obj){
        Long t=(Long)obj;
        return 0-t;
    }
    public BigQueue(int size){
        nums=(T[]) new Object[size];
    }
}
abstract class PQueue<T> {

    abstract long get(T obj);
    T[] nums;
    int length = 0;

    void add(T obj) {
        nums[length] = obj;
        int current = length;
        length++;
        T tmp;
        while (get(nums[current]) < get(nums[(current - 1) / 2])) {
            tmp = nums[current];
            nums[current] = nums[(current - 1) / 2];
            nums[(current - 1) / 2] = tmp;
            current = (current - 1) / 2;
        }
    }

    T peek() {
        return nums[0];
    }

    T poll() {
        T tmp1 = nums[0];
        nums[0] = nums[length - 1];
        nums[length - 1] = null;
        int current = 0;
        T tmp2;
        while (true) {
            try {
                if (get(nums[current]) > get(nums[current * 2 + 1]) && (nums[current * 2 + 2] == null || get(nums[current * 2 + 1]) < get(nums[current * 2 + 2]))) {
                    tmp2 = nums[current];
                    nums[current] = nums[current * 2 + 1];
                    nums[current * 2 + 1] = tmp2;
                    current = current * 2 + 1;
                } else if (get(nums[current]) > get(nums[current * 2 + 2])) {
                    tmp2 = nums[current];
                    nums[current] = nums[current * 2 + 2];
                    nums[current * 2 + 2] = tmp2;
                    current = current * 2 + 2;
                } else {
                    break;
                }
            } catch (Exception e) {
                break;
            }

        }
        length--;
        return tmp1;
    }

    void remove() {
        poll();
    }
    int size(){
        return length;
    }
}