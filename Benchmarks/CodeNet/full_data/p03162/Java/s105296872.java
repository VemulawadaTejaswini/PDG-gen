import java.util.*;
import java.io.*;
import java.math.*;
class Main{

	public static void main(String args[]){
		FastReader sc = new FastReader();
		int n,ch,max,i,min;
		n=sc.nextInt();
		ch=0;
		max=0;
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		if(n==1){
			System.out.println(Math.max(a[0],Math.max(b[0],c[0])));
			System.exit(0);
		}
		i=0;
		if(a[i]>b[i] && a[i]>c[i]){
			ch=1;
			max=a[i];
		}
		else if(b[i]>a[i]&& b[i]>c[i]){
			ch=2;
			max=b[i];
		}
		else if(c[i]>a[i] && c[i]>b[i]){
			ch=3;
			max=c[i];
		}
		else if(a[i]==b[i] && b[i]==c[i]){
			max=a[i];
			min=Math.min(a[i+1],Math.min(b[i+1],c[i+1]));
			if(a[i+1]==min)
				ch=1;
			else if(b[i+1]==min)
				ch=2;
			else if(c[i+1]==min)
				ch=3;
		}
		else{
			max=Math.max(a[i],Math.max(b[i],c[i]));
			if(a[i]==max && b[i]==max){
				min=Math.min(a[i+1],b[i+1]);
				if(a[i+1]==min)
					ch=1;
				else 
					ch=2;
			}
			else if(a[i]==max && c[i]==max){
				min=Math.min(a[i+1],c[i+1]);
				if(a[i+1]==min)
					ch=1;
				else 
					ch=3;
			}
			else if(b[i]==max && c[i]==max){
				min=Math.min(b[i+1],c[i+1]);
				if(b[i+1]==min)
					ch=2;
				else 
					ch=3;
			}
		}
		for(i=1;i<n-1;i++){
			if(ch==1){
				if(b[i]>c[i]){
					ch=2;
					max+=b[i];
				}
				else if(c[i]>b[i]){
					ch=3;
					max+=c[i];
				}
				else{
					max+=b[i];
					if(b[i+1]<=c[i+1])
						ch=2;
					else 
						ch=3;
				}
			}
			else if(ch==2){
				if(a[i]>c[i]){
					ch=1;
					max+=a[i];
				}
				else if(c[i]>a[i]){
					ch=3;
					max+=c[i];
				}
				else{
					max+=a[i];
					if(a[i+1]<=c[i+1])
						ch=1;
					else 
						ch=3;
				}
			}
			else if(ch==3){
				if(a[i]>b[i]){
					ch=1;
					max+=a[i];
				}
				else if(b[i]>a[i]){
					ch=2;
					max+=b[i];
				}
				else{
					max+=b[i];
					if(a[i+1]<=b[i+1])
						ch=1;
					else 
						ch=2;
				}
			}
		}
		if(ch==1)
			max+=Math.max(b[i],c[i]);
		else if(ch==2)
			max+=Math.max(a[i],c[i]);
		else 
			max+=Math.max(a[i],b[i]);
		out.println(max);
		out.flush();
	}

	static PrintWriter out;
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br=new BufferedReader(new InputStreamReader(System.in));
			out=new PrintWriter(System.out);
		}
		String next(){
			while(st==null || !st.hasMoreElements()){
				try{
					st= new StringTokenizer(br.readLine());
				}
				catch (IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt(){
			return Integer.parseInt(next());
		}
		long nextLong(){
			return Long.parseLong(next());
		}
		double nextDouble(){
			return Double.parseDouble(next());
		}
		String nextLine(){
			String str = "";
			try{
				str=br.readLine();
			}
			catch(IOException e){
				e.printStackTrace();
			}
			return str;
		}
	}

	static class pair{
		int first,second;
		pair(int f,int s){
			first=f;
			second=s;
		}
	}

	public static boolean isPrime(int n) {
		if(n<2) return false;
		for(int i=2;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}

	public static void print(int a[],int l,int r){
		int i;
		for(i=l;i<=r;i++)
			out.print(a[i]+" ");
		out.println();
	}

	public static long fastexpo(long x, long y, long p){
		long res=1;
		while(y > 0){
			if((y & 1)==1)
				res= ((res%p)*(x%p))%p;
			y= y >> 1;			
			x = ((x%p)*(x%p))%p;
		}
		return res;
	}

	public static boolean[] sieve (int n) {
		boolean primes[]=new boolean[n+1];
		Arrays.fill(primes,true);
		primes[0]=primes[1]=false;
		for(int i=2;i*i<=n;i++){
			if(primes[i]){
				for(int j=i*i;j<=n;j+=i)
					primes[j]=false;
			}
		}
		return primes;
	}

	public static long gcd(long a,long b){
        return (BigInteger.valueOf(a).gcd(BigInteger.valueOf(b))).longValue();
    }

    public static void merge(int a[],int l,int m,int r){
        int n1,n2,i,j,k;
        n1=m-l+1;
        n2=r-m;

        int L[]=new int[n1];
        int R[]=new int[n2];

        for(i=0;i<n1;i++)
            L[i]=a[l+i];
        for(j=0;j<n2;j++)
            R[j]=a[m+1+j];

        i=0;j=0;

        k=l;
        while(i<n1&&j<n2){
            if(L[i]<=R[j]){
                a[k]=L[i];
                i++;
            }
            else{
                a[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=R[j];
            j++;
            k++;
        }
    }
    public static void sort(int a[],int l,int r){
        int m;
        if(l<r){
            m=(l+r)/2;
            sort(a,l,m);
            sort(a,m+1,r);
            merge(a,l,m,r);
        }
    }
}

