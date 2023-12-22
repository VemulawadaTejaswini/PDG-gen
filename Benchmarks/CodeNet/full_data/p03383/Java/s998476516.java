
        ai.sort(Comparator.naturalOrder());
        for (int i = 0; i < H; i++) {
            if (ai.get(i).equals(ai.get(i + 1))) {
                i++;
                continue;
            }
            if (i % 2 != 0) {
                System.out.println("NO");
                return;
            }
        }