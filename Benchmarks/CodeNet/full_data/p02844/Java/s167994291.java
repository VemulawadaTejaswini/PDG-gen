import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        String s = sc.next();
        String tmp="\0";
        ArrayList<String> pins = new ArrayList<String>();
        
        int count=0;
        boolean overlap = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    tmp=new String(s.charAt(i)+""+s.charAt(j)+""+s.charAt(k));
                    overlap = false;
                    for(int l=0;l < count;l++){
                        if(tmp.equals(pins.get(l))) overlap = true;
                    }
                    if(!overlap){
                        count++;
                        pins.add(tmp);
                    }
                }
            }
        }
        System.out.println(count);
    }
}