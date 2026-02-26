import java.util.*;
class LengthOfLis {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int lis[]=new int[n];
        Arrays.fill(lis,1);
        int max_len=1;
        for(int i=1;i<n;i++){
            for(int ci=0;ci<i;ci++){
                if(nums[ci]<nums[i])
                lis[i]=Math.max(lis[ci]+1,lis[i]);
            }
            max_len=Math.max(max_len,lis[i]);
        }
        return max_len;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        LengthOfLis obj=new LengthOfLis();
        System.out.println(obj.lengthOfLIS(nums));
        sc.close();
    }
}