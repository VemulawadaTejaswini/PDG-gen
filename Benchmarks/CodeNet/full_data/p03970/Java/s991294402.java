import java.util.*;
public class Main{
	private static String board = "CODEFESTIVAL2016";
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        while(cin.hasNext()){
        	int n = cin.nextInt();
        	ArrayList<String> list = new ArrayList<String>();
        	for(int i=0;i<n;i++){
        		list.add(cin.next());
        	}
        	String[] list1 = (String[])list.toArray(new String[n]);
        	int q = cin.nextInt();
        	int[] source = new int[q];
        	String[] order = new String[q];
            for(int i=0;i<q;i++){
            	source[i] = cin.nextInt()-1;
        		order[i] = cin.next();
        	}
            String flg="";
            
            for(int i=0;i<source.length;i++){
            	flg = list1[source[i]];
            	String od = order[i];
            	Collections.sort(list,new Comparator(){
                    public int compare(Object obj1,Object obj2){
                        String a=(String)obj1;
                        String b=(String)obj2;
                        if(a.length()==0) return -1;
                        if(b.length()==0) return 1;
                        int index1=od.indexOf(a.charAt(0));
                        int index2=od.indexOf(b.charAt(0));
                        if(index1==index2){
                        	if(a.length()==0||b.length()==0) return 0;
                        	return compare(a.substring(1),b.substring(1));
                        }
                        if(index1>index2){return 1;}
                        return -1;
                    }
                });
            	
            	System.out.println(list.indexOf(flg)+1); 
            }
        }
    }

}