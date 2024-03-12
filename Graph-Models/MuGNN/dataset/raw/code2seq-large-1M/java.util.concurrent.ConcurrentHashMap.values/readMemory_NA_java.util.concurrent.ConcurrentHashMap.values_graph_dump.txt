Line_2 $$ private long readMemory() --> Line_3 $$ long total = 0 [CD]
Line_3 $$ long total = 0 --> Line_5 $$ total += mem.get() [FD]
Line_4 $$ for (MemMeasure mem : memoryBytes.values()) --> Line_5 $$ total += mem.get() [FD]
Line_2 $$ private long readMemory() --> Line_7 $$ return total [CD]
