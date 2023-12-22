import java.io.*;
import java.util.*;
 
public class Main {

	public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		int n = in.nextInt();
		int arr[] = new int[n];
		int indexes[] = new int[n];
		int mark[] = new int[n];
		for(int i=0;i<n;i++)
			mark[i]=0;
		for(int noice=0;noice<n;noice++)
		{
			arr[noice]=in.nextInt();
			indexes[noice]=noice;
		}
		int ct=0; long ans =0;
		mergesort(arr,indexes,0,n-1); int i=0;
		while(ct<(n/2))
		{
			int ix = indexes[i];
			long val = (long)arr[i]; 
			if((ix-1)>=0 && mark[ix-1]==1)
			{
				i++; continue;
			}
			if((ix+1)<n && mark[ix+1]==1)
			{
				i++; continue;
			}
			ans+=val; i++; ct++; mark[ix]=1;
		}
		out.println(ans);
		// int arr2[] = new int[n/2];
		// int arr1[] = new int[n-(n/2)];
		// int indexes1[] = new int[n-(n/2)];
		// int indexes2[] = new int[n/2];
		// int k=0;
		// for(int i=0;i<n;i+=2)
		// {
		// 	arr1[k]=arr[i];
		// 	indexes1[k++]=i;
		// }
		// k=0;
		// for(int i=1;i<n;i+=2)
		// {
		// 	arr2[k]=arr[i];
		// 	indexes2[k++]=i;
		// }
		// mergesort(arr1,0,arr1.length-1);
		// mergesort(arr2,0,arr2.length-1);
		// long ans1 = 0;
		// long ans2 = 0;
		// out.println("half "+(n/2));
		
		// int ct=0; int i=0; int j=0;
		// while(ct<(n/2) && i<arr1.length && j<arr2.length)
		// {
		// 	if(arr1[i]>=arr2[j])
		// 	{
		// 		if((i+1)<n && mark[i+1]==1)
		// 		{
		// 			i++;continue;
		// 		}
		// 		else if((i-1)>=0 && mark[i-1]==1)
		// 		{
		// 			i++
		// 		}
		// 	}
		// }
		// while(ct<(n/2) && i<arr1.length)
		// {
		// 	ans+=(long)arr1[i++];
		// 	ct++;
		// }
		// while(ct<(n/2) && j<arr2.length)
		// {
		// 	ans+=(long)arr1[j++];
		// 	ct++;
		// }
		// out.println(Math.max(ans1,ans2));
        out.close();
	}
		public static void merge(int[] arr, int indexes[],int first,int mid,int last){
	
			int a[]=new int[mid-first+1];
	
			int b[]=new int[last-mid];
	
			int c[]=new int[mid-first+1];
	
			int d[]=new int[last-mid];
	
			int pahela,dusra;	
			pahela=dusra=0;
	
			for(pahela=0;pahela<mid-first+1;pahela++)
			{
				a[pahela]=arr[first+pahela];
				c[pahela]=indexes[first+pahela];
			} 
	
			for(dusra=0;dusra<last-mid;dusra++)
			{
				b[dusra]=arr[mid+1+dusra];
				d[dusra]=indexes[mid+1+dusra];
			}
	
			pahela=0;
			dusra=0;
			int maha=first;
	
			while(pahela<mid-first+1 && dusra<last-mid)
			{
				if(a[pahela]>b[dusra])
				{
					arr[maha]=a[pahela];
					indexes[maha]=c[pahela];
					maha++;
					pahela++;
				}
	
				else
				{
					arr[maha]=b[dusra];
					indexes[maha]=d[dusra];
					maha++;
					dusra++;
				}
			}
	
			while(pahela<mid-first+1)
			{
				arr[maha]=a[pahela];
				indexes[maha]=c[pahela];
				maha++;
				pahela++;
			}
	
			while(dusra<last-mid){
				arr[maha]=b[dusra];
				indexes[maha]=d[dusra];
				maha++;
				dusra++;
			}
		}
		public static void mergesort(int arr[],int indexes[],int first,int last)
		{
			if(first < last) {
			int mid=(first+last)/2;
			mergesort(arr,indexes,first,mid);
			mergesort(arr,indexes,mid+1,last);
			merge(arr,indexes,first,mid,last);
		}
		}
		
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

}