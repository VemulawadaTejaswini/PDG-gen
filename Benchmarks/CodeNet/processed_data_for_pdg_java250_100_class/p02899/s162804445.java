public class Main{
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
		int[] arr=new int[n+1];
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<n;i++){
			int x=s.nextInt();
			map.put(x,i+1);
		}
		StringBuilder sb=new StringBuilder();
for(int i=1;i<=n;i++){
	sb.append(map.get(i)+" ");
}		
System.out.println(sb);
		}
    }
