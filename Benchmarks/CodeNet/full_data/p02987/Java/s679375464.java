char[] s = in.next().toCharArray();
Arrays.sort(s);
out.println(s[0] == s[1] && s[2] == s[3] && s[1] != s[2] ? "Yes" : "No");