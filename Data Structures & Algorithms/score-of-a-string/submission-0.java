class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
           if (i+1<s.length())
           {
                int value=Math.abs(s.charAt(i)-s.charAt(i+1));
                sum=sum+value;
           }
        }
        return sum;
    }
}