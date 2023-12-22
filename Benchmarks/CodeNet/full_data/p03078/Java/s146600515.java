public final class atcoder/abc123/DKt {


  // access flags 0x19
  public final static main([Ljava/lang/String;)V
    @Lorg/jetbrains/annotations/NotNull;() // invisible, parameter 0
   L0
    ALOAD 0
    LDC "args"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
   L1
    LINENUMBER 5 L1
    INVOKESTATIC kotlin/io/ConsoleKt.readLine ()Ljava/lang/String;
    DUP
    IFNONNULL L2
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.throwNpe ()V
   L2
    CHECKCAST java/lang/CharSequence
    ICONST_1
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    LDC " "
    AASTORE
    ICONST_0
    ICONST_0
    BIPUSH 6
    ACONST_NULL
    INVOKESTATIC kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
    CHECKCAST java/lang/Iterable
    ASTORE 10
   L3
    LINENUMBER 62 L3
    ALOAD 10
    ASTORE 11
    NEW java/util/ArrayList
    DUP
    ALOAD 10
    BIPUSH 10
    INVOKESTATIC kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
    INVOKESPECIAL java/util/ArrayList.<init> (I)V
    CHECKCAST java/util/Collection
    ASTORE 12
   L4
    LINENUMBER 63 L4
    ALOAD 11
    INVOKEINTERFACE java/lang/Iterable.iterator ()Ljava/util/Iterator;
    ASTORE 13
   L5
    ALOAD 13
    INVOKEINTERFACE java/util/Iterator.hasNext ()Z
    IFEQ L6
    ALOAD 13
    INVOKEINTERFACE java/util/Iterator.next ()Ljava/lang/Object;
    ASTORE 14
   L7
    LINENUMBER 64 L7
    ALOAD 12
    ALOAD 14
    CHECKCAST java/lang/String
    ASTORE 15
    ASTORE 23
   L8
    LINENUMBER 5 L8
    ALOAD 15
    ASTORE 16
   L9
    ALOAD 16
    INVOKESTATIC java/lang/Long.parseLong (Ljava/lang/String;)J
   L10
    LINENUMBER 5 L10
   L11
    INVOKESTATIC java/lang/Long.valueOf (J)Ljava/lang/Long;
    ASTORE 24
    ALOAD 23
    ALOAD 24
    INVOKEINTERFACE java/util/Collection.add (Ljava/lang/Object;)Z
    POP
   L12
    LINENUMBER 63 L12
    GOTO L5
   L6
    LINENUMBER 65 L6
    ALOAD 12
   L13
    CHECKCAST java/util/List
   L14
    ASTORE 9
    ALOAD 9
    ASTORE 10
   L15
    ALOAD 10
    ICONST_0
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
   L16
    LINENUMBER 5 L16
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LSTORE 1
    ALOAD 9
    ASTORE 10
   L17
    ALOAD 10
    ICONST_1
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
   L18
    LINENUMBER 5 L18
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LSTORE 3
    ALOAD 9
    ASTORE 10
   L19
    ALOAD 10
    ICONST_2
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
   L20
    LINENUMBER 5 L20
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LSTORE 5
    ALOAD 9
    ASTORE 10
   L21
    ALOAD 10
    ICONST_3
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
   L22
    LINENUMBER 5 L22
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LSTORE 7
   L23
    LINENUMBER 6 L23
    INVOKESTATIC kotlin/io/ConsoleKt.readLine ()Ljava/lang/String;
    DUP
    IFNONNULL L24
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.throwNpe ()V
   L24
    CHECKCAST java/lang/CharSequence
    ICONST_1
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    LDC " "
    AASTORE
    ICONST_0
    ICONST_0
    BIPUSH 6
    ACONST_NULL
    INVOKESTATIC kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
    CHECKCAST java/lang/Iterable
    ASTORE 10
   L25
    LINENUMBER 66 L25
    ALOAD 10
    ASTORE 11
    NEW java/util/ArrayList
    DUP
    ALOAD 10
    BIPUSH 10
    INVOKESTATIC kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
    INVOKESPECIAL java/util/ArrayList.<init> (I)V
    CHECKCAST java/util/Collection
    ASTORE 12
   L26
    LINENUMBER 67 L26
    ALOAD 11
    INVOKEINTERFACE java/lang/Iterable.iterator ()Ljava/util/Iterator;
    ASTORE 13
   L27
    ALOAD 13
    INVOKEINTERFACE java/util/Iterator.hasNext ()Z
    IFEQ L28
    ALOAD 13
    INVOKEINTERFACE java/util/Iterator.next ()Ljava/lang/Object;
    ASTORE 14
   L29
    LINENUMBER 68 L29
    ALOAD 12
    ALOAD 14
    CHECKCAST java/lang/String
    ASTORE 15
    ASTORE 23
   L30
    LINENUMBER 6 L30
    ALOAD 15
    ASTORE 16
   L31
    ALOAD 16
    INVOKESTATIC java/lang/Long.parseLong (Ljava/lang/String;)J
   L32
    LINENUMBER 6 L32
   L33
    INVOKESTATIC java/lang/Long.valueOf (J)Ljava/lang/Long;
    ASTORE 24
    ALOAD 23
    ALOAD 24
    INVOKEINTERFACE java/util/Collection.add (Ljava/lang/Object;)Z
    POP
   L34
    LINENUMBER 67 L34
    GOTO L27
   L28
    LINENUMBER 69 L28
    ALOAD 12
   L35
    CHECKCAST java/util/List
   L36
    CHECKCAST java/util/Collection
   L37
    LINENUMBER 6 L37
    INVOKESTATIC kotlin/collections/CollectionsKt.toMutableList (Ljava/util/Collection;)Ljava/util/List;
    ASTORE 9
   L38
    LINENUMBER 7 L38
    INVOKESTATIC kotlin/io/ConsoleKt.readLine ()Ljava/lang/String;
    DUP
    IFNONNULL L39
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.throwNpe ()V
   L39
    CHECKCAST java/lang/CharSequence
    ICONST_1
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    LDC " "
    AASTORE
    ICONST_0
    ICONST_0
    BIPUSH 6
    ACONST_NULL
    INVOKESTATIC kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
    CHECKCAST java/lang/Iterable
    ASTORE 11
   L40
    LINENUMBER 70 L40
    ALOAD 11
    ASTORE 12
    NEW java/util/ArrayList
    DUP
    ALOAD 11
    BIPUSH 10
    INVOKESTATIC kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
    INVOKESPECIAL java/util/ArrayList.<init> (I)V
    CHECKCAST java/util/Collection
    ASTORE 13
   L41
    LINENUMBER 71 L41
    ALOAD 12
    INVOKEINTERFACE java/lang/Iterable.iterator ()Ljava/util/Iterator;
    ASTORE 14
   L42
    ALOAD 14
    INVOKEINTERFACE java/util/Iterator.hasNext ()Z
    IFEQ L43
    ALOAD 14
    INVOKEINTERFACE java/util/Iterator.next ()Ljava/lang/Object;
    ASTORE 15
   L44
    LINENUMBER 72 L44
    ALOAD 13
    ALOAD 15
    CHECKCAST java/lang/String
    ASTORE 16
    ASTORE 23
   L45
    LINENUMBER 7 L45
    ALOAD 16
    ASTORE 17
   L46
    ALOAD 17
    INVOKESTATIC java/lang/Long.parseLong (Ljava/lang/String;)J
   L47
    LINENUMBER 7 L47
   L48
    INVOKESTATIC java/lang/Long.valueOf (J)Ljava/lang/Long;
    ASTORE 24
    ALOAD 23
    ALOAD 24
    INVOKEINTERFACE java/util/Collection.add (Ljava/lang/Object;)Z
    POP
   L49
    LINENUMBER 71 L49
    GOTO L42
   L43
    LINENUMBER 73 L43
    ALOAD 13
   L50
    CHECKCAST java/util/List
   L51
    CHECKCAST java/util/Collection
   L52
    LINENUMBER 7 L52
    INVOKESTATIC kotlin/collections/CollectionsKt.toMutableList (Ljava/util/Collection;)Ljava/util/List;
    ASTORE 10
   L53
    LINENUMBER 8 L53
    INVOKESTATIC kotlin/io/ConsoleKt.readLine ()Ljava/lang/String;
    DUP
    IFNONNULL L54
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.throwNpe ()V
   L54
    CHECKCAST java/lang/CharSequence
    ICONST_1
    ANEWARRAY java/lang/String
    DUP
    ICONST_0
    LDC " "
    AASTORE
    ICONST_0
    ICONST_0
    BIPUSH 6
    ACONST_NULL
    INVOKESTATIC kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
    CHECKCAST java/lang/Iterable
    ASTORE 12
   L55
    LINENUMBER 74 L55
    ALOAD 12
    ASTORE 13
    NEW java/util/ArrayList
    DUP
    ALOAD 12
    BIPUSH 10
    INVOKESTATIC kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
    INVOKESPECIAL java/util/ArrayList.<init> (I)V
    CHECKCAST java/util/Collection
    ASTORE 14
   L56
    LINENUMBER 75 L56
    ALOAD 13
    INVOKEINTERFACE java/lang/Iterable.iterator ()Ljava/util/Iterator;
    ASTORE 15
   L57
    ALOAD 15
    INVOKEINTERFACE java/util/Iterator.hasNext ()Z
    IFEQ L58
    ALOAD 15
    INVOKEINTERFACE java/util/Iterator.next ()Ljava/lang/Object;
    ASTORE 16
   L59
    LINENUMBER 76 L59
    ALOAD 14
    ALOAD 16
    CHECKCAST java/lang/String
    ASTORE 17
    ASTORE 23
   L60
    LINENUMBER 8 L60
    ALOAD 17
    ASTORE 18
   L61
    ALOAD 18
    INVOKESTATIC java/lang/Long.parseLong (Ljava/lang/String;)J
   L62
    LINENUMBER 8 L62
   L63
    INVOKESTATIC java/lang/Long.valueOf (J)Ljava/lang/Long;
    ASTORE 24
    ALOAD 23
    ALOAD 24
    INVOKEINTERFACE java/util/Collection.add (Ljava/lang/Object;)Z
    POP
   L64
    LINENUMBER 75 L64
    GOTO L57
   L58
    LINENUMBER 77 L58
    ALOAD 14
   L65
    CHECKCAST java/util/List
   L66
    CHECKCAST java/util/Collection
   L67
    LINENUMBER 8 L67
    INVOKESTATIC kotlin/collections/CollectionsKt.toMutableList (Ljava/util/Collection;)Ljava/util/List;
    ASTORE 11
   L68
    LINENUMBER 10 L68
    ALOAD 9
    ASTORE 12
   L69
    LINENUMBER 78 L69
    ALOAD 12
    INVOKEINTERFACE java/util/List.size ()I
    ICONST_1
    IF_ICMPLE L70
    ALOAD 12
    ASTORE 13
    NEW atcoder/abc123/DKt$main$$inlined$sortBy$1
    DUP
    INVOKESPECIAL atcoder/abc123/DKt$main$$inlined$sortBy$1.<init> ()V
    CHECKCAST java/util/Comparator
    ASTORE 14
    ALOAD 13
    ALOAD 14
   L71
    LINENUMBER 78 L71
    INVOKESTATIC kotlin/collections/CollectionsKt.sortWith (Ljava/util/List;Ljava/util/Comparator;)V
   L70
    LINENUMBER 79 L70
    NOP
   L72
    LINENUMBER 11 L72
    ALOAD 10
    ASTORE 12
   L73
    LINENUMBER 80 L73
    ALOAD 12
    INVOKEINTERFACE java/util/List.size ()I
    ICONST_1
    IF_ICMPLE L74
    ALOAD 12
    ASTORE 13
    NEW atcoder/abc123/DKt$main$$inlined$sortBy$2
    DUP
    INVOKESPECIAL atcoder/abc123/DKt$main$$inlined$sortBy$2.<init> ()V
    CHECKCAST java/util/Comparator
    ASTORE 14
    ALOAD 13
    ALOAD 14
   L75
    LINENUMBER 80 L75
    INVOKESTATIC kotlin/collections/CollectionsKt.sortWith (Ljava/util/List;Ljava/util/Comparator;)V
   L74
    LINENUMBER 81 L74
    NOP
   L76
    LINENUMBER 12 L76
    ALOAD 11
    ASTORE 12
   L77
    LINENUMBER 82 L77
    ALOAD 12
    INVOKEINTERFACE java/util/List.size ()I
    ICONST_1
    IF_ICMPLE L78
    ALOAD 12
    ASTORE 13
    NEW atcoder/abc123/DKt$main$$inlined$sortBy$3
    DUP
    INVOKESPECIAL atcoder/abc123/DKt$main$$inlined$sortBy$3.<init> ()V
    CHECKCAST java/util/Comparator
    ASTORE 14
    ALOAD 13
    ALOAD 14
   L79
    LINENUMBER 82 L79
    INVOKESTATIC kotlin/collections/CollectionsKt.sortWith (Ljava/util/List;Ljava/util/Comparator;)V
   L78
    LINENUMBER 83 L78
    NOP
   L80
    LINENUMBER 14 L80
   L81
    LINENUMBER 15 L81
    NEW java/util/PriorityQueue
    DUP
    GETSTATIC atcoder/abc123/DKt$main$priorityQueue$1.INSTANCE : Latcoder/abc123/DKt$main$priorityQueue$1;
    CHECKCAST java/util/Comparator
    INVOKESPECIAL java/util/PriorityQueue.<init> (Ljava/util/Comparator;)V
    ASTORE 12
   L82
    LINENUMBER 16 L82
   L83
    NEW java/util/LinkedHashSet
    DUP
    INVOKESPECIAL java/util/LinkedHashSet.<init> ()V
    CHECKCAST java/util/Set
   L84
    LINENUMBER 16 L84
    ASTORE 13
   L85
    LINENUMBER 17 L85
    NEW atcoder/abc123/DKt$main$Candidate
    DUP
    ALOAD 9
    ICONST_0
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    ALOAD 10
    ICONST_0
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LADD
    ALOAD 11
    ICONST_0
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LADD
    ICONST_0
    ICONST_0
    ICONST_0
    INVOKESPECIAL atcoder/abc123/DKt$main$Candidate.<init> (JIII)V
    ASTORE 14
   L86
    LINENUMBER 18 L86
    ALOAD 12
    ALOAD 14
    INVOKEVIRTUAL java/util/PriorityQueue.add (Ljava/lang/Object;)Z
    POP
   L87
    LINENUMBER 19 L87
    ALOAD 13
    NEW kotlin/Triple
    DUP
    ICONST_0
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    ICONST_0
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    ICONST_0
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    INVOKESPECIAL kotlin/Triple.<init> (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    INVOKEINTERFACE java/util/Set.add (Ljava/lang/Object;)Z
    POP
   L88
    LINENUMBER 21 L88
    LCONST_0
    LSTORE 15
   L89
    LINENUMBER 22 L89
   L90
    LINENUMBER 23 L90
    ALOAD 12
    INVOKEVIRTUAL java/util/PriorityQueue.poll ()Ljava/lang/Object;
    DUP
    LDC "priorityQueue.poll()"
    INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkExpressionValueIsNotNull (Ljava/lang/Object;Ljava/lang/String;)V
    CHECKCAST atcoder/abc123/DKt$main$Candidate
    ASTORE 17
   L91
    LINENUMBER 24 L91
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getTaste ()J
    LSTORE 18
   L92
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LLOAD 18
    INVOKEVIRTUAL java/io/PrintStream.println (J)V
   L93
   L94
    LINENUMBER 25 L94
    LLOAD 15
    DUP2
    LSTORE 18
    LCONST_1
    LADD
    LSTORE 15
   L95
    LINENUMBER 26 L95
    LLOAD 15
    LLOAD 7
    LCMP
    IFNE L96
   L97
    LINENUMBER 27 L97
    RETURN
   L96
    LINENUMBER 30 L96
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getX ()I
    ICONST_1
    IADD
    ISTORE 18
   L98
    LINENUMBER 31 L98
    ILOAD 18
    I2L
    LLOAD 1
    LCMP
    IFGE L99
   L100
    LINENUMBER 32 L100
    NEW kotlin/Triple
    DUP
    ILOAD 18
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getY ()I
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getZ ()I
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    INVOKESPECIAL kotlin/Triple.<init> (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    ASTORE 19
   L101
    LINENUMBER 33 L101
    NEW atcoder/abc123/DKt$main$Candidate
    DUP
    ALOAD 9
    ILOAD 18
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    ALOAD 10
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getY ()I
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LADD
    ALOAD 11
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getZ ()I
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LADD
    ILOAD 18
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getY ()I
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getZ ()I
    INVOKESPECIAL atcoder/abc123/DKt$main$Candidate.<init> (JIII)V
    ASTORE 20
   L102
    LINENUMBER 34 L102
    ALOAD 13
    ALOAD 19
    INVOKEINTERFACE java/util/Set.contains (Ljava/lang/Object;)Z
    IFNE L99
   L103
    LINENUMBER 35 L103
    ALOAD 12
    ALOAD 20
    INVOKEVIRTUAL java/util/PriorityQueue.add (Ljava/lang/Object;)Z
    POP
   L104
    LINENUMBER 36 L104
    ALOAD 13
    ALOAD 19
    INVOKEINTERFACE java/util/Set.add (Ljava/lang/Object;)Z
    POP
   L99
    LINENUMBER 40 L99
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getY ()I
    ICONST_1
    IADD
    ISTORE 19
   L105
    LINENUMBER 41 L105
    ILOAD 19
    I2L
    LLOAD 3
    LCMP
    IFGE L106
   L107
    LINENUMBER 42 L107
    NEW kotlin/Triple
    DUP
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getX ()I
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    ILOAD 19
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getZ ()I
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    INVOKESPECIAL kotlin/Triple.<init> (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    ASTORE 20
   L108
    LINENUMBER 43 L108
    NEW atcoder/abc123/DKt$main$Candidate
    DUP
    ALOAD 9
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getX ()I
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    ALOAD 10
    ILOAD 19
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LADD
    ALOAD 11
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getZ ()I
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LADD
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getX ()I
    ILOAD 19
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getZ ()I
    INVOKESPECIAL atcoder/abc123/DKt$main$Candidate.<init> (JIII)V
    ASTORE 21
   L109
    LINENUMBER 44 L109
    ALOAD 13
    ALOAD 20
    INVOKEINTERFACE java/util/Set.contains (Ljava/lang/Object;)Z
    IFNE L106
   L110
    LINENUMBER 45 L110
    ALOAD 12
    ALOAD 21
    INVOKEVIRTUAL java/util/PriorityQueue.add (Ljava/lang/Object;)Z
    POP
   L111
    LINENUMBER 46 L111
    ALOAD 13
    ALOAD 20
    INVOKEINTERFACE java/util/Set.add (Ljava/lang/Object;)Z
    POP
   L106
    LINENUMBER 50 L106
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getZ ()I
    ICONST_1
    IADD
    ISTORE 20
   L112
    LINENUMBER 51 L112
    ILOAD 20
    I2L
    LLOAD 5
    LCMP
    IFGE L113
   L114
    LINENUMBER 52 L114
    NEW kotlin/Triple
    DUP
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getX ()I
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getY ()I
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    ILOAD 20
    INVOKESTATIC java/lang/Integer.valueOf (I)Ljava/lang/Integer;
    INVOKESPECIAL kotlin/Triple.<init> (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    ASTORE 21
   L115
    LINENUMBER 53 L115
    NEW atcoder/abc123/DKt$main$Candidate
    DUP
    ALOAD 9
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getX ()I
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    ALOAD 10
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getY ()I
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LADD
    ALOAD 11
    ILOAD 20
    INVOKEINTERFACE java/util/List.get (I)Ljava/lang/Object;
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LADD
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getX ()I
    ALOAD 17
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getY ()I
    ILOAD 20
    INVOKESPECIAL atcoder/abc123/DKt$main$Candidate.<init> (JIII)V
    ASTORE 22
   L116
    LINENUMBER 54 L116
    ALOAD 13
    ALOAD 21
    INVOKEINTERFACE java/util/Set.contains (Ljava/lang/Object;)Z
    IFNE L113
   L117
    LINENUMBER 55 L117
    ALOAD 12
    ALOAD 22
    INVOKEVIRTUAL java/util/PriorityQueue.add (Ljava/lang/Object;)Z
    POP
   L118
    LINENUMBER 56 L118
    ALOAD 13
    ALOAD 21
    INVOKEINTERFACE java/util/Set.add (Ljava/lang/Object;)Z
    POP
   L113
    LINENUMBER 22 L113
    GOTO L90
   L119
    LOCALVARIABLE it Ljava/lang/String; L8 L11 15
    LOCALVARIABLE $i$a$1$map I L8 L11 17
    LOCALVARIABLE item$iv$iv Ljava/lang/Object; L7 L12 14
    LOCALVARIABLE $receiver$iv$iv Ljava/lang/Iterable; L4 L13 11
    LOCALVARIABLE destination$iv$iv Ljava/util/Collection; L4 L13 12
    LOCALVARIABLE $i$f$mapTo I L4 L13 18
    LOCALVARIABLE $receiver$iv Ljava/lang/Iterable; L3 L14 10
    LOCALVARIABLE $i$f$map I L3 L14 19
    LOCALVARIABLE it Ljava/lang/String; L30 L33 15
    LOCALVARIABLE $i$a$1$map I L30 L33 17
    LOCALVARIABLE item$iv$iv Ljava/lang/Object; L29 L34 14
    LOCALVARIABLE $receiver$iv$iv Ljava/lang/Iterable; L26 L35 11
    LOCALVARIABLE destination$iv$iv Ljava/util/Collection; L26 L35 12
    LOCALVARIABLE $i$f$mapTo I L26 L35 18
    LOCALVARIABLE $receiver$iv Ljava/lang/Iterable; L25 L36 10
    LOCALVARIABLE $i$f$map I L25 L36 19
    LOCALVARIABLE it Ljava/lang/String; L45 L48 16
    LOCALVARIABLE $i$a$1$map I L45 L48 18
    LOCALVARIABLE item$iv$iv Ljava/lang/Object; L44 L49 15
    LOCALVARIABLE $receiver$iv$iv Ljava/lang/Iterable; L41 L50 12
    LOCALVARIABLE destination$iv$iv Ljava/util/Collection; L41 L50 13
    LOCALVARIABLE $i$f$mapTo I L41 L50 19
    LOCALVARIABLE $receiver$iv Ljava/lang/Iterable; L40 L51 11
    LOCALVARIABLE $i$f$map I L40 L51 20
    LOCALVARIABLE it Ljava/lang/String; L60 L63 17
    LOCALVARIABLE $i$a$1$map I L60 L63 19
    LOCALVARIABLE item$iv$iv Ljava/lang/Object; L59 L64 16
    LOCALVARIABLE $receiver$iv$iv Ljava/lang/Iterable; L56 L65 13
    LOCALVARIABLE destination$iv$iv Ljava/util/Collection; L56 L65 14
    LOCALVARIABLE $i$f$mapTo I L56 L65 20
    LOCALVARIABLE $receiver$iv Ljava/lang/Iterable; L55 L66 12
    LOCALVARIABLE $i$f$map I L55 L66 21
    LOCALVARIABLE $receiver$iv Ljava/util/List; L69 L72 12
    LOCALVARIABLE $i$f$sortBy I L69 L72 15
    LOCALVARIABLE $receiver$iv Ljava/util/List; L73 L76 12
    LOCALVARIABLE $i$f$sortBy I L73 L76 15
    LOCALVARIABLE $receiver$iv Ljava/util/List; L77 L80 12
    LOCALVARIABLE $i$f$sortBy I L77 L80 15
    LOCALVARIABLE c Latcoder/abc123/DKt$main$Candidate; L102 L99 20
    LOCALVARIABLE ans Lkotlin/Triple; L101 L99 19
    LOCALVARIABLE c Latcoder/abc123/DKt$main$Candidate; L109 L106 21
    LOCALVARIABLE ans Lkotlin/Triple; L108 L106 20
    LOCALVARIABLE c Latcoder/abc123/DKt$main$Candidate; L116 L113 22
    LOCALVARIABLE ans Lkotlin/Triple; L115 L113 21
    LOCALVARIABLE newZ I L112 L113 20
    LOCALVARIABLE newY I L105 L113 19
    LOCALVARIABLE newX I L98 L113 18
    LOCALVARIABLE ansI Latcoder/abc123/DKt$main$Candidate; L91 L113 17
    LOCALVARIABLE count J L89 L119 15
    LOCALVARIABLE topCandiate Latcoder/abc123/DKt$main$Candidate; L86 L119 14
    LOCALVARIABLE set Ljava/util/Set; L85 L119 13
    LOCALVARIABLE priorityQueue Ljava/util/PriorityQueue; L82 L119 12
    LOCALVARIABLE C Ljava/util/List; L68 L119 11
    LOCALVARIABLE B Ljava/util/List; L53 L119 10
    LOCALVARIABLE A Ljava/util/List; L38 L119 9
    LOCALVARIABLE K J L23 L119 7
    LOCALVARIABLE Z J L23 L119 5
    LOCALVARIABLE Y J L23 L119 3
    LOCALVARIABLE X J L23 L119 1
    LOCALVARIABLE args [Ljava/lang/String; L0 L119 0
    MAXSTACK = 7
    MAXLOCALS = 25

  @Lkotlin/Metadata;(mv={1, 1, 10}, bv={1, 0, 2}, k=2, d1={"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2={"main", "", "args", "", "", "([Ljava/lang/String;)V", "production sources for module ProgramingChallenge with Kotlin"})
  // access flags 0x19
  public final static INNERCLASS atcoder/abc123/DKt$main$Candidate null Candidate
  // access flags 0x18
  final static INNERCLASS atcoder/abc123/DKt$main$priorityQueue$1 null null
  // compiled from: D.kt
  // debug info: SMAP
D.kt
Kotlin
*S Kotlin
*F
+ 1 D.kt
atcoder/abc123/DKt
+ 2 _Collections.kt
kotlin/collections/CollectionsKt___CollectionsKt
*L
1#1,61:1
1218#2:62
1287#2,3:63
1218#2:66
1287#2,3:67
1218#2:70
1287#2,3:71
1218#2:74
1287#2,3:75
829#2,2:78
829#2,2:80
829#2,2:82
*E
*S KotlinDebug
*F
+ 1 D.kt
atcoder/abc123/DKt
*L
5#1:62
5#1,3:63
6#1:66
6#1,3:67
7#1:70
7#1,3:71
8#1:74
8#1,3:75
10#1,2:78
11#1,2:80
12#1,2:82
*E

}


// ================atcoder/abc123/DKt$main$$inlined$sortBy$1.class =================
// class version 50.0 (50)
// access flags 0x31
// signature <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Comparator<TT;>;
// declaration: atcoder/abc123/DKt$main$$inlined$sortBy$1<T> implements java.util.Comparator<T>
public final class atcoder/abc123/DKt$main$$inlined$sortBy$1 implements java/util/Comparator  {

  OUTERCLASS kotlin/comparisons/ComparisonsKt__ComparisonsKt compareBy (Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;

  // access flags 0x1
  public <init>()V
   L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x11
  // signature (TT;TT;)I
  // declaration: int compare(T, T)
  public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
   L0
    LINENUMBER 102 L0
    ALOAD 1
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LSTORE 3
   L1
    LINENUMBER 320 L1
    LLOAD 3
    ICONST_M1
    I2L
    LMUL
   L2
   L3
    INVOKESTATIC java/lang/Long.valueOf (J)Ljava/lang/Long;
    CHECKCAST java/lang/Comparable
    ALOAD 2
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LSTORE 3
    ASTORE 6
   L4
    LINENUMBER 321 L4
    LLOAD 3
    ICONST_M1
    I2L
    LMUL
   L5
   L6
    INVOKESTATIC java/lang/Long.valueOf (J)Ljava/lang/Long;
    ASTORE 7
    ALOAD 6
    ALOAD 7
    CHECKCAST java/lang/Comparable
    INVOKESTATIC kotlin/comparisons/ComparisonsKt.compareValues (Ljava/lang/Comparable;Ljava/lang/Comparable;)I
   L7
    LINENUMBER 102 L7
    IRETURN
   L8
    LOCALVARIABLE it J L1 L3 3
    LOCALVARIABLE $i$a$2$sortBy I L1 L3 5
    LOCALVARIABLE it J L4 L6 3
    LOCALVARIABLE $i$a$2$sortBy I L4 L6 5
    LOCALVARIABLE this Latcoder/abc123/DKt$main$$inlined$sortBy$1; L0 L8 0
    LOCALVARIABLE a Ljava/lang/Object; L0 L8 1
    LOCALVARIABLE b Ljava/lang/Object; L0 L8 2
    MAXSTACK = 4
    MAXLOCALS = 8
  // access flags 0x19
  public final static INNERCLASS atcoder/abc123/DKt$main$$inlined$sortBy$1 null null

  @Lkotlin/Metadata;(mv={1, 1, 10}, bv={1, 0, 2}, k=3, d1={"\u0000\u001e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"}, d2={"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
  OUTERCLASS atcoder/abc123/DKt main ([Ljava/lang/String;)V
  // compiled from: Comparisons.kt
  // debug info: SMAP
Comparisons.kt
Kotlin
*S Kotlin
*F
+ 1 Comparisons.kt
kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2
+ 2 D.kt
atcoder/abc123/DKt
*L
1#1,319:1
10#2:320
10#2:321
*E

}


// ================atcoder/abc123/DKt$main$$inlined$sortBy$2.class =================
// class version 50.0 (50)
// access flags 0x31
// signature <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Comparator<TT;>;
// declaration: atcoder/abc123/DKt$main$$inlined$sortBy$2<T> implements java.util.Comparator<T>
public final class atcoder/abc123/DKt$main$$inlined$sortBy$2 implements java/util/Comparator  {

  OUTERCLASS kotlin/comparisons/ComparisonsKt__ComparisonsKt compareBy (Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;

  // access flags 0x1
  public <init>()V
   L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x11
  // signature (TT;TT;)I
  // declaration: int compare(T, T)
  public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
   L0
    LINENUMBER 102 L0
    ALOAD 1
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LSTORE 3
   L1
    LINENUMBER 320 L1
    LLOAD 3
    ICONST_M1
    I2L
    LMUL
   L2
   L3
    INVOKESTATIC java/lang/Long.valueOf (J)Ljava/lang/Long;
    CHECKCAST java/lang/Comparable
    ALOAD 2
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LSTORE 3
    ASTORE 6
   L4
    LINENUMBER 321 L4
    LLOAD 3
    ICONST_M1
    I2L
    LMUL
   L5
   L6
    INVOKESTATIC java/lang/Long.valueOf (J)Ljava/lang/Long;
    ASTORE 7
    ALOAD 6
    ALOAD 7
    CHECKCAST java/lang/Comparable
    INVOKESTATIC kotlin/comparisons/ComparisonsKt.compareValues (Ljava/lang/Comparable;Ljava/lang/Comparable;)I
   L7
    LINENUMBER 102 L7
    IRETURN
   L8
    LOCALVARIABLE it J L1 L3 3
    LOCALVARIABLE $i$a$3$sortBy I L1 L3 5
    LOCALVARIABLE it J L4 L6 3
    LOCALVARIABLE $i$a$3$sortBy I L4 L6 5
    LOCALVARIABLE this Latcoder/abc123/DKt$main$$inlined$sortBy$2; L0 L8 0
    LOCALVARIABLE a Ljava/lang/Object; L0 L8 1
    LOCALVARIABLE b Ljava/lang/Object; L0 L8 2
    MAXSTACK = 4
    MAXLOCALS = 8
  // access flags 0x19
  public final static INNERCLASS atcoder/abc123/DKt$main$$inlined$sortBy$2 null null

  @Lkotlin/Metadata;(mv={1, 1, 10}, bv={1, 0, 2}, k=3, d1={"\u0000\u001e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"}, d2={"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
  OUTERCLASS atcoder/abc123/DKt main ([Ljava/lang/String;)V
  // compiled from: Comparisons.kt
  // debug info: SMAP
Comparisons.kt
Kotlin
*S Kotlin
*F
+ 1 Comparisons.kt
kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2
+ 2 D.kt
atcoder/abc123/DKt
*L
1#1,319:1
11#2:320
11#2:321
*E

}


// ================atcoder/abc123/DKt$main$$inlined$sortBy$3.class =================
// class version 50.0 (50)
// access flags 0x31
// signature <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Comparator<TT;>;
// declaration: atcoder/abc123/DKt$main$$inlined$sortBy$3<T> implements java.util.Comparator<T>
public final class atcoder/abc123/DKt$main$$inlined$sortBy$3 implements java/util/Comparator  {

  OUTERCLASS kotlin/comparisons/ComparisonsKt__ComparisonsKt compareBy (Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;

  // access flags 0x1
  public <init>()V
   L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x11
  // signature (TT;TT;)I
  // declaration: int compare(T, T)
  public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
   L0
    LINENUMBER 102 L0
    ALOAD 1
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LSTORE 3
   L1
    LINENUMBER 320 L1
    LLOAD 3
    ICONST_M1
    I2L
    LMUL
   L2
   L3
    INVOKESTATIC java/lang/Long.valueOf (J)Ljava/lang/Long;
    CHECKCAST java/lang/Comparable
    ALOAD 2
    CHECKCAST java/lang/Number
    INVOKEVIRTUAL java/lang/Number.longValue ()J
    LSTORE 3
    ASTORE 6
   L4
    LINENUMBER 321 L4
    LLOAD 3
    ICONST_M1
    I2L
    LMUL
   L5
   L6
    INVOKESTATIC java/lang/Long.valueOf (J)Ljava/lang/Long;
    ASTORE 7
    ALOAD 6
    ALOAD 7
    CHECKCAST java/lang/Comparable
    INVOKESTATIC kotlin/comparisons/ComparisonsKt.compareValues (Ljava/lang/Comparable;Ljava/lang/Comparable;)I
   L7
    LINENUMBER 102 L7
    IRETURN
   L8
    LOCALVARIABLE it J L1 L3 3
    LOCALVARIABLE $i$a$4$sortBy I L1 L3 5
    LOCALVARIABLE it J L4 L6 3
    LOCALVARIABLE $i$a$4$sortBy I L4 L6 5
    LOCALVARIABLE this Latcoder/abc123/DKt$main$$inlined$sortBy$3; L0 L8 0
    LOCALVARIABLE a Ljava/lang/Object; L0 L8 1
    LOCALVARIABLE b Ljava/lang/Object; L0 L8 2
    MAXSTACK = 4
    MAXLOCALS = 8
  // access flags 0x19
  public final static INNERCLASS atcoder/abc123/DKt$main$$inlined$sortBy$3 null null

  @Lkotlin/Metadata;(mv={1, 1, 10}, bv={1, 0, 2}, k=3, d1={"\u0000\u001e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0006\n\u0002\u0008\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"}, d2={"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
  OUTERCLASS atcoder/abc123/DKt main ([Ljava/lang/String;)V
  // compiled from: Comparisons.kt
  // debug info: SMAP
Comparisons.kt
Kotlin
*S Kotlin
*F
+ 1 Comparisons.kt
kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2
+ 2 D.kt
atcoder/abc123/DKt
*L
1#1,319:1
12#2:320
12#2:321
*E

}


// ================atcoder/abc123/DKt$main$Candidate.class =================
// class version 50.0 (50)
// access flags 0x31
public final class atcoder/abc123/DKt$main$Candidate {

  OUTERCLASS atcoder/abc123/DKt main ([Ljava/lang/String;)V

  // access flags 0x12
  private final J taste

  // access flags 0x11
  public final getTaste()J
   L0
    LINENUMBER 14 L0
    ALOAD 0
    GETFIELD atcoder/abc123/DKt$main$Candidate.taste : J
    LRETURN
   L1
    LOCALVARIABLE this Latcoder/abc123/DKt$main$Candidate; L0 L1 0
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x12
  private final I x

  // access flags 0x11
  public final getX()I
   L0
    LINENUMBER 14 L0
    ALOAD 0
    GETFIELD atcoder/abc123/DKt$main$Candidate.x : I
    IRETURN
   L1
    LOCALVARIABLE this Latcoder/abc123/DKt$main$Candidate; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x12
  private final I y

  // access flags 0x11
  public final getY()I
   L0
    LINENUMBER 14 L0
    ALOAD 0
    GETFIELD atcoder/abc123/DKt$main$Candidate.y : I
    IRETURN
   L1
    LOCALVARIABLE this Latcoder/abc123/DKt$main$Candidate; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x12
  private final I z

  // access flags 0x11
  public final getZ()I
   L0
    LINENUMBER 14 L0
    ALOAD 0
    GETFIELD atcoder/abc123/DKt$main$Candidate.z : I
    IRETURN
   L1
    LOCALVARIABLE this Latcoder/abc123/DKt$main$Candidate; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public <init>(JIII)V
   L0
    LINENUMBER 14 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    ALOAD 0
    LLOAD 1
    PUTFIELD atcoder/abc123/DKt$main$Candidate.taste : J
    ALOAD 0
    ILOAD 3
    PUTFIELD atcoder/abc123/DKt$main$Candidate.x : I
    ALOAD 0
    ILOAD 4
    PUTFIELD atcoder/abc123/DKt$main$Candidate.y : I
    ALOAD 0
    ILOAD 5
    PUTFIELD atcoder/abc123/DKt$main$Candidate.z : I
    RETURN
   L1
    LOCALVARIABLE this Latcoder/abc123/DKt$main$Candidate; L0 L1 0
    LOCALVARIABLE taste J L0 L1 1
    LOCALVARIABLE x I L0 L1 3
    LOCALVARIABLE y I L0 L1 4
    LOCALVARIABLE z I L0 L1 5
    MAXSTACK = 3
    MAXLOCALS = 6

  @Lkotlin/Metadata;(mv={1, 1, 10}, bv={1, 0, 2}, k=1, d1={"\u0000\u0019\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0009\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0009\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000c\u00a8\u0006\u000f"}, d2={"atcoder/abc123/DKt$main$Candidate", "", "taste", "", "x", "", "y", "z", "(JIII)V", "getTaste", "()J", "getX", "()I", "getY", "getZ", "production sources for module ProgramingChallenge with Kotlin"})
  // access flags 0x19
  public final static INNERCLASS atcoder/abc123/DKt$main$Candidate null Candidate
  // compiled from: D.kt
}


// ================atcoder/abc123/DKt$main$priorityQueue$1.class =================
// class version 50.0 (50)
// access flags 0x30
// signature <T:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Comparator<TE;>;
// declaration: atcoder/abc123/DKt$main$priorityQueue$1<T> implements java.util.Comparator<E>
final class atcoder/abc123/DKt$main$priorityQueue$1 implements java/util/Comparator  {


  // access flags 0x1041
  public synthetic bridge compare(Ljava/lang/Object;Ljava/lang/Object;)I
    ALOAD 0
    ALOAD 1
    CHECKCAST atcoder/abc123/DKt$main$Candidate
    ALOAD 2
    CHECKCAST atcoder/abc123/DKt$main$Candidate
    INVOKEVIRTUAL atcoder/abc123/DKt$main$priorityQueue$1.compare (Latcoder/abc123/DKt$main$Candidate;Latcoder/abc123/DKt$main$Candidate;)I
    IRETURN
    MAXSTACK = 3
    MAXLOCALS = 3

  // access flags 0x11
  public final compare(Latcoder/abc123/DKt$main$Candidate;Latcoder/abc123/DKt$main$Candidate;)I
   L0
    LINENUMBER 15 L0
    ALOAD 2
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getTaste ()J
    ALOAD 1
    INVOKEVIRTUAL atcoder/abc123/DKt$main$Candidate.getTaste ()J
    LSUB
    L2I
   L1
    IRETURN
   L2
    LOCALVARIABLE this Latcoder/abc123/DKt$main$priorityQueue$1; L0 L2 0
    LOCALVARIABLE c1 Latcoder/abc123/DKt$main$Candidate; L0 L2 1
    LOCALVARIABLE c2 Latcoder/abc123/DKt$main$Candidate; L0 L2 2
    MAXSTACK = 4
    MAXLOCALS = 3

  // access flags 0x0
  <init>()V
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x19
  public final static Latcoder/abc123/DKt$main$priorityQueue$1; INSTANCE

  // access flags 0x8
  static <clinit>()V
    NEW atcoder/abc123/DKt$main$priorityQueue$1
    DUP
    INVOKESPECIAL atcoder/abc123/DKt$main$priorityQueue$1.<init> ()V
    PUTSTATIC atcoder/abc123/DKt$main$priorityQueue$1.INSTANCE : Latcoder/abc123/DKt$main$priorityQueue$1;
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 0

  @Lkotlin/Metadata;(mv={1, 1, 10}, bv={1, 0, 2}, k=3, d1={"\u0000\u000f\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0008\u0005*\u0001\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"}, d2={"<anonymous>", "", "c1", "atcoder/abc123/DKt$main$Candidate", "kotlin.jvm.PlatformType", "c2", "compare", "(Latcoder/abc123/DKt$main$Candidate;Latcoder/abc123/DKt$main$Candidate;)I"})
  OUTERCLASS atcoder/abc123/DKt main ([Ljava/lang/String;)V
  // access flags 0x18
  final static INNERCLASS atcoder/abc123/DKt$main$priorityQueue$1 null null
  // compiled from: D.kt
}