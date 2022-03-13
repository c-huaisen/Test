package com.chs.linkedhashset;

import java.util.LinkedHashSet;

@SuppressWarnings({"all"})
public class LinkedHashSetSource {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("1");
        linkedHashSet.add("4");
        linkedHashSet.add("6");
        linkedHashSet.add("8");
        //1. LinkedHashSet 加入顺序和取出元素/数据的顺序一致
        //2. LinkedHashSet 底层维护的是一个LinkedHashMap(是HashMap的子类)
        //3. LinkedHashSet 底层结构 (数组table+双向链表)
        //4. 添加第一次时，直接将 数组table 扩容到 16 ,存放的结点类型是 LinkedHashMap$Entry
        //5. 数组是 HashMap$Node[] 存放的元素/数据是 LinkedHashMap$Entry类型
        /*
                //继承关系是在内部类完成.
                static class Entry<K,V> extends HashMap.Node<K,V> {
                    Entry<K,V> before, after;
                    Entry(int hash, K key, V value, Node<K,V> next) {
                        super(hash, key, value, next);
                    }
                }

         */
    }
}
