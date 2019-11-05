package com.zgp.pider.chapter1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhugp
 * @description TODO
 * @date 2019/11/5 17:35
 */
public class QueueStudy {
    public static void main(String args[]) {
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.offer("https://www.douban.com/people/46077896/likes/topic/");
        queue.offer("https://www.douban.com/people/1475408/likes/topic");
        queue.offer("https://www.douban.com/people/3853295/likes/topic/");
        boolean t = true;
        while (t) {
            //如果Url队列为空,停止执行程序,否则请求Url
            if (queue.isEmpty()) {
                t = false;
            } else {
                //请求的url
                String url = queue.poll();
                System.out.println(url);
                //这里要写请求数据,获取相应状态码，如果状态码为200,则解析数据;如果为404，url移除队列；否则该url重新如列
            }
        }
    }
}
