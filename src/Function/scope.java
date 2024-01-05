package Function;

public class scope {

    static int nums= 73;

    public static void main(String[] args) {
        nums += 56;
        System.out.println(nums );
scope();
        // while printing the num into other function it's not accessible outside the function
        //now I make a STATIC variable that's accessible in any function within this class
        // STATIC variable is accessible within the class it can not be accessible in other class

    }


    // function variable scope
    public static void scope(){
        int num =8;
        nums += 28;
        // in Static variable changes reflect
        //
        System.out.println(num);
        System.out.println(nums);
    }
}
