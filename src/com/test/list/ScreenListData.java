package com.test.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ScreenListData {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(screen(list).toString());

        //用集合框架实现
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set.toString());
    }

    public static List<Integer> screen(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        for (Integer i : list) {
            if (!temp.contains(i)) {
                temp.add(i);
            }
        }
        return temp;
    }
}
