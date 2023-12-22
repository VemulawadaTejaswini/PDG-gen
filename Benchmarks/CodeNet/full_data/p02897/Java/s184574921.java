a = [int(x) for x in input().split(" ")]
print("bust") if sum(a) >= 22 else print("win")