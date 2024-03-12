Line_2 $$ public void testGetReadMethod() throws NoSuchFieldException --> Line_3 $$ assertThat(ReflectionUtils.getReadMethod(PrimitiveFieldsWithDefaultValuesBean.class.getDeclaredField("b"))).isEmpty() [CD]
Line_2 $$ public void testGetReadMethod() throws NoSuchFieldException --> Line_4 $$ final Optional<Method> readMethod = ReflectionUtils.getReadMethod(Foo.class.getDeclaredField("bar")) [CD]
Line_2 $$ public void testGetReadMethod() throws NoSuchFieldException --> Line_5 $$ assertThat(readMethod).isNotNull() [CD]
Line_2 $$ public void testGetReadMethod() throws NoSuchFieldException --> Line_6 $$ assertThat(readMethod.get().getName()).isEqualTo("getBar") [CD]
