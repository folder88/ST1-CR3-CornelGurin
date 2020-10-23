package Codereview_03;

import Codereview_03.Function;

public class Main_Method {

    public static void main(String[] args){

        Function Task_02 = new Function();
        calculateRectArea Task03_object1 = new calculateRectArea(20,30);
        calculateRectArea Task03_object2 = new calculateRectArea(40,50);
        calculateArea_Perimeter Task04_Object1 = new calculateArea_Perimeter(4);
        calculateArea_Perimeter Task04_Object2 = new calculateArea_Perimeter(2);

        //Print for Tak_02
        Task_02.calculate_area();


        //Print for Task_03
        System.out.println(Task03_object1.calculateArea());
        System.out.println(Task03_object2.calculateArea());

        //Print for Task_04
        Task04_Object1.CalculateArea();
        Task04_Object2.CalculateArea();

        //Print for Task_05

       calculateRectArea method01_1object = new calculateRectArea(3,6);
       calculateRectArea method01_2object = new calculateRectArea(4,8);
       calculateRectArea method01_3object = new calculateRectArea(6,20);

       System.out.println(method01_1object.calculateArea());
       System.out.println(method01_2object.calculateArea());
       System.out.println(method01_3object.calculateArea());

       calculateRectArea method02_1object = new calculateRectArea(0,0);
       calculateRectArea method02_2object = new calculateRectArea(0,0);
       calculateRectArea method02_3object = new calculateRectArea(0,0);

       method02_1object.void_method(5,6);
       method02_2object.void_method(8,6);
       method02_3object.void_method(8,12);


       calculateArea_Perimeter Method01_1object = new calculateArea_Perimeter(5);
       calculateArea_Perimeter Method01_2object = new calculateArea_Perimeter(8);
       calculateArea_Perimeter Method01_3object = new calculateArea_Perimeter(12);

       Method01_1object.CalculateArea();
       Method01_2object.CalculateArea();
       Method01_3object.CalculateArea();

       calculateArea_Perimeter Method02_1object = new calculateArea_Perimeter(0);
       calculateArea_Perimeter Method02_2object = new calculateArea_Perimeter(0);
       calculateArea_Perimeter Method02_3object = new calculateArea_Perimeter(0);

       System.out.println(Method02_1object.return_methodarea(4));
       System.out.println(Method02_1object.return_methodperimeter(4));


       System.out.println(Method02_2object.return_methodarea(5));
       System.out.println(Method02_2object.return_methodperimeter(5));

       System.out.println(Method02_3object.return_methodarea(12));
       System.out.println(Method02_3object.return_methodperimeter(12));



    }

}
