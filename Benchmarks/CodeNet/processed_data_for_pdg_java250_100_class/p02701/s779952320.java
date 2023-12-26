public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        List<String> listA = new ArrayList<String>();
        for(int i=0;i<a;i++){
            String n=scan.next();
            listA.add(n);
        }
        List<String> listB = listA.stream().distinct().collect(Collectors.toList());
        System.out.println(listB.size());
            }
        }
