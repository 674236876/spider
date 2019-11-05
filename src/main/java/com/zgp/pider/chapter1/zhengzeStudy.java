package com.zgp.pider.chapter1;

/**
 * @author zhugp
 * @description TODO
 * @date 2019/11/5 17:40
 */
public class zhengzeStudy {
    public static void main(String args[]) {
        String url = "//i.autohome.com.cn/75975500";
        String user_id = url.replaceAll("\\D", "");
        //取代所有的非数字字符
        System.out.println(user_id);
        //输出的结果即为75975500

    }
}
