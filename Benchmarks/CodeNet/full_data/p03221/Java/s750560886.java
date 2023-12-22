import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();      
        Scanner sc = new Scanner(System.in);
        String gpy = "";
        int gn = 1;                
        int N = sc.nextInt();  
        int M = sc.nextInt(); 
        for(int c=0; c<M; c++) {
            int p = sc.nextInt();
            int y = sc.nextInt();          
            String pi = String.format("%06d",p);
            String yi = String.format("%010d",y);
            String py = pi + yi;
            map.put(c+"", py);
        }
        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> mapping1, Map.Entry<String, String> mapping2) {
                return mapping1.getValue().compareTo(mapping2.getValue());
            }
        });

        for(Map.Entry<String,String> mapping:list){ 
            String gp = mapping.getValue().substring(0, 6);
            if (gpy.equals("") || gpy.equals(gp)) {
                gpy = gp;
                map.put(mapping.getKey(), gp+String.format("%06d",gn));
                gn +=1;
            }
            else {
                gpy = gp;
                gn = 1;
                map.put(mapping.getKey(), gp+String.format("%06d",gn));
            }                    
       }     
        
        for (String key : map.keySet()) {
        System.out.println(map.get(key));
        }   
        sc.close();
    }
}