import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        List<Long> result = new ArrayList<>();
        Map<Integer, Vertex> vMap = new HashMap<>();
        vMap.put(1, new Vertex(1, new ArrayList<Vertex>()));
        result.add(0L);
        for(int i = 1; i < N; i++){
            result.add(0L);
            int a = sc.nextInt();
            int b = sc.nextInt();
            Vertex vertex = vMap.getOrDefault(a, new Vertex(a, new ArrayList<Vertex>()));
            Vertex vertexB = vMap.getOrDefault(b, new Vertex(b, new ArrayList<Vertex>()));
            vertex.v.add(vertexB);
            vMap.merge(a, new Vertex(a, vertex.v), (k, v) -> new Vertex(a, vertex.v));
            vMap.merge(b, new Vertex(b, vertexB.v), (k, v) -> new Vertex(b, vertexB.v));
        }
        for(int i = 0; i < Q; i++){
            int p = sc.nextInt();
            int x = sc.nextInt();
            Vertex v = vMap.get(p);
            v.addValue(x);
            vMap.replace(p, v);
        }
        Vertex base = vMap.get(1);
        calc(0, base, vMap, result);
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
    
    public static class Vertex{
        public List<Vertex> v;
        public int vNum = 0;
        public long value = 0;
        Vertex(int vNum, List<Vertex> v){
            this.v = v;
            this.vNum = vNum;
        }
        
        public void addValue(long value){
            this.value += value;
        }
    }
    
    public static void calc(long value, Vertex base, Map<Integer, Vertex> vMap, List<Long> resultMap){
        List<Vertex> vList = base.v;
        resultMap.set(base.vNum - 1, value + base.value);
        if(vList == null || vList.size() == 0){
            return;
        }else{
            for(int i = 0; i < vList.size(); i++){
                calc(value + base.value, vMap.get(vList.get(i).vNum), vMap, resultMap);
            }
        }
    }
}
