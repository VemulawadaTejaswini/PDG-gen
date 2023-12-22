import java.util.*;

class Main{
	public static void main(String[] $){
    Map<Integer, Integer> mMap = new HashMap<Integer, Integer>();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
    for(int i  = 1 ; i <= n ; i++){
         mMap.put( in.nextInt(), i);
    }
        // キーでソートする
        Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey);
        
        for (Integer nKey : mMap.keySet())
        {
            System.out.print(mMap.get(nKey) +" ");
        }
		
	}
}
