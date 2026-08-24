class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            int greatest=arr[i+1];
            for(int j=i+2;j<arr.length;j++)
            {
                if(arr[j]>greatest)
                {
                    greatest=arr[j];
                }
            }
            arr[i]=greatest;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}