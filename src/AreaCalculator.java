public class AreaCalculator {
    public static final double PI = 3.141592653589793238;

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1.0, 4.0));

    }

    public static double area(double radius){
        double AreaOfCircle =0;
        if(radius<0){
            return -1.0;
        }
        AreaOfCircle = radius*radius*(PI);

        return AreaOfCircle;
    }
    public static double area(double x, double y){
        double AreaOfRectangle=0;
        if((x <0) || (y<0)){
            return -1.0;
        }
        AreaOfRectangle = x*y;

        return AreaOfRectangle;
    }

}
