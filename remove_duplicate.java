class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
    for(int i=0;i<nums.length;i++)       
         {                      
                if(nums[i]!=nums[j])
                {
                      j++;
                     nums[j]=nums[i];
                   
                }
            
        }
         return j+1;
    }
}
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[50];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        Solution t=new Solution();
        t.removeDuplicates(nums);
    }
}