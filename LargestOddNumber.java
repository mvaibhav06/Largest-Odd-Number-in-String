public class LargestOddNumber {
    public String largestOddNumber(String num) {
        int len = num.length();
        String out = "";

        for(int i=len-1; i>=0; i--){
            int lastNumber = Character.getNumericValue(num.charAt(i));
            if(lastNumber%2 != 0){
                out = num.substring(0,i+1);
                break;
            }
        }
        return out;
    }
}
