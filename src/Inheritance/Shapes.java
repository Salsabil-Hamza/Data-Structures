package Inheritance;
import java.util.List;


// final abstract
//       cannot be final


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shapes {
        public static void main(String[] args) {
            System.out.println("Welcome to create a shape!");
            List<Shape> shapes= new ArrayList<>();
            shapes.add(new Rectangle(1,2));
            shapes.add(new circle(5));

            for (Shape shape: shapes){
            System.out.println(shape.area());
            System.out.println(shape.circumference());
            }

        }

    interface Shape {
        double area();
        double circumference();

    }

        static class Rectangle implements Shape{

            private int length;
            private int width;
            public Rectangle(int l, int w){
                this.length=l;
                this.width=w;
            }

            @Override
            public double area() {
                return length*width;

            }

             @Override
             public double circumference() {
                 return (length+width)*2;
             }
         }
          static class circle implements Shape{

        private int radius;

        public circle(int r) {
            this.radius = r;
        }

        @Override
        public double area() {
            return radius*radius*Math.PI;

        }

        @Override
        public double circumference() {
            return 2*radius*Math.PI;
        }
    }


}





