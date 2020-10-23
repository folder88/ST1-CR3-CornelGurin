package Codereview_03;

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
}
