class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int j=str.length()-1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
