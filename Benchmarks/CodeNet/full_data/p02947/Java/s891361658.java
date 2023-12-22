import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> strs = new ArrayList<String>();
		long ans = 0;

		for(int i= 0 ; i < n ; i++){
			char[] tmp = (sc.next()).toCharArray();
			Arrays.sort(tmp);
			String tmpstr = String.valueOf(tmp);
			strs.add(tmpstr);
		}
		Collections.sort(strs);
		long cnt = 1;
		for(int i = 1 ; i < n ; i++){
			if((strs.get(i-1)).equals(strs.get(i))){
				cnt++;
			}else{
				if(cnt == 1){
				}else{
					ans += cnt*(cnt-1)/2;
				}
				cnt=1;
			}
		}

		if(cnt == 1){
		}else{
			ans += cnt*(cnt-1)/2;
		}
		cnt=1;

		System.out.println(ans);
	}

}