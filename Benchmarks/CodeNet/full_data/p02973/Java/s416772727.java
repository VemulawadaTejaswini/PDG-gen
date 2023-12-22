import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a = new int[n];
    List<Integer> c = new ArrayList<Integer>();
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    c.add(a[0]);
    for(int i=1;i<n;i++){
        int left=0;
        int right=c.size();
        while(true){
            if(left>right){
                break;
            }
            if(left==c.size()){
                right--;
                break;
            }
            int gaze=c.get((left+right)/2);
            if(gaze<=a[i]-1){
                left=(left+right)/2+1;
            }else if(gaze>a[i]-1){
                right=(left+right)/2-1;
            }
        }
        if(left==0){
            c.add(0,a[i]);
        }else{
            c.set(right,a[i]);
        }
    }
    System.out.println(c.size());
  }
}