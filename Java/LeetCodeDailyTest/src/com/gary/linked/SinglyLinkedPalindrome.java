package com.gary.linked;


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

        ListNode fast = head;
        ListNode slow = head;
        ListNode first = slow;
        ListNode second = null;// have to null




        // 列表元素为奇数
        while(fast.next != null && fast.next.next != null){ //当前限定链表元素必须是奇数 稍后改偶数
            //用 fast 来控制循环

            /**
             * 移动 指针slow 的同时操作翻转前部链表
            * */

//            first = slow;  ??

            slow = slow.next;

            first.next = second;


            second = slow; // second pointer has to the next node





            fast = fast.next.next;

//            System.out.print("slow entity : "+slow.val);
//            System.out.print("--");
//            System.out.println("fast entity : "+fast.val);

            //开始破链翻转，改变指向关系  将  1->2->3->4->5 改为  1<-2<-3<-4<-5

//            next = next.next;




        }





            return true;


        }

        public static void main(String [] agrs){
            ListNode listNode9 = new ListNode(1);
            ListNode listNode8 = new ListNode(2);
            ListNode listNode7 = new ListNode(3);
            ListNode listNode6 = new ListNode(4);
            ListNode listNode5 = new ListNode(5);
            ListNode listNode4 = new ListNode(4);
            ListNode listNode3 = new ListNode(3);
            ListNode listNode2 = new ListNode(2);
            ListNode listNode1 = new ListNode(1);
            listNode1.next = listNode2;
            listNode2.next = listNode3;
            listNode3.next = listNode4;
            listNode4.next = listNode5;
            listNode5.next = listNode6;
            listNode6.next = listNode7;
            listNode7.next = listNode8;
            listNode8.next = listNode9;

            SinglyLinkedPalindrome slp =new SinglyLinkedPalindrome();
            System.out.println(slp.isPalindrome(listNode1));

        }

    }








