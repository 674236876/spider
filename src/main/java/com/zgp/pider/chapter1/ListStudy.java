package com.zgp.pider.chapter1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhugp
 * @description TODO
 * @date 2019/11/5 17:35
 */
public class ListStudy {
    public static void main(String args[]){
        //List集合的创建

        List<String> urllist = new ArrayList<String>();
        urllist.add("https://movie.douban.com/subject/27608425");
        urllist.add("https://movie.douban.com/subject/26968024");
        //第一种遍历方式
        for (String url : urllist) {
            System.out.println(url);
        }
        //第二种遍历方式
        for (int i = 0; i < urllist.size(); i++) {
            System.out.println(i + ":" + urllist.get(i));
        }
        //第三种遍历方式
        Iterator<String> it = urllist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
