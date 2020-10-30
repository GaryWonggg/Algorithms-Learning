package com.gary;

import java.util.Arrays;

public class TowSum {


    public int[] twoSum(int[] nums, int target) {

        int nums_length = nums.length;
        int num1_index = 0;
        int num2_index = nums_length -1;
        Arrays.sort(nums);

        for (int i = 0; i < nums_length ; i++){

            if (target < nums[num1_index] + nums[num2_index]){
                num2_index--;
            }

            if (target > nums[num1_index] + nums[num2_index]){
                num1_index++;
            }

            if (target== nums[num1_index] + nums[num2_index]){
                return new int[] {num1_index, num2_index};
            }

        }

        return null;
    }

    public static void main(String[] args) {


        TowSum towSum = new TowSum();
        int[] nums= {3, 2, 4};


        int[] re=towSum.twoSum(nums , 6);
        System.out.println(re);


    }
}
