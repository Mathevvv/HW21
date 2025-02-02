package badCode.o;

public class Rectangle extends Shape {

    double weight;
    double height;


    @Override
    double calculateArea() {

        return weight * height;

    }


}
