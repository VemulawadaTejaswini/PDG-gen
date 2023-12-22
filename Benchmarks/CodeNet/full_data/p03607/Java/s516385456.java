import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iin = sc.nextInt();
		ArrayList<Long> lia = new ArrayList<Long>();
		long iia = 0;
		for(int i=0;i<iin;i++){
			iia = sc.nextLong();
			if(lia.indexOf(iia)==-1){
				lia.add(iia);
			}
			else{
				lia.remove(lia.indexOf(iia));
			}
		}
		System.out.println(lia.size());
    }
}
