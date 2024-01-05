package Function;

public class retrunParameter {
    public static int parametr(int hight,int width){
        if (hight<=0||width<=0){
            System.out.println("invaild term ");
            System.exit(0);


        }
        int area= hight*width;
        return area;

    }

    public static void main(String[] args) {
      int area1=  parametr(0,0);
       int area2= parametr(43,576);
      int area3=  parametr(845,526);
        System.out.println("area1: "+area1+" area2: "+area2+" area3: "+area3 );



    }
}
