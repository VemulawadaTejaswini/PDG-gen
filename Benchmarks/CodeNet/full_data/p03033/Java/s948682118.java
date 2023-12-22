import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        int n = Integer.parseInt(first[0]);
        int q = Integer.parseInt(first[1]);
        PriorityQueue<Event> events = new PriorityQueue<Event>(new Comparator<Event>() {
            public int compare(Event e1, Event e2) {
                return e1.targets() - e2.targets();
            }
        });
        for (int i = 0; i < n; i++) {
            events.add(new Event(i, br.readLine()));
        }
        Person[] persons = new Person[q];
        for (int i = 0;  i < q; i++) {
            persons[i] = new Person(i, br.readLine());
        }
        Arrays.sort(persons);
        TreeSet<Event> currents = new TreeSet<>();
        PriorityQueue<Event> endQueue = new PriorityQueue<Event>(new Comparator<Event>() {
            public int compare(Event e1, Event e2) {
                return e1.targete() - e2.targete();
            }
        });
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            while (events.size() > 0 && events.peek().targets() <= persons[i].place) {
                Event e = events.poll();
                endQueue.add(e);
                currents.add(e);
            }
            while (endQueue.size() > 0 && endQueue.peek().targete() <= persons[i].place) {
                currents.remove(endQueue.poll());
            }
            if (currents.size() == 0) {
                ans[persons[i].idx] = -1;
            } else {
                ans[persons[i].idx] = currents.first().place;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            sb.append(ans[i]).append("\n");
        }
        System.out.print(sb);
    }
    
    static class Event implements Comparable<Event> {
        int start;
        int end;
        int place;
        int idx;
        
        public Event(int idx, String str) {
            this.idx = idx;
            String[] arr = str.split(" ", 3);
            start = Integer.parseInt(arr[0]);
            end = Integer.parseInt(arr[1]);
            place = Integer.parseInt(arr[2]);
        }
        
        public int compareTo(Event another) {
            if (place == another.place) {
                return idx - another.idx;
            } else {
                return place - another.place;
            }
        }
        
        public int hashCode() {
            return idx;
        }
        
        public boolean equals(Object o) {
            Event e = (Event) o;
            return this.idx == e.idx;
        }
        
        public int targets() {
            return start - place;
        }
        
        public int targete() {
            return end - place;
        }
        
        public String toString() {
            return idx + ":" + targets() + ":" + targete() + ":" + place;
        }
    }
    
    static class Person implements Comparable<Person> {
        int idx;
        int place;
        
        public Person(int idx, int place) {
            this.idx = idx;
            this.place = place;
        }
        
        public Person(int idx, String str) {
            this(idx, Integer.parseInt(str));
        }
        
        public int compareTo(Person another) {
            return place - another.place;
        }
    }
}