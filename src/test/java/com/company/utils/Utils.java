package com.company.utils;

import java.util.Random;

/**
 * Created by Lena on 3/10/2018.
 */
public class Utils {
    //generate random mail
    public static class Random{

        public static String getRandomEmail(){
            return System.currentTimeMillis()+"@mail.ru";
        }
    }
}
