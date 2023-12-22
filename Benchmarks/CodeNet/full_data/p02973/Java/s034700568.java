import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 1; i<n+1; i++) a[i] = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue();
        queue.add(a[1]);
        for(int i = 2; i<n+1; i++) {
            //System.out.println(queue.size());

            if(queue.size()>=0) {
                if(queue.peek() >= a[i]) {

                    queue.add(a[i]);
                }
            }
            else {
                int[] buf = new int[n+1];
                int index = 0;
                int min = 0;
                while(queue.size()!=0 && queue.peek()<a[i]) {
                    min = queue.poll();
                    buf[index] = min;
                    index++;

                }
                for(int j = 0; j<index; j++) {
                    if( buf[j]==min) continue;
                    queue.add(buf[j]);
                }
            }
            //System.out.println(queue.size());
        }
        System.out.println(queue.size());
    }

}
