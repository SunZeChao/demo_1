package com.ygtimes.demo;

import java.util.HashMap;

/**
 * @author
 * @date 2019/12/10 - 22:24
 */
public class DebugTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","21");
        map.put("school","zbzy");
        map.put("major","computer");
        String age = map.get("age");
        System.out.println("age="+age);

        map.remove("major");
        System.out.println(map);

    }
}
