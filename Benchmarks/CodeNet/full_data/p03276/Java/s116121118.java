

import java.util.*;
public class Main {

    public static void swap(int[] num, int l, int h){
        int p = num[l];
        num[l] = num[h];
        num[h] = p;
    }

    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n;i++)
            num[i] = sc.nextInt();
        int index = n/2+1;
        if( n== 1)
            System.out.println(num[0]);
        System.out.println(findKthLargest(num,index));

    }


    static public int findKthLargest(int[] nums, int k) {
        if (nums.length == 1)
            return nums[0];
        int l = 0, r = nums.length-1;
        while (k>= 0){
            int pos = partition(nums, l,r);
            if (pos- l +1 > k){
                r= pos-1;
            }
            else if (pos -l + 1 < k){
                k -= (pos - l +1);
                l = pos+1;
            }else {
                return nums[pos];
            }
        }
        return 0;
    }

    static public int partition(int[] nums, int left, int right){
        int pilotIndex = left +(right- left)/2;
        int p = nums[pilotIndex];
        swap(nums,pilotIndex,right);

        int l = left, r= right-1;
        while (l <= r){
            if (nums[l] < p){
                l++;
            }else if (nums[r] >= p){
                r--;
            }else{
                swap(nums,l++,r--);
            }
        }
        swap(nums,l,right);
        return l;
    }

}