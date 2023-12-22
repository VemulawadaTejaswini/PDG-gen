import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Person> list = new ArrayList<>();
        Map<Long, Person> seats = new HashMap<>();
        long total = 0;
        for (int i = 1; i <= n; i++) {
            Person person = new Person(scanner.nextInt(), i);
            list.add(person);
        }
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.score - o1.score;
            }
        });

        for (Person person : list) {
            long diff = Math.max(list.size() - person.position, person.position);
            for(long d = diff ; d > 0 ; d-- ){
                long right = person.position + d;
                long left = person.position - d;
                //right
                if(right <= list.size() && !seats.containsKey(right)){
                    seats.put(right, person);
                    total += person.score * d;
                    break;
                }
                //left
                if(left > 0 && !seats.containsKey(left)){
                    seats.put(left, person);
                    total += person.score * d;
                    break;
                }
            }
        }
        System.out.println(total);
    }

    public static class Person {
        int score;
        int position;

        public Person(int score, int position) {
            this.score = score;
            this.position = position;

        }

        public String toString(){
            return String.valueOf(score) + ":" + String.valueOf(position);
        }
    }

}