import java.util.*;
public class arrange {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
       // Sc.next();
        String ar[] = new String[n];
        int a[] = new int[n];
        String ar1[]=new String[n];
        int q[]=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Sc.next();
            ar1[i]=ar[i];
            a[i] = Sc.nextInt();
            q[i]=a[i];
            //Sc.next();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (ar[i].compareTo(ar[j]) > 0) {
                    String t = ar[j];
                    ar[j] = ar[i];
                    ar[i] = t;
                    int p = a[j];
                    a[j] = a[i];
                    a[i] = p;
                }
            }
        }
        int arr[]=new int[n];
        int y=1;
        arr[0]=0;
        for(int i=0;i<n-1;i++) {
            if (ar[i].compareTo(ar[i + 1]) != 0) {
                arr[y] = i+1;
                y++;
            }
        }
        arr[y]=n;
        for(int i=0;i<y;i++)
        {
            for(int j=arr[i];j<arr[i+1]-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    int k=a[j];
                    a[j]=a[j+1];
                    a[j+1]=k;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((ar[i].compareTo(ar1[j])==0)&&(a[i]==q[j]))
                {
                    System.out.println(j+1);
                    break;
                }
            }

        }
        }
    }

