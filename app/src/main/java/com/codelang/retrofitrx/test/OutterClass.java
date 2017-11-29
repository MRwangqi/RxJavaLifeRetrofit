package com.codelang.retrofitrx.test;

/**
 * @author wangqi
 * @since 2017/11/28 09:54
 */
public class OutterClass {
    private String name;

    public class Inner {
        public void list() {
            System.out.println("outter name is " + name);
        }
    }
}