
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final Saying[] sayings = new Saying[n];

        for (int i = 0; i < n; i++) {
            final int a = scanner.nextInt();
            final PersonAndHonest[] personAndHonestArray = new PersonAndHonest[a];
            for (int j = 0; j < a; j++) {
                final int x = scanner.nextInt() - 1;
                final boolean isHonest = scanner.nextInt() == 1;
                personAndHonestArray[j] = new PersonAndHonest(x, isHonest);
            }
            sayings[i] = new Saying(personAndHonestArray);
        }

        final Set<Integer> honestSet = new HashSet<>();
        final Set<Integer> liarSet = new HashSet<>();
        final int answer = recursive(0, n, honestSet, liarSet, sayings);

        System.out.println(answer == -1 ? 0 : answer);
    }

    private static int check(final Set<Integer> honestSet, final Set<Integer> liarSet, final Saying[] sayings) {
        for (final int honest : honestSet) {
            for (final PersonAndHonest personAndHonest : sayings[honest].array) {
                if (personAndHonest.isHonest && liarSet.contains(personAndHonest.person)
                        || !personAndHonest.isHonest && honestSet.contains(personAndHonest.person)) {
                    return -1;
                }
            }
        }

        return honestSet.size();
    }

    private static int recursive(final int number, final int length, final Set<Integer> honestSet, final Set<Integer> liarSet, final Saying[] sayings) {
        if (number == length) {
            return check(honestSet, liarSet, sayings);
        }

        final Set<Integer> currentHonestSet = new HashSet<>(honestSet);
        currentHonestSet.add(number);
        final int ans0 = recursive(number + 1, length, currentHonestSet, liarSet, sayings);

        final Set<Integer> currentLiarSet = new HashSet<>(liarSet);
        currentLiarSet.add(number);
        final int ans1 = recursive(number + 1, length, honestSet, currentLiarSet, sayings);

        return Math.max(ans0, ans1);
    }

    private static int bfs(final int number, final Saying[] sayings) {
        final Deque<Integer> queue = new ArrayDeque<>();
        queue.add(number);
        final Set<Integer> honestSet = new HashSet<>();
        final Set<Integer> liarSet = new HashSet<>();

        while (queue.size() > 0) {
            final int index = queue.pollFirst();
            honestSet.add(index);
            final PersonAndHonest[] array = sayings[index].array;
            for (final PersonAndHonest personAndHonest : array) {
                if (personAndHonest.isHonest) {
                    if (liarSet.contains(personAndHonest.person)) {
                        return -1;
                    } else if (!honestSet.contains(personAndHonest.person)) {
                        queue.add(personAndHonest.person);
                    }

                    honestSet.add(personAndHonest.person);
                } else {
                    if (honestSet.contains(personAndHonest.person)) {
                        return -1;
                    }
                    liarSet.add(personAndHonest.person);
                }
            }
        }

        return honestSet.size();
    }

    static class Saying {
        final PersonAndHonest[] array;

        Saying(final PersonAndHonest[] array) {
            this.array = array;
        }
    }

    static class PersonAndHonest {
        final int person;
        final boolean isHonest;

        PersonAndHonest(final int person, final boolean isHonest) {
            this.person = person;
            this.isHonest = isHonest;
        }
    }
}
