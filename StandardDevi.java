import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * class for Standard deviation function
 */
public class StandardDevi {

        public static double calculateSD(double numArray[])
        {
            double sum = 0.0, standardDeviation = 0.0;
            int length = numArray.length;

            for(double num : numArray) {
                sum += num;
            }

            double mean = sum/length;

            for(double num: numArray) {
                standardDeviation += power(num - mean, 2);
            }

            return squareRoot(standardDeviation/length);
        }


    public static double power(double firstRealNumber, double secondRealNumber) {
            double power = 1.0;
        int exponent = (int) secondRealNumber;
        double base = firstRealNumber;
        while (exponent != 0) {
            if ((exponent & 1) != 0) {
                power *= base;
            }
            base *= base;
            exponent >>= 1;
        }
        return power;
    }

    public static double squareRoot(double input) {
        double error = 0.00001;
        double errorPrecision = 1;
        double duplicate = input;

        while ((errorPrecision) > error) {
            input = (input + duplicate / input) / 2;
            errorPrecision = input - duplicate / input;
        }
        return input;
    }
    /**
     * The main method.
     *
     * @param args the arguments
     */
/*
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#####");
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("** ETERNITY: FUNCTIONS - (σ) **");
            System.out.println("");
            System.out.println("Please enter atleast two values for the array: ");
            String line = input.nextLine();
            String[] tokens = line.split(" ");
            double[] arr = new double[tokens.length];
            for (int i=0; i<arr.length;i++)
                arr[i] = Integer.parseInt(tokens[i]);

            double res = calculateSD(arr);
            System.out.println(df.format(res));
            input.close();
        }

        catch (Exception e) {
            System.out.println("Exception occurred");

        }



    }*/
}
