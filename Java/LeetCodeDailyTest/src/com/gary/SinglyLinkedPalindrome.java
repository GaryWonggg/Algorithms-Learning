package com.gary;

import java.util.ArrayList;
import java.util.List;

/*
* 快慢指针
* */


class ListNode {

    int val;
    ListNode next;
    ListNode(int x) { val = x; }

}

public class SinglyLinkedPalindrome {

    public boolean isPalindrome(ListNode head) {

        if(head == null){
            return false;
        }

        List list= new ArrayList<Integer>();

        do {

            list.add(head.val);

        }while(head.next !=  null);  // 有问题   head.next 一直不为空


        int font =0;
        int end = list.size();


            while(font < end){

                if(list.get(font) != list.get(end)){
                    return false;
                }

                font++;
                end--;

            }


            return true;


        }

        public static void main(String [] agrs){



            ListNode listNode2 = new ListNode(2);
            ListNode listNode1 = new ListNode(1);
            listNode1.next = listNode2;


            SinglyLinkedPalindrome slp =new SinglyLinkedPalindrome();
            System.out.println(slp.isPalindrome(listNode1));

        }

    }








