import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String con = br.readLine();
        int size = Integer.parseInt(con);

        List<String> color_list = new ArrayList<>();
        List<List<Boolean>> bool_list = new ArrayList<>();
        Boolean[][] bool_array = new Boolean[size][size];

        List<Integer> result_list = new ArrayList<>();

        for(Boolean[] x: bool_array){
          Arrays.fill(x, false);
        }

        for(int i = 0; i < size -1; i++){
          String[] str_array = br.readLine().split(" ");
          bool_array[Integer.parseInt(str_array[0]) - 1][Integer.parseInt(str_array[1]) - 1] = true;
          bool_array[Integer.parseInt(str_array[1]) - 1][Integer.parseInt(str_array[0]) - 1] = true;
        }

        color_list = init_string_list(size, "WHITE");
        bool_list = init_bool_list(bool_array);

        result_list = breadth_search(size, color_list, bool_list);
        
        System.out.println(Collections.max(result_list));
        result_list.forEach((i) -> {
          System.out.println(i);
        });
      }
    }

    public static List<Integer> breadth_search(int size, List<String> color_list, List<List<Boolean>> bool_list){
      List<Integer> origin_color = new ArrayList<>();
      List<Integer> result = new ArrayList<>();
      Map<Integer, Integer> mp_color = new HashMap<>();
      Map<Integer, List<Integer>> mp_list = new HashMap<>();

      for(int i=0; i < size-1; i++){
        origin_color.add(i+1);
      }

      Queue q = new Queue(size);
      int start = 0, min = 0, tmp;

      color_list.set(start, "GREY");
      q.enqueue(start);

      while(!(q.isEmpty())){
        List<Integer> tmp_list = new ArrayList<>();
        int var = (int)q.dequeue();

        for(int i = 0; i < size; i++){
          if(bool_list.get(var).get(i) && color_list.get(i).equals("WHITE")){  
            q.enqueue(i);
            color_list.set(i, "GREY");
            tmp_list.add(i+1);
          }
        }
        mp_list.put(var+1, tmp_list);
        color_list.set(var, "BLACK");
      }

      for(Integer key: mp_list.keySet()){
        List<Integer> tmp_color = new ArrayList<>(origin_color);
        if(key == 1){
          for(Integer i: mp_list.get(key)){
            min = Collections.min(tmp_color);
            tmp_color.remove(tmp_color.indexOf(min));
            mp_color.put(i, min);
            result.add(min);
          }
        }else{
          tmp = mp_color.get(key);
          tmp_color.remove(tmp_color.indexOf(tmp));
          for(Integer i: mp_list.get(key)){
            min = Collections.min(tmp_color);
            tmp_color.remove(tmp_color.indexOf(min));
            mp_color.put(i, min);
            result.add(min);
          }
        }
      }
      System.out.println(mp_list);
      return result;
    }
    
    public static List<String> init_string_list(int size, String str){
      List<String> list = new ArrayList<>();
      for(int i=0; i < size; i++){
        list.add(str);
      }
      return list;
    }

    public static List<List<Boolean>> init_bool_list(Boolean[][] bool_array){
      List<List<Boolean>> list = new ArrayList<>();
      for(Boolean[] array : bool_array){
        list.add(Arrays.asList(array));
      }
      return list;
    }
}

class Queue{
  private Object queue[];
  private int queueSize;
  private int front;
  private int rear;

  private static final int default_size = 100;

  public Queue(){
    this(default_size);
  }

  public Queue(int size){
    queueSize = size;
    queue = new Object[queueSize];
    front = rear = 0;
  }

  private int next(int a){
    return (a + 1) % queueSize;
  }

  public boolean isEmpty(){
    return front == rear;
  }

  public void clear(){
    front = 0;
    rear = 0;
    Arrays.fill(queue, 0, queueSize, null);
  }

  public void enqueue(Object x){
    if(next(rear) == front){
      throw new IllegalStateException("Enq-Error");
    }else{
      queue[rear] = x;
      rear = next(rear);
    }

  }

  public Object dequeue(){
    if(front == rear){
      throw new NoSuchElementException("Deq-Error");
    }else{
      Object x = queue[front];
      queue[front] = null;
      front = next(front);
      return x;
    }

  }
}