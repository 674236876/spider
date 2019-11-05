package com.zgp.pider.chapter1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zhugp
 * @description TODO
 * @date 2019/11/5 17:34
 */
public class MapStudy {
    public static void main(String args[]){
        //Map的创建
        Map<String, Integer> map = new HashMap<String, Integer>();
        //值的添加，这里假设是爬虫中的产品id以及每个产品id对应的销售量
        map.put("jd1515", 100);
        map.put("jd1516", 300);
        map.put("jd1515", 100);
        map.put("jd1517", 200);
        map.put("jd1518", 100);
        //第一种方法遍历
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key = " + key + ", Value = " + value);
        }
        //第二种方法遍历
        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        //第三种方法遍历
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }
}
