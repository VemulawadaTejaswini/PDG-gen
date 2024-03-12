Line_3 $$ for (String readMethod : HTTP_REQUEST_READ_METHODS) --> Line_4 $$ if (readMethod.equalsIgnoreCase(httpMethod)) [FD]
Line_2 $$ public static boolean isReadMethod(String httpMethod) --> Line_4 $$ if (readMethod.equalsIgnoreCase(httpMethod)) [FD]
Line_4 $$ if (readMethod.equalsIgnoreCase(httpMethod)) --> Line_5 $$ return true [CD]
Line_2 $$ public static boolean isReadMethod(String httpMethod) --> Line_8 $$ return false [CD]
