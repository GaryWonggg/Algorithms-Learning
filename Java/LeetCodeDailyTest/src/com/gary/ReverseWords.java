package com.gary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;

public class ReverseWords {

    public String reverseWords(String s){
        StringBuffer strBuffer = new StringBuffer();

        int space_point = -1;
        int last_space_index = -1;
        for (int i = 0; i < s.length(); i ++){

            if ( i > space_point){
                last_space_index = space_point;
                space_point = s.indexOf(" ", space_point + 1);
                if ( -1 == space_point){
                    space_point = s.length();
                }
            }

            if ( i == space_point ){
                strBuffer.append(" ");
            }else{
                strBuffer.append(s.charAt(space_point - i + last_space_index));
            }

        }

        String result = strBuffer.toString();
        strBuffer = null;
        return result;
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
//        String str = "Let's take LeetCode contest";
        String str = "Let's";
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverseWords(str));
        long end = System.currentTimeMillis();
        SimpleDateFormat dataFormat = new SimpleDateFormat("mm:SS.sss");
        System.out.println("total cost time : " + dataFormat.format(new Date(end-start)));


//        System.out.println(str.indexOf(" ", 6));


    }
}
