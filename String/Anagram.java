class Anagram {
    public boolean isAnagram(String s, String t) {

        StringBuilder s1 = new StringBuilder(s);
        StringBuilder t1 = new StringBuilder(t);
        
        if(s1.length()!= t1.length()) {
            return false;
        }
       

        for(int i=0; i<s1.length(); i++) {
            for(int j=0; j<t1.length(); j++) {

                if(s1.charAt(i)==t1.charAt(j)) {
                    t1.deleteCharAt(j);
                    break;
                }

            }
        }

        if(t1.length()==0)  {
            return true;
        }
        else {
            return false;
        }


        

    }
}