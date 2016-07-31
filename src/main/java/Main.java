public class Main {

        // reproduce  java.lang.StackOverflowError
        //first case
        /*static { new Main(); }

        { new Main(); }*/

    public static void main(String[] args) {



        // reproduce java.lang.OutOfMemoryError
        //getOutOfMemoryError();

        // reproduce  java.lang.StackOverflowError
        //second case
        //getStackOverflowError();

        //third case
        //new Main().toString();

    }

    static void getOutOfMemoryError (){
        int i = 100;
        String str = "asdfg asdjfgasd asdjkfgsdajfk gsdafjg asdf";
        while( i > 0 ){

            str = str + str;
            i--;
        }
    }

    static void getStackOverflowError (){
        getPow(16,2);
    }

    static double  getPow(double number1, double number2){
        getSqrt(16);

        return Math.pow(number1, number2);
    }

    static double  getSqrt(double number1){
        getPow( 4,2);

        return Math.pow(number1, 0.5);
    }
    @Override
    public String toString() {
        return ""+this;
    }

}
