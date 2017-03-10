package com.excercises.singleton;

/**
 * Created by vincent on 3/4/17.
 */
public class SingletonDbConnect {

//    private static SingletonDbConnect singleInstance = new SingletonDbConnect();

    private static SingletonDbConnect singleInstance = null;

    // private constructor to make it a singleton
    private SingletonDbConnect(){

    }

    public static SingletonDbConnect getTheInstance() {

        //the below lines is to make the singleton lazily loaded
        if(singleInstance == null){
            singleInstance = new SingletonDbConnect();
        }
        return singleInstance;
    }
}
