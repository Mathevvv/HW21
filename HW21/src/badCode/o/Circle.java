package badCode.o;

public class Circle extends Shape {

    double radius;



    @Override
    double calculateArea() {

        return Math.PI * radius * radius;

    }
}