#!/usr/bin/env python

import sys

s = sys.stdin.readline().strip()

ans = "Good"
for i in range(3):
    if s[i]==s[i+1]:
        ans = "Bad"
        break
#
print( ans )
