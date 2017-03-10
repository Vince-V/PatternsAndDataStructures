package com.excercises.singleton;

/**
 * Created by vincent on 3/4/17.
 */
public class TestSingleton {

    public static void main(String[]args){

        SingletonDbConnect instance1 = SingletonDbConnect.getTheInstance();

        System.out.println(instance1);

    }



}
