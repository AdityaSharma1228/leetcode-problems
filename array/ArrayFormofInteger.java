public class ArrayFormofInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> arr = new ArrayList<>();

        for(int i=num.length-1; i>0; i--) {
            num[i] = num[i] + k%10;

            if(num[i] > 9) {
                num[i-1] =num[i-1] + num[i]/10;
                num[i] = num[i]%10;
            }

            arr.add(0,num[i]);
            k = k/10;

        }
        num[0] = num[0] + k;


        if(num[0] > 9) {

            int count = 0;
            int duplicate = num[0];

            while(duplicate != 0) {
                duplicate = duplicate/10;
                count++;
            }
            
            for(int j = 1; j <= count; j++) {
                arr.add(0,num[0]%10);
                num[0] = num[0]/10;
            }

        }

        else {
            arr.add(0,num[0]);
        }
        
        return arr;
    }
}