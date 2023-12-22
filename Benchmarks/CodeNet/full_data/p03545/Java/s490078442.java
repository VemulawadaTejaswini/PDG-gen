import java.util.*;

class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String[] b = a.split("");
		int[] c = new int[4];
		for (int i=0;i<4;i++) {
			c[i]=Integer.parseInt(b[i]);
		}

		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(0,"+");
		map.put(1,"-");

		int[] d = new int[3];
		loop:for (Integer i=0;i<2;i++) {
			if (i==0) {
				d[0]=c[0]+c[1];
			}else {
				d[0]=c[0]-c[1];
			}
			for (Integer k=0;k<2;k++) {
				if (k==0) {
					d[1]=d[0]+c[2];
				}else {
					d[1]=d[0]-c[2];
				}
				for (Integer m=0;m<2;m++) {
					if (m==0) {
						d[2]=d[1]+c[3];
						if (d[2]==7) {
							System.out.println(c[0]+map.get(i)+c[1]+map.get(k)+c[2]+map.get(m)+c[3]+"=7");
							break loop;
						}
					}else {
						d[2]=d[1]-c[3];
						if (d[2]==7) {
							System.out.println(c[0]+map.get(i)+c[1]+map.get(k)+c[2]+map.get(m)+c[3]+"=7");
							break loop;
						}
					}
				}
			}
		}
	}
}