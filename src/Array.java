import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    String[] myNames;
    int[] age;
    double[] prices;

    myNames = new String[10]; // create an array with 10 String items. (Default is null)
    age = new int[15]; // creates an array with 15 int items. (Default is 0)
    prices = new double[20]; // creates an array with 25 double items. (Default is 0)

    // Syntax 1
    float[] fractions = new float[5]; // creates an array of 5 items with a base type of float

    // Syntax 2
    String[] names = { "John", "Ben", "Steve", "Peter" }; // creates an array of 4 names
    int[] dates = { 1985, 2023, 1408, 1939 }; // creates an array of 4 numbers
    System.out.println(myNames[0]); // Returns "John"
    System.out.println(dates[dates.length - 1]); // Returns the last date 1939

    // Syntax 3
    double[] date = new double[5];
    Arrays.fill(date, 1.4); // Fill date array with 1.4
    System.out.println(date[0]); // returns 1.4

    // Arrays and For Loops
    int index = 0;
    String firstItem = names[index];
    String secondItem = names[1];

    System.out.println("First name is " + firstItem);
    System.out.println("Second name is " + secondItem);

    // Looping names array using For Loop
    int i;
    for (i = 0; i < names.length; i++) {
      System.out.print(names[i]);
    }

    // Problem 1: Finding the average of all elements in an array of double.
    double average;
    double total;
    int count;

    total = 0;
    for (count = 0; count < prices.length; count++) {
      total += prices[count];
    }
    average = total / prices.length;
    System.out.println("Total average is " + average);

    // Problem 2: Finding the largest number in an array.
    int maxNum;
    int id;
    maxNum = 0;

    for (id = 0; id < age.length; id++) {
      if (age[id] > maxNum) {
        maxNum = age[id];
      }
    }
    // maxNum is largest number in age at this point.

    // Problem 3. Processing some elements in an array using if/else controls statements
    int nonZeroItemsCount;
    float nonZeroTotal;
    float nonZeroAverage;
    int counts;

    nonZeroTotal = 0;
    nonZeroAverage = 0;
    nonZeroItemsCount = 0;

    for (counts = 0; counts < fractions.length; counts++) {
      if (fractions[counts] != 0) {
        nonZeroTotal += fractions[counts]; // add only non-zero floating point number to total
        nonZeroItemsCount += 1; // count number of non-zero items
      }
    }

    if (nonZeroItemsCount == 0) {
      System.out.println("No none zero items found");
    } else {
      nonZeroAverage = nonZeroTotal / nonZeroItemsCount;
      System.out.printf("Total average of non zero items is %f", nonZeroAverage);
    }
  }
}

/*
  A data structure is a specialized format for organizing, processing and storing data. This usually consists of a number of data items chunked together so that they can be treated as a unit.

  An array is a data structure (collection) of data items arranged as a numbered sequence, so that each individual item can be reffered  to by it's position number.
  ! In Java all the items of an array must be of the same type.
  The numbering of an array is zero-based, and the type of the items in an array is called the Base Type.

  Before you can use a variable to refer to an array, the variable must be declared and it must have a type. For an array of Strings, the type would be; String[] or for int; int[]

  Arrays are essentially objects, so we need a special syntax to create an array.
  To create an array, you use the new keyword followed by the array type and a square brackets of array items

  * Creating an Array

  <array-type[]> <array-variable> = new <base-type>[<array-length>]
  
  String[] names = new String["John", "Stella", "Ben"]

  To add items to the array, you can use a for loop to iterate through the array and assign a value or variable to the current item of the array using it's index.
  
  Another way is by specifying the items immediately after initializing the array

  int[] num = {1, 2, 3, 4, 5, 6}
  
  Another way is using the Arrays.fill class.

  import java.utils.Array
  double[] height = new double[5];
  
  Arrays.fill(height, double 1.5) fills the array of height with 1.5
  A more realistic example would be using a for loop to fill the array.

  When you create an array of int, each items is already initialized with 0, for boolean, each item is filled with false, for Strings, the inital value of the array is null.

  * Two Dimensional Arrays
  * Chapter 3 Exercise
*/