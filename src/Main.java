import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int side1;
        int side2;
        int area;
        int perimeter;
        double diagonal;

        System.out.print("Enter the side1 of the rectangle : ");

        if (in.hasNextInt())
        {
            side1 = in.nextInt();

            in.nextLine();

            System.out.print("Enter the side2 of the rectangle : ");

            if (in.hasNextInt())
            {
                side2 = in.nextInt();

                in.nextLine();

                area = side1 * side2;

                perimeter = 2 * side1 + 2 * side2;

                diagonal = Math.sqrt(side1 * side1 + side2 * side2);

                System.out.println("Area of rectangle : " + area);

                System.out.println("Perimeter of rectangle : " + perimeter);

                System.out.println("Diagonal of rectangle : " + diagonal);
            }
            else
            {
                System.out.println("Input side2 value is not valid");
            }

        }
        else
        {
            System.out.println("Input side1 value is not valid");
        }

    }

}