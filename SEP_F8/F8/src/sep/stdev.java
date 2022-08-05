package sep;
/**
 * class for Standard deviation function
 */
public class stdev {

        public static double calSD(double numArray[])
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
            
            

            double res = squareRoot(standardDeviation/length);
            String s = String.valueOf(res);
            if (s == "NaN") {
            	res=0;
            }
            return res;
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
        double error = 0.00000000001;
        double errorPrecision = 1;
        double duplicate = input;

        while ((errorPrecision) > error) {
            input = (input + duplicate / input) / 2;
            errorPrecision = input - duplicate / input;
        }
        return input;
    }
}