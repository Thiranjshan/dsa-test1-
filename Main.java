//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nums[] = {1,3,5,8,12,18};
        int target = 18;

        int result = linearSearch(nums,target);
        int result2 = binarySearch(nums,target);

         if (result == -1){
             System.out.println("Element not found");
         }
         else{
             System.out.println("Element found at index: "+result);

         }
    }

    public static int linearSearch(int nums[],int target) {
        int steps=0;
        for (int i=0;i<nums.length;i++){
            steps++;
            if(target == nums[i]){
                System.out.println("Steps taken by linear search: "+steps);
                return i;
            }

        }

        return -1;
    }

    public static int binarySearch (int nums[],int target) {

        int steps=0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("Steps taken by binary search: "+steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}