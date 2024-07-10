/*
QUESTION

Modify the rectangle program so that it will have 3 methods;
1. To get the input(Dimensions)
2. To get the area and perimeter
3. To display the area and perimeter of the rectangle

(get the dimensions from the user)
*/

import java.util.Scanner;

public class Rectangle{
    //Declare Variables
    double length, width, area, perimeter;

    //Method to input the dimensions
    void getInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        length = scanner.nextDouble();

        System.out.print("Enter the Width: ");
        width = scanner.nextDouble();
    }

    //Method to compute the area and perimeter
    void computeAreaAndPerimeter(){
        area = length * width;
        perimeter = (length + width) * 2;
    }

    //Method to display area and perimeter
    void displayAreaAndPerimeter(){
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
    }

    public static void main(String[] args){
        //Creating an object of rectangle class
        Rectangle recobj = new Rectangle();

        //Calling the methods using the object
        recobj.getInput();
        recobj.computeAreaAndPerimeter();
        recobj.displayAreaAndPerimeter();
    }
}