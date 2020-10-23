package Codereview_03;

import java.util.Scanner;

public class calculateRectArea {

    float width;
    float height;

      calculateRectArea(float a, float b){

        this.width = a;
        this.height = b;

    }

    // 1method
    public float calculateArea(){

          float area = this.height * this.width;

          return area;
    }

    //2method with loop and array
    public void void_method(float a,float b){

          float area = 1;
          float [] array = {a,b};
          for(int i = 0;i < array.length;i++){
          area = area * array[i];
          }

          System.out.println("The area of the rectangular = " + area);

    }

    //3method
    public void input_method(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rentangular height: ");
        float height = scan.nextFloat();

        System.out.println("Enter the rectangular width: ");
        float width = scan.nextFloat();

        float area = height * width;

        System.out.println("_____________Task_05 method3_rectangular_______________");
        System.out.println("");
        System.out.println("The area of the rectangular = " + area);
        System.out.println("");


    }
}
