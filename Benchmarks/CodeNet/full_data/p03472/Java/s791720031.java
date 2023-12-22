import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int H=scanner.nextInt();
        int[] aArray=new int[N];
        int[] bArray=new int[N];
        for(int i=0;i<N;i++){
            aArray[i]=scanner.nextInt();
            bArray[i]=scanner.nextInt();
        }
        int aMax=max(aArray);
        bArray=quickSort(bArray,0,bArray.length-1);
        //Arrays.stream(bArray).forEach(System.out::println);
        int sumAttack=0;
        int count=0;
        for(int i=bArray.length-1;i>=0;i--){
            if(bArray[i]<aMax)break;
            if(sumAttack>H){
                System.out.println(count);
                return;
            }
            sumAttack+=bArray[i];
            count++;
        }
        //System.out.println("H="+H+", sumAttack="+sumAttack+", aMax="+aMax+", count="+count);
        System.out.println((int)Math.ceil((H-sumAttack)/(double)aMax)+count);


    }
    public static int max(int[] ints){
        int result=Integer.MIN_VALUE;
        for(int i=0;i<ints.length;i++){
            result=result<ints[i]?ints[i]:result;
        }
        return result;
    }
    public static int[] quickSort(int[] arr, int left, int right) {
        if(left<=right) {
            int p = arr[(left+right)/2];
            int l = left;
            int r = right;
            while(l <= r) {
                while(arr[l] < p) l++;
                while(arr[r] > p) r--;

                if(l<=r) {
                    int tmp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = tmp;
                    l++;
                    r--;
                }
            }

            quickSort(arr, left, r);
            quickSort(arr, l, right);
        }
        return arr;
    }
}
