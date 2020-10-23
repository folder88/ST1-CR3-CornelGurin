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

        Method_Calls object01 = new Method_Calls(3,5);
        Method_Calls object02 = new Method_Calls(3);



    }

}
