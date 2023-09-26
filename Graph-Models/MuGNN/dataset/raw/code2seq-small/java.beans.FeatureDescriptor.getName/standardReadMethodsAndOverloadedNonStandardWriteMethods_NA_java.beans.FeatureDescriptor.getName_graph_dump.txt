Line_28 $$ if (pd.getName().equals("foo")) -->Line_29 $$ assertThat(pd.getWriteMethod(), is(C.class.getMethod("setFoo", String.class)))[ CD ]
Line_28 $$ if (pd.getName().equals("foo")) -->Line_30 $$ return[ CD ]
