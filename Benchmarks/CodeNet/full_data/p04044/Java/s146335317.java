public class Main {
 public static void main(String[] args) {
 	Scanner sc = new Scanner(System.in);
   	String line = sc.nextLine();
    String[] arr = line.split("\\s");
    int n = Integer.parseInt(arr[0]);
    int l = Integer.parseInt(arr[1]);
   List<String> ss = new ArrayList<>();
   while(sc.hasNextLine()) {
     ss.add(sc.nextLine());
   }
   
   Collections.sort(ss);
   StringBuilder sb = new StringBuilder();
   for(String s : ss) {
    sb.append(s); 
   }
   
   return sb.toString();
 }
  
}