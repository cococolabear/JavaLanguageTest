package com.example.javalanguaguetest.collections.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2020/10/14 1:19 上午
 */
public class Test {
    public static void main(String[] args) {
        String[] array = new String[3];
        array[0] = "王利虎";
        array[1] = "张三";
        array[2] = "李四";
        List<String> list = Arrays.asList(array);//数组转化为list集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\n");
        //使用迭代器进行遍历
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}
