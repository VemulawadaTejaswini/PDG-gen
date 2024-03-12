Line_2 $$ private static <T extends Annotation> T getAnnotationFromReadMethod(Method readMethod, Class<T> clazz) --> Line_3 $$ return readMethod == null ? null : readMethod.getAnnotation(clazz) [FD]
Line_2 $$ private static <T extends Annotation> T getAnnotationFromReadMethod(Method readMethod, Class<T> clazz) --> Line_3 $$ return readMethod == null ? null : readMethod.getAnnotation(clazz) [CD]
