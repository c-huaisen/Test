package com.chs.set_;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {

        //以下代码debug，查看HashSet的扩容
        HashSet hashSet = new HashSet();
        for (int i = 0; i <= 7; i++) {
            hashSet.add(new A(i));
        }

        for (int i = 0; i <= 7; i++) {
            hashSet.add(new B(i));
        }


    }
}

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        //返回hashCode的值固定，让添加的元素打到table的一条链表上
        return 100;
    }
}

class B {
    private int n;

    public B(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        //返回hashCode的值固定，让添加的元素打到table的一条链表上
        return 200;
    }
}
