Line_2 $$ protected Method getReadMethod() --> Line_3 $$ if (MappingUtils.isBlankOrNull(getMethodName)) [CD]
Line_2 $$ protected Method getReadMethod() --> Line_6 $$ if (readMethod == null || readMethod.get() == null) [CD]
Line_6 $$ if (readMethod == null || readMethod.get() == null) --> Line_7 $$ Method method = findMapMethod(clazz, getMethodName, 1) [CD]
Line_2 $$ protected Method getReadMethod() --> Line_10 $$ return readMethod.get() [CD]
