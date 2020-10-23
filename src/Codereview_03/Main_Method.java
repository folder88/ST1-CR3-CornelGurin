package Codereview_03;


public class Main_Method {

    public static void main(String[] args){



       //Creating a object Task_02
        Function Task_02 = new Function();
        //Print Task_02
        System.out.println("");
        System.out.println("__________________Task_02______________________________");
        System.out.println("");
        Task_02.calculate_area();
        System.out.println("");




        //Creating objects for Task_03

        calculateRectArea Task03_object1 = new calculateRectArea(20,30);
        calculateRectArea Task03_object2 = new calculateRectArea(40,50);

        //Printing Task_03
        System.out.println("__________________Task_03______________________________");
        System.out.println("");
        System.out.println(Task03_object1.calculateArea());
        System.out.println(Task03_object2.calculateArea());
        System.out.println("");


        //Creating objects for Task_04
        calculateArea_Perimeter Task04_Object1 = new calculateArea_Perimeter(4);
        calculateArea_Perimeter Task04_Object2 = new calculateArea_Perimeter(2);

        //Print for Task_04
        System.out.println("__________________Task_04______________________________");
        System.out.println("");
        Task04_Object1.CalculateArea();
        Task04_Object2.CalculateArea();






        //Creating Objects Method_01 Task_05

        calculateRectArea method01_1object = new calculateRectArea(3,6);
        calculateRectArea method01_2object = new calculateRectArea(4,8);
        calculateRectArea method01_3object = new calculateRectArea(6,20);

        //Print Method_01
        System.out.println("");
        System.out.println("_____________Task_05 method1_rectangular_______________");
        System.out.println(method01_1object.calculateArea());
        System.out.println(method01_2object.calculateArea());
        System.out.println(method01_3object.calculateArea());

        //Creating Objects for Method_02_rectangular
        calculateRectArea method02_1object = new calculateRectArea(0,0);
        calculateRectArea method02_2object = new calculateRectArea(0,0);
        calculateRectArea method02_3object = new calculateRectArea(0,0);

        //Print Method_02

        System.out.println("_____________Task_05 method2_rectangular_______________");
        System.out.println("");
        method02_1object.void_method(5,6);
        method02_2object.void_method(8,6);
        method02_3object.void_method(8,12);

        //Creating Object Method_03
        calculateRectArea method03_object = new calculateRectArea(0,0);

        //Print Method_03
        System.out.println("");
        method03_object.input_method();

        //Creating Objects for Method_01_square
        calculateArea_Perimeter Method01_1object = new calculateArea_Perimeter(5);
        calculateArea_Perimeter Method01_2object = new calculateArea_Perimeter(8);
        calculateArea_Perimeter Method01_3object = new calculateArea_Perimeter(12);

        //Print Method_01_sqaure
        System.out.println("");
        System.out.println("_____________Task_05 method1_square____________________");
        System.out.println("");
        Method01_1object.CalculateArea();
        Method01_2object.CalculateArea();
        Method01_3object.CalculateArea();

        //Creating Objects for Method_02_square
        calculateArea_Perimeter Method02_1object = new calculateArea_Perimeter(0);
        calculateArea_Perimeter Method02_2object = new calculateArea_Perimeter(0);
        calculateArea_Perimeter Method02_3object = new calculateArea_Perimeter(0);

        //Print Method_02_square
        System.out.println("_____________Task_05 method2_square____________________");
        System.out.println("");
        System.out.println(Method02_1object.return_methodarea(4));
        System.out.println(Method02_1object.return_methodperimeter(4));

        System.out.println(Method02_2object.return_methodarea(5));
        System.out.println(Method02_2object.return_methodperimeter(5));

        System.out.println(Method02_3object.return_methodarea(12));
        System.out.println(Method02_3object.return_methodperimeter(12));


        //Creating Objects for Method_03_square
        calculateArea_Perimeter Method03_object1 = new calculateArea_Perimeter(0);

        //Print Method_03_square
        Method03_object1.input_method();


    }

}
