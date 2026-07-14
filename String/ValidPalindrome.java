class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String original = " ";
        String palindrome = " ";

        s = s.toLowerCase();
        
        for(int i=0; i<s.length(); i++) {
            if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122 ||
            ((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)) {

                original = original + s.charAt(i);
                
            }
        }

        for(int i=s.length()-1; i>=0; i--) {
            if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122 ||
            ((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)) {

                palindrome = palindrome + s.charAt(i);

            }
        }

        palindrome = palindrome.trim();
        original = original.trim();

        if(palindrome.equals(original)) {
            return true;
        }
        else {
            return false;
        }

    }
}