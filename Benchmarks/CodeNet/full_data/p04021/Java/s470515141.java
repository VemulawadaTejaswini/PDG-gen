import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by wenzhong on 2016/8/21.
 */
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=0;
        while(in.hasNextInt()){
              n=in.nextInt();
              int len1=n/2;
              int len2=n/2;
              if(n%2==1)len1++;
              int[] array1=new int[len1];
              int[] array2=new int[len2];
              int[] array=new int[n];
              for(int i=0,i1=0,i2=0;i<n;i++){
                  if(i%2==0)array1[i1]=in.nextInt();
                  else array2[i2]=in.nextInt();
              }
            Arrays.sort(array1);
            Arrays.sort(array2);
            for(int i=0,i1=0,i2=0;i<n;i++){
                if(i%2==0)array[i]=array1[i1++];
                else array[i]=array2[i2++];
            }
            int count=0;
            for(int i=0,j=0,k=0;i<n;i++){
               if(i%2==0){
                 array[i]=array1[j++];
               }else{
                 array[i]=array2[k++];
               }
            }
            Arrays.sort(array);
            int m=0;
            for(int i=0,j=0,k=0;i<n;i++){
                if(i%2==0){
                    if(array[i]!=array1[j])array1[m++]=array1[j];
                    j++;
                }
                else{
                    if(array[i]!=array2[k])array1[m++]=array2[k];
                    k++;
                }
            }
            for(int i=0;i<m;i++){
                for(int j=i+1;j<m;j++){
                   if(array1[i]>array1[j]){
                       int tmp=array1[i];
                       array1[i]=array1[j];
                       array1[j]=tmp;
                       count++;
                   }
                }
            }
            System.out.println(count);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
