package Codereview_03;

public class Method_Calls {


    float height;
    float width;



    //create the first method call

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



   //create the second method call

    public void rectangular_method2(float a,float b){

        System.out.println("The area is of the rectangular = " + a * b);

    }

    public void square_method2(float a){
        System.out.println("");
        System.out.println("________________Task_05   Method_02   ------------------");
        System.out.println("");
        System.out.println("The area is of the square = " + a * a);
        System.out.println("The perimeter of the square = " + a * 4);

    }

    public float rectangulat_method_03(){

        float area = this.height * this.width;

        return area;
    }

    public float square_method_03(){

        float area = this.height * this.height;
        float perimeter = this.height * 4;

        return area;

    }



}
