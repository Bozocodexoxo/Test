
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method 
System.out.println(judgeSquareSum(2147483600));
	}
	public static boolean judgeSquareSum(int c) {
        int start=0;
        int end=(int)Math.sqrt(c);
        long sum=0;
        while(start<=end){
            sum=(start*start)+(end*end);
            if(sum==c) {
                return true;}
            else if(sum>c){
                end--;
            }
            else {
                start++;
            }
            }
        
        
        return false;
    }
}

