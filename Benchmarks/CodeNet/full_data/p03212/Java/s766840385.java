N = int(input())

count = 0
for i in range(1, N + 1):
    if "0" in str(i) and "1" in str(i) and "2" in str(i):
        count += 1
print(count)