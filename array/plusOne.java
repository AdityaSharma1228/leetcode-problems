public class plusOne {
    public int[] plusOne(int[] digits) {

    digits[digits.length -1] = digits[digits.length - 1] +1;

        for(int i = digits.length-1; i>0; i--) {
            if(digits[i] > 9) {
                digits[i-1] = digits[i-1] + digits[i]/10;
                digits[i] = digits[i]%10;
            }
        }

        if(digits[0] > 9) {
            int[] arr = new int[digits.length + 1];
            arr[0] = digits[0]/10;
            arr[1] = digits[0]%10;

            for(int i=1; i<digits.length; i++) {
                arr[i+1] = digits[i];
            }
            return arr;
        }

        else {
            return digits;
        }        

    }
}