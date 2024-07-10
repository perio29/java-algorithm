package org.example.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bubble {

  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 5, 1, 8, 7, 3));

    System.out.println(bubble_sort(nums));
  }

  public static ArrayList<Integer> bubble_sort(ArrayList<Integer> nums) {
    int len_numbers = nums.size();
    for (int i = 0; i < len_numbers; i++) {
      for (int j = 0; j < len_numbers - 1 - i; j++) {
        if (nums.get(j) > nums.get(j + 1)) {
          Collections.swap(nums, j, j + 1);
        }

      }
    }
    return nums;
  }

  ;
}
