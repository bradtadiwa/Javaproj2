public class Main {
    public static void main(String[] args) {
        //declared the values as float type
        float earthWeightBVIRAKARE = 81f;
         float marsWeightBVIRAKARE;

        float MARS_GRAVITY_PERCENTAGE = 0.38f;

        //the math to calculate the Mars weight as well as printing it as an output
        marsWeightBVIRAKARE = earthWeightBVIRAKARE * MARS_GRAVITY_PERCENTAGE;

          System.out.println("81 kgs on Earth is " + marsWeightBVIRAKARE + " kgs on Mars");


        //converted mars weight to double and printed
        double marsWeightDoubleBVIRAKARE;

          marsWeightDoubleBVIRAKARE = marsWeightBVIRAKARE;

        System.out.println("Kilograms on Mars after converting to double " + marsWeightDoubleBVIRAKARE);

        //printed out double but with 4 decimal places, 4 indicating the number of decimal places
           System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f\n", marsWeightDoubleBVIRAKARE);

        //converting from double into int which removes the decimal places basically
        int marsWeightIntBVIRAKARE = (int) marsWeightDoubleBVIRAKARE;
          System.out.println("Kilograms on Mars when casted to integer " + marsWeightIntBVIRAKARE);

        //Converting the integer to a character, then printing its  ASCII value.
         char masrWeigtInChar = (char) marsWeightIntBVIRAKARE;
        System.out.println("The ASCII table equivalent of masrWeigtInInt is: " + (int) masrWeigtInChar);


        //Multiply ASCII value of 'a' from previous by 9 then add 2 and printing the result.
        char operationChar = 'a';
        int operationResult = masrWeigtInChar * 9 + 2;
        System.out.println("An example of a mathematical operation on th char type: " + operationResult);








    }
}
