package it.ttplus;

import it.modele.test.ModuelTest2;

import java.util.ArrayList;
import java.util.Arrays;


public class Template {

    private static final ModuelTest2 M2 = new ModuelTest2();
    public static final int NUM = 10;

    /**
    *客户id
    */
    private int customerid;

    /**
    * 客户姓名
    */
    private String name;



    public static void main(String[] args) {



        System.out.println("-----");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("-----");
        System.out.println("Template.main");
        int num = 10;
        System.out.println(num);
        System.out.println("num = " + num);

        String[] arr = new String[]{"ss", "dd"};
        for (String s : arr) {
            
        }
        for (int i = 0; i < arr.length; i++) {
            
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            
        }

        ArrayList arrayList = new ArrayList();
        for (Object o : arrayList) {

        }
        for (int i = 0; i < arrayList.size(); i++) {
            
        }
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            
        }
        if (arrayList == null) {

        }
        if (arrayList != null) {

        }

        if (arrayList != null) {

        }
        if (arrayList == null) {

        }
    }

    public static void method(){

    }
    public static void testaa(){
        System.out.println();
    }
}
