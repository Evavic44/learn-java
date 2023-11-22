public class While {
  public static void main(String[] args) {
    while (true) {
      System.out.println("Inifinite Loop!");
      break;
    }
    int rowNumber;
    int N;
    
    for (rowNumber = 1; rowNumber <= 12; rowNumber++) {
      for ( N = 1; N <= 12; N++ ) {
        System.out.printf( "%4d", N * rowNumber ); // No carriage return !
      } 
      System.out.println(); // Add a carriage return at end of the line.
    }
  }
}

/*
Compound statements, such as while loops and if statements, are used to
organize simple statements into complex structures, which are called control structures because
they control the order in which the statements are executed.

while ( 〈boolean-expression 〉 )
〈statement 

Do While Statement
Sometimes it is more convenient to test the continuation condition at the end of the loop, instead of at
the beginning, as is done in the while loop. The do..while statement is very similar
to the while statement, except that the word “while,” along with the condition that it tests,
has been moved to the end.

do
〈statement 〉
while ( 〈boolean-expression 〉 );

do {
〈statements 〉
} while ( 〈boolean-expression 〉 );
*/ 