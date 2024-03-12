Line_2 $$ private static boolean hasNonObjectReadMethod(PropertyDescriptor descriptor) --> Line_3 $$ Method readMethod = descriptor.getReadMethod() [FD]
Line_2 $$ private static boolean hasNonObjectReadMethod(PropertyDescriptor descriptor) --> Line_3 $$ Method readMethod = descriptor.getReadMethod() [CD]
Line_2 $$ private static boolean hasNonObjectReadMethod(PropertyDescriptor descriptor) --> Line_4 $$ return readMethod != null && readMethod.getDeclaringClass() != Object.class [CD]
Line_3 $$ Method readMethod = descriptor.getReadMethod() --> Line_4 $$ return readMethod != null && readMethod.getDeclaringClass() != Object.class [FD]
