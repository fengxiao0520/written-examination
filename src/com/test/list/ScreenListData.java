package com.test.list;

import java.util.ArrayList;
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
    }

    public static List<Integer> screen(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (temp.size() <= 0) {
                temp.add(list.get(i));
            }
            for (int j = 1; j < list.size(); j++) {
                if (!temp.contains(list.get(j))) {
                    temp.add(list.get(j));
                }
            }
        }
        return temp;
    }
}
