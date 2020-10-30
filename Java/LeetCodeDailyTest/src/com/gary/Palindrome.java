package com.gary;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Palindrome {



    public boolean isPalindrome(String string) {

        if(null == string || string.isEmpty() ){
            return true;
        }
        int index_front = 0;
        int index_end = string.length() - 1;

        while( index_end > index_front ){

            char c_front;
            for (c_front = string.charAt(index_front); index_end > index_front && !Character.isLetterOrDigit(c_front); index_front++ ,c_front = string.charAt(index_front));


            char c_end;
            for (c_end = string.charAt(index_end); index_end > index_front && !Character.isLetterOrDigit(c_end); index_end-- ,c_end = string.charAt(index_end));

            if(Character.toLowerCase(c_end)!= Character.toLowerCase(c_front)){
                return false;
            }

            index_front++ ;
            index_end--;
        }

        return true;
    }


    public static void main(String[] args) {


        long start = System.currentTimeMillis();
        String str_palindrome = "A man, a plan, a canal: Panama";
//        String str_palindrome = "0P";
        Palindrome palindrome = new Palindrome();
        boolean r =  palindrome.isPalindrome(str_palindrome);
        long end = System.currentTimeMillis();

        SimpleDateFormat dataFormat = new SimpleDateFormat("mm:SS.sss");

        System.out.println("Result State is : " + r + " , total cost time : " + dataFormat.format(new Date(end-start)));
    }
}
