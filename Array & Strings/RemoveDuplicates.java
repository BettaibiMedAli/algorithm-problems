import java.util.*;
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> tab = new ArrayList<>();
        int min = nums[0];
        tab.add(0);
        for(int i = 1; i < nums.length ; i++)
        {
            if(nums[i] != min)
            {
                tab.add(i);
                min = nums[i];
            }
        }
        int n = tab.size();
        for(int i = 0; i < n ; i++)
        {
            nums[i] = nums[tab.get(i)];
        }
        return n;
    }
}
