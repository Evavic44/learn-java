public class Switch {
  public static void main(String[] args) {
    int n = 10;

    switch (n) {
      case 1 -> System.out.println("The number is 1");
      case 2, 4, 8 -> {
        System.out.println("The number is 2, 4, 6, 8");
        System.out.println("That's aa power of 2!");
      }
      case 3, 6, 9 -> {
        System.out.println("The number is 3, 6, 9");
        System.out.println("That's a multiple of 3!");
      }
      case 5 -> System.out.println("The number is 5");
      default -> System.out.println("The number is 7 or is outside the range of 1 to 9");
    }

    // This is equvalent to the chain of if/else statements:
    if (n == 1) {
      System.out.println("The number is 1.");
    }
    else if ( n == 2 || n == 4 || n == 8 ) {
      System.out.println("The number is 2, 4, or 8.");
      System.out.println("(That's a power of 2!)");
    }
    else if ( n == 3 || n == 6 || n == 9 ) {
      System.out.println("The number is 3, 6, or 9.");
      System.out.println("(That's a multiple of 3!)");
    }
    else if ( n == 5 ) {
      System.out.println("The number is 5.");
    }
    else {
      System.out.println("The number is 7 or is outside the range 1 to 9.");
    }
  }
}
/* 
A switch statement allows you to test the value of an expression and depending on that value, jump directly to some location within the switch statement. Only expressions of certain types can be used.
The expression can be of different types except double and floats.

The positions within a switch statement to which it can jump are marked with case labels
that take the form: “case 〈constantList〉”. Where the constantList consists of one or more literals of the same type as the expression in the switch, separated by commas.

The case label is followed by ->, that is by a symbol made up of a hyphen and a greater-than
character, and then by a single statement.

A switch statement can also, optionally, have one jump point labeled with default instead of with a
case label. The syntax for the statement can be specified as follows, noting that there can be
at most one default case and that all the constants in the case labels must be different:

switch ( 〈expression 〉 ) {
  〈case-label-or-default 〉 -> 〈statement 〉
〈case-label-or-default 〉 -> 〈statement 〉
}
*/ 