class Solution {
    public void moveZeroes(int[] nums) {
        int left=0,right=0;
        int len=nums.length;
        while(right<len){
            if (nums[right]!=0){
                int temp;
                temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left=left+1;
            }
            right=right+1;
        }
    }




 public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.print("Output: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();  // Output: 1 3 12 0 0

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.print("Output: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println();  // Output: 0
    }
}
