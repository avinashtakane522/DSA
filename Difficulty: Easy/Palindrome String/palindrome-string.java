class Solution {
    // boolean isPalindrome(String s) {
    //     // code here
    //     String s1="";
    //     for(int i=s.length()-1; i>=0; i--){ 
    //       s1+=s.charAt(i);
    //     }
    //     return s.equals(s1);
    // }
    // boolean isPalindrome(String s) {
    //     // code here
    //     String s1= new StringBuilder(s).reverse().toString();
        
    //     return s.equals(s1);
    // }
    boolean isPalindrome(String s) {
        // code here
        int left =0;
        int right =s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}