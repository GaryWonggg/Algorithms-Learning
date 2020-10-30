package com.gary;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> re_list = new ArrayList<>(0);
        int nums_length = nums.length;
        Arrays.sort(nums);

        if (nums_length <3){
            return re_list;
        }

        for (int i =0,f = i + 1, e=nums_length-1 ; i < nums_length ; i++){
            int target = 0 - nums[i];

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if (i >= f)
                break;

            List re = loopCompute(nums, f, e, i, target);
            if (re != null && !re.isEmpty()){

                re_list.add(re);
            }

        }

        return re_list;
    }


    public List<Integer> loopCompute(int [] nums, int f_index, int e_index, int curr_loop, int target){

        if (target < nums[f_index] + nums[e_index]){
            loopCompute(nums, f_index, --e_index, curr_loop, target );
        }

        if (target > nums[f_index] + nums[e_index]){
            loopCompute(nums, ++f_index, e_index, curr_loop, target );
        }

        if (target== nums[f_index] + nums[e_index]){
            List<Integer> list = new ArrayList<>();
            list.add( nums[curr_loop]);
            list.add( nums[f_index]);
            list.add( nums[e_index]);
            return list;
        }

        return null;
    }



    public static void main(String[] args) {

        ThreeSum threeSum = new ThreeSum();
        int []nums = {-1, 0, 1, 2, -1, -4};
//        int []nums = {-1,0,1};
        List<List<Integer>> list =  threeSum.threeSum(nums);

        for (List<Integer> l : list){
            System.out.println("========================");
            for (int num : l){
                System.out.print(num+ "\t");
            }
            System.out.println();

        }

    }

}
