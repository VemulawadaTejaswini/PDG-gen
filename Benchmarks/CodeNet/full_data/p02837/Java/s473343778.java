import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Person[] people = new Person[N];
        for (int i = 0; i < N; i++) {
            Person p = new Person(i, sc.nextInt());
            for (int j = 0; j < p.getNumOfTestimonies(); j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (y == 1) {
                    p.setTrustedBy(x-1);
                } else {
                    p.setUntrustedBy(x-1);
                }
            }
            people[i] = p;
        }

        people[0].setHonest();
        for (Person p : people) {
            if (p.getTrustedBy().size() > 0) {
                for (int i : p.getUntrustedBy()) {
                    people[i].setLiar();
                }
                for (int i : p.getTrustedBy()) {
                    Person trustedBy = people[i];
                    if (trustedBy.getTrustedBy().size() > 0 && trustedBy.getUntrustedBy().size() == 0) {
                        trustedBy.setHonest();
                    }
                }
            }
        }

        long count = Arrays.asList(people).stream().filter(Person::isHonest).count();
        System.out.println(count);
    }
}

class Person {
    private Integer id = null;
    private Integer numOfTestimonies = 0;
    private List<Integer> trustedBy = new ArrayList<>();
    private List<Integer> untrustedBy = new ArrayList<>();
    private Boolean honest = false;

    public Person(int id, int numOfTestimonies) {
        this.id = id;
        this.numOfTestimonies = numOfTestimonies;
    }

    public Integer getNumOfTestimonies() {
        return numOfTestimonies;
    }

    public List<Integer> getTrustedBy() {
        return trustedBy;
    }

    public List<Integer> getUntrustedBy() {
        return untrustedBy;
    }

    public Boolean isHonest() {
        return honest;
    }

    public void setTrustedBy(int trustedBy) {
        this.trustedBy.add(trustedBy);
    }

    public void setUntrustedBy(Integer untrustedBy) {
        this.untrustedBy.add(untrustedBy);
    }

    public void setHonest() {
        this.honest = true;
    }

    public void setLiar() {
        this.honest = false;
    }
}
