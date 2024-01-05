package Function;

public class parameter {
    public static void main(String[] args) {
        cal_area(45,56);
        cal_area(49,556);
        cal_area(48.5,568.996);
        cal_area(42.35,5899.6);

    }
    public static void cal_area(double length, double breath){
         double area = length*breath;
        System.out.println("area is : "+ area);
    }

}
