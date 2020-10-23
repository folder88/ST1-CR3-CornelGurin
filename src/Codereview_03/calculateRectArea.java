package Codereview_03;

import java.util.Scanner;

public class calculateRectArea {

    float width;
    float height;

      calculateRectArea(float a, float b){

        this.width = a;
        this.height = b;

    }

    public float calculateArea(){

          float area = this.height * this.width;

          return area;
    }


    public void void_method(float a,float b){

          float area = a * b;

          System.out.println("The area of the rectangular = " + area);

    }

    public void input_method(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rentangular height ");
        float height = scan.nextFloat();

        System.out.println("Enter the rectangular width ");
        float width = scan.nextFloat();

        float area = height * width;

        System.out.println("The area of the rectangular = " + area);


    }
}
