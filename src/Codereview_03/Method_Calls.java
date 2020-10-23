package Codereview_03;

public class Method_Calls {


    float height;
    float width;

    Method_Calls(float a,float b){

        this.height = a;
        this.width = b;

        float area = this.height * this.width;

        System.out.println("The area of the rectangular is = " + area);
    }

    Method_Calls(float a){

        this.height = a;
        float area = this.height * this.height;
        float perimeter = this.height * 4;

        System.out.println("The area is of the square = " + area);
        System.out.println("The perimeter of the square = " + perimeter);
    }


}
