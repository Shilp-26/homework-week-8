package week8;

public class SharedDigit {

    public static void main(String[] args) {


    }

    public static boolean hasSharedDigit(int num1,int num2){
        if((num1<=10||num1>=99)||(num2<=10||num2>=99)){
            return false;
        }
        int realNum2=num2;
        while(num1>0){
            int num1Dig=num1%10;
            while(num2>0){
                int num2Dig=num2%10;
                if(num1Dig==num2Dig){
                    return true;
                }
                num2=num2/10;
            }
            num1=num1/10;
            num2=realNum2;
        }
        return false;
    }
}
