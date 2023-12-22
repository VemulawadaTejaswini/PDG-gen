S, T = input().split()
if S[0].lower() <= T[0].lower():
    print(S + T)
else:
    print(T + S)