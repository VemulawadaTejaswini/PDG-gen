public class Main { 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      List<String> numList = new ArrayList<>();
      for (int i=0; i<n; i++) {
          String di = sc.next();
          numList.add(di);
      }
      Map<String, Long> map = numList.stream().collect(groupingBy(identity(), counting()));
      List<String> List = Arrays.asList("AC","WA","TLE","RE");
      for(String num : List){
        Long value = map.get(num);
        if(value != null){
      		System.out.println(num + " x " + map.get(num));
        }else{
        	System.out.println(num + " x " + 0);
        }
      }
    }
}
