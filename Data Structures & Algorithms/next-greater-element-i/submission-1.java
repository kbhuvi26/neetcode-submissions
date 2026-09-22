class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    boolean found=false;
                    for(int k=j+1;k<nums2.length;k++)
                    {
                        if(nums2[j]<nums2[k])
                        {
                            list.add(nums2[k]);
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        list.add(-1);
                    }
                    break;
                }
            }
        }
        int [] arr=new int [list.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}