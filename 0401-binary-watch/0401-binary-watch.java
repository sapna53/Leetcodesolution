class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result=new ArrayList<>();
        if(turnedOn>=9){
            return result;
        }
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(Integer.bitCount(h)+Integer.bitCount(m)==turnedOn){
                    result.add(String.format("%d:%02d", h,m));
                }
            }
        }
        return result;
    }
}