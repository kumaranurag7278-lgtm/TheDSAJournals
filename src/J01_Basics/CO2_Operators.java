package J01_Basics;

import java.util.Scanner;

public class CO2_Operators {
    public static void main(String[] args)
    {
//        float a = 15.03f,b = 24.06f;
//        float c = (float)a+b;
//        float r = (float)a%b;
//        System.out.println(c);
//        System.out.println(r);

//
//        float c = 1.53f;
//        long d = 1231;
//        float r = c*d;
//        System.out.println(r);


//        byte a = 10;
//        byte b = 20;
//
//        var result1 = a + b;
//
//        int x = 10;
//        long y = 20L;
//
//        var result2 = x + y;
//
//        int p = 10;
//        double q = 2.5;
//
//        var result3 = p + q;
//
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);


//        Area of a Triangle

//        Take the input first
//        float base,height,Area;
//        Scanner sc = new Scanner (System.in);
//        System.out.print("enter base");
//        base = sc.nextFloat();
//        System.out.print("enter Height");
//        height = sc.nextFloat();
//        write the formula for area of triangle
//        Area = (float) (0.5*base * height);
//        System.out.print("Area of the triangle "+ Area);
//
//        area of a equivalent triangle without height
        float a,b,c,s,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sides of triangle");;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        s = (a+b+c)/2f;
        System.out.println("perimeter of triangle "+s);
        area = (float) (Math.sqrt(s*(s-a)*(s-b)*(s-c)));

        System.out.print("area of the triangle "+ area);


    }
}
