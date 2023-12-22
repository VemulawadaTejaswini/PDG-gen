import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] nums1=new int[m][2],nums2=new int[m][2];
    for(int i=0;i<m;i++){
      nums1[i][0]=sc.nextInt();
      nums2[i][0]=sc.nextInt();
      nums1[i][1]=nums2[i][1]=i;
    }
    boolean[] done=new boolean[m];
    Comp comp=new Comp();
    Arrays.sort(nums1,comp);
    Arrays.sort(nums2,comp);
    int ind1=0;
    int ind2=0;
    int tmp;
    int ans=0;
    while(ind1<m&&ind2<m){
        while(ind2<m&&done[nums2[ind2][1]]){
            ind2++;
        }
        ans++;
        tmp=nums2[ind2][0];
        while(ind1<m&&nums1[ind1][0]<tmp){
            done[nums1[ind1][1]]=true;
            ind1++;
        }
    }
    System.out.println(ans);
  }
}
class Comp implements Comparator {

    int index = 0;

    void set_index (int i) {
        index = i;
    }

    public int compare (Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_a[index] - int_b[index]);
    }

}