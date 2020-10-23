package Codereview_03;

import java.util.Scanner;

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

    public float return_methodarea(float a){

         float area = a * a;

         return area;
    }

    public float return_methodperimeter(float a){

        float perimeter = a * 4;

        return perimeter;
    }


    public void input_method(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the square height ");
        float height = scan.nextFloat();

        float area = height * height;
        float perimeter = height *4;


        System.out.println("The area of the rectangular = " + area);
        System.out.println("The perimeter of the rectangular = " + perimeter);


    }
}
