public class Loops {
  public static void main(String[] args) {
    // Block statement
    {
      double ans = 240.04 / 16; // inaccessible local variable outside this block.
      System.out.print("The answer is ");
      System.out.printf("%1.2f", ans);
    }
    System.out.println("\nEnd of block statement");

    // While loop
    int number = 1;
    while (number < 6) {
      System.out.println(number);
      number += 1;
    }
    System.out.println("While loop done!");

    // If Else Statement
    if (number > 5) {
      System.out.printf("The integer %d is greater than 5", number);
    } else {
      System.out.printf( "The integer %d is not greater than 5", number);
    }
  }
}

/*
In Java, there are six control structures: block, while loop, do...while loop, for loop,
the if statement, and the switch statement.

Block
The block statement is used to group a seqeunce of statements into a single statement.
The format of the block statement:
{
〈 statements 〉
}

While Loop
A while loop is used to repeat a given statement while a certain condition remains true.
The format for the while statement:
while (〈boolean-expression 〉)
〈statement 〉

or using the block form:
while (〈boolean-expression 〉) {
〈statements 〉
}

If Statement
An if statement tells the computer to take one of two alternative courses of action, depending
on whether the value of a given boolean-valued expression is true or false

if ( 〈boolean-expression 〉 )
〈statement1 〉
else
〈statement2 〉
*/