package Codereview_03;

public class calculateArea_Perimeter {

    float height;

     calculateArea_Perimeter(float a){

        this.height = a;

    }

    public void CalculateArea(){

        float Area = this.height * this.height;
        float Perimeter = this.height * 4;

        System.out.println("The Area is = " + Area);
        System.out.println("The Perimeter is = " + Perimeter);

    }
}
