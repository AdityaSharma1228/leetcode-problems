class SumOfBeautyOfString {
    public int beautySum(String s) {

        String beauty = " ";
        
        int sum = 0;

        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                int[] fre = new int[26];
                beauty  = s.substring(i,j);

                
            for(int k=0; k<beauty.length(); k++) {
                fre[beauty.charAt(k) - 'a']++;
            }

            int maxfre = 0;
            int minfre = Integer.MAX_VALUE;
                

                for(int l=0; l<26; l++) {
                    if(fre[l] > 0) {
                        maxfre = Math.max(maxfre, fre[l]);
                        minfre = Math.min(minfre, fre[l]);
                    }
                }
                sum += (maxfre - minfre);
            }
        }
        return sum;
    }
}