                                                                              # Cuprins #

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# ======================================================================---JAVA---=======================================================================

# 1. BASICS about numbers, decimals and more in JAVA

❗❗❗❗❗❗
> SHORTCUTS in Java:  -> psvm = public static void main(String[] args) {...}
> ❗❗❗❗❗❗

    ## ✅I. -How to display the numbers: byte,short,int (integer), long
             -Primitives
             -Whole numbers, full numbers
             -How to open 'jshell'. Type in Command: 'jshell'

> With those values, primiteve values we know how much width(store) occupye every primitive (byte[-127, 127], short[-32767, 32767], int[...], long[...])
> Also note that if we need to find the negative value [Byte.MIN_VALUE], an for positive value [Byte.MAX_VALUE]
> Also note that we can't have 2 different ecuations in the same statement, we need to separate them by a comma ';'
> Can be 2 ecuations in the same statement only if they are from the same Primitive value []

> System.out.print("Long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VAL ")" );
> =======>>>Long Value Range (-9223372036854775808 to 9223372036854775807)

> long myLongValue = 100L;//The L is used to let Java know that this value must be included in the 'long' contion because it'a very large number
> =========>>>>myLongValue ==> 100
>
> byte firstByteValue = Byte.MAX_VALUE;
> ========>>>>firstByteValue ==> 127
>
> short secondShortValue = Short.MAX_VALUE;
> ========>>>>secondShortValue ==> 32767
>
> int thirdIntValue = Integer.MAX*VALUE;
> thirdIntValue ==> 2147483647
> CHALLENGE
> long lastValueLong = (long) 50.000 + 10 * (firstByteValue + secondShortValue + intValue); --- ORRRR --- long lastValueLong = 50.000L + 10L \* (firstByteValue + secondShortValue + ntValue);
> ❗❗❗❗❗ NOTE When we want to convert numbers to Long values we can add a 'suffix' at the end of the number like we see in the second exemple to make the ecuation work. The suffix is 'L' for Long

[Primitive.byte,short,int,long.IMG/documentation.IMAGES]/[Size.of.Primitive.Types.and.Width//documentation.IMAGES]/[Java's.Primitive.Types(whole.number,real.number,single.character,boolean.value//documentation.IMAGES)]

                                                                ❗❗❗ 🌳🌳[DECIMALS]🌳🌳 ❗❗❗

    ## ✅II. -Primitives. Float and Double Primitives;
              -Fractional parts
              -Numbers with decimals

> Floating-point Number Data Types: 'float', 'double'
>
> The FLOAT value/number:
> ----System.out.print("Float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");----
>
> > > > > > > > > > > > > Float Value Range(1.4E-45 to 3.4028235E38)

> The DOUBLE value/number:
> ----System.out.print("Double Value Range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
>
> > > > > > > > > > > > > > > > > > > > > > > > Double Value Range(4.9E-324 to 1.7976931348623157E308)

> EXEMPLES:

jshell> int myIntValue = 5; float myFloatValue = 5; double myDoubleValue=5;

myIntValue ==> 5
myFloatValue ==> 5.0
myDoubleValue ==> 5.0

> ❗❗❗❗❗ NOTE. Any number with a decimal is a double in JAVA. So, 10.5 is a double by default in Java
> ❗❗❗❗❗ NOTE. Same as the Long primitive from the above lesson, here we also need to add a 'suffix' at the end of our value. For 'myFloatValue' = 5.25F, and for 'myDoubleValue' = 5.25D, otherwise we will get an error. It can work without the 'prefix' only for numbers like: 5, 2, etc, if we will have
> numbers with decimals we need to add the specific 'preffix'
>
> How to use 'Casting' and what is it:
> When we want to convert a decimal number to a whole number we can 'Cast' that number
>
> > > > > > > > > > > > > > > > > float myOtherFloatValue = (float) 5.35
> > > > > > > > > > > > > > > > > myOtherFloatValu ==> 5.25

------OR IF WE WANT TO ELIMINATE THE DECIMALS----------

> > > > > > > > > double numarDouble = 10.5F;
> > > > > > > > > int numarIntreg = (int) numarDouble; ---
> > > > > > > > > -------To eliminate the deimals we need to convert the number to an 'int' value/primitive

            ❗❗❗❗❗❗În acest caz, valoarea zecimală 10.5 este convertită la 10 prin eliminarea zecimalelor în timpul procesului de casting.
            Este important să fii atent la casting, deoarece poate duce la pierderea de informație. De exemplu, când convertești un double la int, partea zecimală este eliminată, iar rezultatul poate fi diferit de ceea ce te-ai aștepta.❗❗❗❗❗❗

> Precision of the Float and Double comparative with Int

jshell> myIntValue = 5/2;
myIntValue ==> 2

jshell> myFloatValue = 5f / 2f;
myFloatValue ==> 2.5

jshell> myDoubleValue = 5d / 2d;
myDoubleValue ==> 2.5

> another EXEMPLE

jshell> myIntValue = 5 / 3;
myIntValue ==> 1

jshell> myFloatValue = 5f / 3f;
myFloatValue ==> 1.6666666

jshell> myDoubleValue = 5d / 3d;
myDoubleValue ==> 1.6666666666666667

jshell> myDoubleValue = 5.00 / 3.00;
myDoubleValue ==> 1.6666666666666667

> > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > > ❗❗❗❗❗❗ IMPORTANT NOTE ...ALWAYS USE ONLY -----DOUBLE NUMBERS------ ❗❗❗❗❗❗❗ <<<<<<<<>>>>>>>>

> another EXEMPLE: How to transform Pounds to Kilogram >>>

jshell> double numberPoun = 0.45359237d;

jshell> double myPoundNumbers = 200;
myPoundNumbers ==> 200.0

jshell> double convertedToKilograms = myPoundNumbers \* 0.45359237d;
convertedToKilograms ==> 90.718474

[]/[]

                                                           ❗❗❗ 👸👸[FLOAT & DOUBLE PRIMITIVES]👸👸 ❗❗❗

    ## ✅III. -The char and boolean Primitive Data Types

> NOTE . A char can store only a single character. If we compare it to a string witch can store multiple words. Char is used to store just 1 character
> How to find the unique codes for Symbols like letters, numbers, etc: https://symbl.cc/en/unicode/table/
> NOTE !!! that every symbol as letter, numbers, etc have a unique code number

> char myChar = 'D';
> ---myChar ==> 'D'

> Unicode Symbol for 'D': ==> U+0044 ... OR ... &#68

--- jshell> char myUnicode = '\u0044';
--- myUnicode ==> 'D'

---jshell> char myDecimalCodeTest = 68;
---myDecimalCodeTest ==> 'D'

> ❕❕❕❕❕❕❕❕❕❗❗❗❗ BOOLEAN Primitive Type ❕❕❕❕❕❕❕❕❕❗❗❗❗
>
> How to name the Boolen variables, just some exemples:
> -isCutomerOverTwntyOne
> -isEligibleForDiscount
> -hasValidLicense
> -isMarried
> -hasChildren
>
> Boolean gives just 2 options: True || False, Yes || No, 1 || 0;

---jshell> boolean myTrueBooleanValue = true;
myTrueBooleanValue ==> true

---jshell> boolean myFalseBooleanValue = false;
myFalseBooleanValue ==> false

> How to use String:

-jshell> String myString = "This is a string";
myString ==> "This is a string"

-jshell> myString = "I wish I had \u00241,000,000,00";
myString ==> "I wish I had $1,000,000,00"

> EXEMPLE for String:

---jshell> {
...> String numberString = "250.55";
...> numberString = numberString + "49.45";
...> System.out.print(numberString);
...> }
---250.5549.45

> anoter Exemple:

[[[jshell> double doubleNumber = 120.47; lastStrin = lastStrin + doubleNumber;
doubleNumber ==> 120.47
lastStrin ==> "1050120.47"]]]

<> ❗❗❗NOTE❗❗❗ when you want to write multiple statements in Jshell you can do it by separate them with ';', or by opening { ...code ... }

> ❗❗❗NOTE❗❗❗ A String + anything else, gives us a String as a result, concatenating anything after the String as text to the initial String

> [JAVA/DOCUMENTATION.IMAGES/Char.Variable.Methods.for.Values]/[JAVA/DOCUMENTATION.IMAGES/How.to.name.the.boolean.variables]/[JAVA/DOCUMENTATION.IMAGES/All.primitive.data]

                                                                    ❗❗❗ 🔗🔗[BOOLEAN & CHAR]🔗🔗 ❗❗❗

    ## ✅IV. -Operators, Operands and Expressions

> Exemple:

jshell> int result = 1 + 2; // 1 + 2 = 3
result ==> 3

jshell> int previousResult = result;
previousResult ==> 3

jshell> result = result -1; // 3 - 1 = 2
result ==> 2

jshell> System.out.print("previousResult = " + previousResult);
previousResult = 3

> How to concatenate variables to a String. How to concatenate char + char. ❗❗❗NOTE❗❗❗ when we want to concatenate 2 char's the values of the 'char' will be transformed in the 'uniCode', in our ex: A = 65, and B = 66;

jshell> char firstChar = 'A'; char secondChar = 'B';
firstChar ==> 'A'
secondChar ==> 'B'

jshell> System.out.print(firstChar + secondChar);
131

jshell> System.out.print("" + firstChar + secondChar);
AB

> ❗❗NOTE❗❗ all the values that are added with a String value get transformed in to Strings

> The Remainder Operator = how much from the right side Operator it fits inside of the left Operator and what is remain is the result

-jshell> result = result % 4; //the remainder of (5 % 3) = 1
result ==> 1

> How to take decimalls from an Abreviating Operator

jshell> {
...> int result = 10;
...> result-=5.5;
...> System.out.print("Result is " + result);
...> }
Result is 4 //this answer is not a decimal, because is an 'integer'
jshell>

jshell> {
...> double result = 10;
...> result-=5.5;
...> System.out.print("Result is " + result);
...> }
Result is 4.5 //here we obtaine a decimal by using the 'double' above

> The multiplier and the divider

jshell> {
...> double result = 10;
...> result\*=1.5;
...> System.out.print("Result is " + result);
...> }
Result is 15.0
jshell>

jshell> {
...> double result = 10;
...> result/=1.5;
...> System.out.print("Result is " + result);
...> }
Result is 6.666666666666667
jshell>

> [JAVA/DOCUMENTATION.IMAGES/The.Remainder.Operator]/[JAVA/DOCUMENTATION.IMAGES/The.abreviating.Operators]

                                                           ❗❗❗ 📬📬[OPERATORS, OPERANDS AND EXPRESSIONS]📬📬 ❗❗❗

    ## ✅V. -Logical Operators: Boolean values, && operators
            -Ternary Operators

[Hello.java]/[]

                                                           ❗❗❗ 🔬🔬[OPERATOR VALUES]🔬🔬 ❗❗❗

    ## ✅VI. -KeywordsAndExpressions === This is a new project, search on GIT-HUB:'KeywordsAndExpressions'

[Main.java]/[]

                                                           ❗❗❗ 🔐🔐[WORDS AND STATEMENTS]🔐🔐 ❗❗❗

    ## ✅VII. -Statements, Whitespace and Indentation (Code Organization) === This is a new project, search on GIT-HUB:"StatementsWhiteSpaceAndIndentin"

[Main.java]/[]

                                                                ❗❗❗ 🗿🗿[STATEMENTS]🗿🗿 ❗❗❗

    ## ✅VIII. -ofKeywordAndCodeBlock, === another project, search on Git-Hub by this name: "ofKeywordAndCodeBlock"
                -Methods

> How to not duplicate codes in java: we need to use/implement: METHODS


[Main.java]/[MainChallenge.java]

                                                              ❗❗❗ 🏢🏢[KEY-WORDS]🏢🏢 ❗❗❗

    ## ✅IX. -Methods

> If we want to create a Method/function that return something back, some value we neeed to write it like this ❗❗❗"public static int calculateMyAge(int dateOfBirth){ return (2023 - dateOfBirth);}"❗❗❗, we can't include the 'void' because the 'Methods' with 'void' included do not return values
> Check the file ❗❗❗'MainChallenge.java' to see the return Method 'public static int calculateScore (.....){...};'❗❗❗

[MainChallenge.java]/[]

                                                              ❗❗❗ 🌠🌠[METHODS]🌠🌠 ❗❗❗

    ## ✅X. -ORACLE CERTIFICATION 

-There are many shortcuts in JAVA like the Snippets in VsCode. Just look in the 'search LOOP' in the right up 👆 and type for 'tips'
-One tip that you can note is 'psvm', this will write a ['public class FOLDERNAME {...etc...}']

    ## ✅XI. -CHALLENGE.java 

[Challenge.java]

>How to use Methods, how to pass data between methods and call/summon other methods in your Maine method

    ## ✅XII. -More CHALLENGES:

1. Positive, negative or Zero : Write a method called checkNumber with an int parameter named number.
The method should not return any value, and it needs to print out:

    - "positive" if the parameter number is > 0

    - "negative" if the parameter number is < 0

    - "zero" if the parameter number is equal to 0

🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦
public class PositiveNegativeZero {
public static void main(String[] args) {
int number = 0;
checkNumber(number);
}
public static void checkNumber(int number) {
String resultText = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
System.out.println(resultText);
}
}
🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦🔦

2. How to create a Speed Converter: From Miles to Kilometers.
   
   -Check the file [speedConverterChallenge]

3. How to calculate the MegaBytes Converter. Remaining kiloBytes, etc 

   -Check the file [MegaBytesConverter.java]

4. How to create a Barking Dog application where we check if the dog is barking between different hours using boolean and integer hours

    -Check the file [BarkingDogChallenge.java]

5. Leap Year Calculator. How to calculate the remaining/remainder and also to check with multiple if-else statements

    -Check the file [LeapYearCalculator.java]

6. How to compare the first 3 decimals to see if they are equals

   -Check the file [DecimalComparator.java]

7. How to check if a number is between a specific range, let's say between 13 and 19

    -Check the file [TennNumberChecker.java]

8. How to convert from feet to inches and then centimenters

    -Check the file [Centimenters.java]

9. How to transform seconds to minutes and then to hours

    -Check the file [SecondsAndMinutes.java]

10. How to find out the Circle Area and the sides for a rectangle
      
    -Check the file [AreaCalculator.java]
>How to find out the PI. --- Math.PI

11. How to calculate the Minutes and the Years

    -Check the file [MinutesToYearsAndDaysCalculator.java]

12. How to use if, else-if in chalenge where we check if the value is true/false ad the temperature is between some parameters

    -Check the file [PlayingCat.java]


    ## ✅XIII. -NEW PROJECT MethodOverloading, Check on GIT-HUB: "MethodOverloading"

> How to set a method with multiple parameters

[Main.java]/[]

                                                                                 ❗❗❗ 🚇🚇[METHOD-OVERLOADING]🚇🚇 ❗❗❗



# 4. Control-Flow.-Switch: Search on GIT-HUB: Control-Flow.-Switch// FOR-WHILE-etc LOOP

    ## ✅I. -How to use the Switch statement

-In the Switch Statements we can only use: byte, shot, int, char, String and enum
-We can't use: long, float, double or boolean
[Main.java]/[]

                                                                                 ❗❗❗ 🍥🍥[SWITCH-STATEMENT]🍥🍥 ❗❗❗

    ## ✅II. -CHALLENGE, practice with the "switch" statement
              -How to use 'switch' statements in a method with no 'return'/void

[nasaChallenge.java]/[DayOfTheWeekChallenge.java]

              -How to use functions in the "switch"/case statements, Ternary Operators, how to call a method inside of another method, finding the number of days depending on the month and year

[NumberOfDaysInMonth.java]/[]

    ## ✅III. -Loop. While-Loop. 

-How to automatically calculate the percentage using the LOOP
-How to increase the index, "i" with a specific amount for every loop

[TheForLoop.java]/[]
                         
                                                        ❗❗❗ 🔎🔎[FOR-LOOP-WHILE.LOOP]🔎🔎 ❗❗❗

    ## ✅IV. -ThePrimeNumberChallenge. Using the Loop statement

-How to find out how many PRIME numbers are by using a LOOP statement.
-How to use the For LOOP

[ThePrimeNumberChallenge.java]

    ## ✅V. -Challenge. How to use FOR loop to find out the numbers 3 and 5
            -How to find the divided numbers by both 3 and 5
            -How to use the DEGUBBER in the InteliJ
            -To see how to use the Debugger go and check the Section 6, ControlFlow, Lesson: Sum 3 and 5 Challenge and Using IntelliJ's Debugger
            
            -SumOdd, how to find out the our numbers using the FOR Loop, odd/impar

//=====================
Sum 3 and 5 Challenge
=====================

*Create a for loop using a range of numbers from 1 to 1000 inclusive.

*Sum all the numbers that can be divided by both 3 and 5

*Print out the numbers that have met the above conditions

*break out of the loop once you have found 5 numbers that met the conditions.

*After breaking out of the loop, print the sum of the numbers that met the conditions.

*Note: type all code in the main method


[Sum3And5Challenge.java]/[SummOdd.java]

                                                        ❗❗❗ 🔎🔎[CHALLENGE]🔎🔎 ❗❗❗

    ## ✅VI. -WHILE LOOPS

-WHILE: Continue executing code block until the loop expression becomes false.
-DO WHILE: Execute the code block once, then continue executing until the loop condition becomes false

=The difference between the normal LOOP and the WHILE loop is this:
            -normal LOOP: for(init, expression, increment){...}
            -while LOOP: while(expression){...}
            -do while LOOP: do { ... } while (expression);
❕❕❕❕❕❕❕❗❗❗❗❗NOTE ... the "do WHILE LOOP" is very good to use when we want to create the logic for a password, because we run for the first time, and the user typed it wrong, and we want to ask him again until a certain amount of times that we specifie, 3 or 5 times, etc. ❗❗❗❗❗❗❗❕❕❕❕❕❕❕

-How to skip conditions with WHILE LOOP, check [WhileLoopExemple.java]

-How to skip and display some values, let's say the even numbers in a range of array numbers [WhileLoopChallenge.java]

-How to find out the last digit/number in a whole number and how to sum those numbers after we separate them, for ex: 123, last numbers 1 - 2 - 3, sum: 6. [DigitSumChallenge.java]

-Loop theory: FOR loop & WHILE loop: search for IMG "[The While Statement]" in folder "documentation IMAGES" from "JAVA" folder

-How to use CONTINUE and BREAK in a WHILE loop, a very complex and good exemple: [Continue and Beak in a WHILE loop], in folder "documentation IMAGES" from "JAVA" folder

-How to find out if a number is Palindrome or not, how to take numbers from both right and left and compare the final number [NumberPalindrome.java]

-How to find out the first & last digit and sum them [FirstLastDigitSum.java]. how to extract the first digit, the logic behind

-How to find out the Even Digit numbers and sum/calculate the total of them  using a LOOP. Even number = divisible numbers with 2. === how to check if a number is even or not using an IF statement, and then using a WHILE LOOP to destructuring the number  ===== HOW TO implement this method of 
finding the even numbers and sum them by using the normal "FOR" LOOP: FOR(int i = number, i > 0, i /= 10){ ... }, etc [EvenDigitSum.java]

-How to find out if in two numbers we have an equal digit, for ex: number1 = 235, number2 = 361, ===> equalNumber = 3; === also how to use variables to store data and boolean values .[SharedDigit.java]

-How to extract the last digit from a number and compare 3 last digit numbers to see if 2 of those digits are equal. There are 2 solutions, check for both of them, the second one is cleaner and straight to the point[LastDigitChecker.java]

-How to find out the Greatest common divisor inside 2 numbers. Meaning we create a LOOP that will extract all the divisors from our 2 numbers and compare them to find if there are 1 divisor equal in both of the numbers [GreatestCommonDivisor.java]

-How to find out the perfect number. Meaning that we must find the perfect dividers of a number and, if the sum of those dividers is equal with the number itself than this is a perfect number. [PerfectNumber.java]

-FizzBuzz Challenge [FizzBuzz.java]

-How to convert numbers to words, how to return values in revers, how to count numbers, digit count [NumberToWords.java]

-How to use IF ELSE statement, multiple IF statement, IF inside another IF statement, how to declare a variable outside of the method. How to find if 2 values are equals with a total sum, and how to check if they are greater, lower or equal and return true or false depending on some 
specifications [FourPacker.java] ... very good exemple for IF - IF ELSE

-How to find out the largest prime from a number [LargestPrime.java]

-How to parse values and read input using System.console(), how to transform String to numbers/values... How to convert Double Strings to double numbers/values ... How to use "Scanner", how to get Input from Console ... How to use "try" and "catch" method... How to use the Scanner method 
[StringToNumber.java] ... to convert input text, String to numbers we need to use: "Integer.parseInt(variable name)" ... ❗❗❗ How to set parameters that will check the year to not be greater than the current year, and the years of the user to not be greater than 120 (assuming this is  the oldest 
person), also check if there are some negative numbers/years  [🔰🔰[YEAR SETTINGS]🔰🔰] ... /// ❗❗❗ How to check for bad data, bad numbers, wrong years, numbers with letters, etc. ex: BirthOfYear: 199r [📛📛], correct is: 1993 [💚]
-How to check if the user enters characters/letters in the number: [StringToNumber.java]. [🔰🔰[YEAR SETTINGS]🔰🔰]]. Lessons [70-71-72]

-CHALLENGE, how to read the input from the User, how to store more numbers from the user and at the end displaying the sum of those numbers // also let's see how to finish this CHALLENGE by also accepting "double" numbers from the user, not only Integers, whole numbers

-How to take data from the Input user, how to take data from the user ... We must use: "Scanner" este o clasă din Java care este folosită pentru a obține input de la utilizator prin consolă sau din alte surse. and "System.in"

-How to access the code when using the "System.console().readLine()", type in the Terminal: java src/name of the file. Then will display you text from the console and the "println" if there is one

-How to use Scanner, how to use scanner and taking info/values from the Input User, and how to use Scanner by taking data from some files. Check the IMG from folder: 'documentation IMAGES [Instantiating Scanner]' ... to see in practice check the file project [StringToNumber.java] ... how to use 
System.in and System.out with scanner

-How to take data from the input User, how to store that data, how to calculate the sum of multiple numbers that the user entered, how to check if there is a typo/wrong number. How to check the MIN and MAX number in a LOOP where the user entered/INPUT some values [MinMaxChallenge.java]

-How to calculate the sum from multiple numbers that the user typed and than calculate the average of those numbers[InputCalculator.java]

-How to create an infinite loop/endless loop [MinMaxChallenge.java]/[InputCalculator.java]

-How to create a calculator that will calculate the area of a wall, for ex: height, width, totalArea and bucketsOfPaint. This calculator need to result the numbers of buckets to paint a wall [PaintJobChallenge.java]/[last exercise from section 6]

[WhileDoWhileLoops.java]/[WhileLoopExemple.java]/[WhileLoopChallenge.java]/[DigitSumChallenge.java]

                                                        ❗❗❗ 🥃🥃[WHILE-LOOPS]🥃🥃 ❗❗❗
        
    

# 5. OBJECT ORIENTED PROGRAMING - OOP --- on Git-Hub (Object Oriented Programing - OOP)

    ## ✅I. - Introduction to Classes and Objects 
            - How to implement Encapsulation
            - How to create Encapsulation and call it in another file
            - How to use the "this" key word [Car.java] 🔑


                                                        ❗❗❗ 🚗🚗[ENCAPSULATION]🚗🚗 ❗❗❗

------- ❗❗❗❗❗ CHALLENGE ❗❗❗❗❗ -------BankAccount === on Git-Hub => Classes-Challenge -------
-How to create logic for depositing funds in a back account [BankAccount.java]/[Main.java]
-How to create the logic for withdrawal funds from bank account [BankAccount.java]/[Main.java]


[Lesson 75]/[Car.java]/[Main.java]

    ## ✅II. - How to use the CONSTRUCTOR 
             - How to call a CONSTRUCTOR from another CONSTRUCTOR
             - How to create a Constructor using shortcuts in IntelliJ. Go to: Menu, Generate, Constructor, and select what you need
             - How to auto create a Constructor: Menu, Generate, Constructor, and select what you need

             -CHALLENGE [ConstructorChallenge.java]
             - More detailed about CONSTRUCTORS and how to use them [House.java]

ex: public class Account { // this is the class declaration
            public Account (){ // this is the constructor declaration
                // Constructor code is code to be executed as the object is created
            }
    }

[BankAccount.java]/[Main.java]/[House.java]/[ConstructorChallenge.java]

                                                        ❗❗❗ 🚧🚧[CONSTRUCTOR]🚧🚧 ❗❗❗

    ## ✅III. - How to use the POJO class /// POJO is a class that contains data, and those data can be altered if need it
             - How to implement the "switch" case in a LOOP
             -How to use "toString()" method from IntelliJ
             -How to implement "@Override" method automatically from IntelliJ
             -How to read files with POJO using "toString()" method


[Student.java]/[Main.java]

                                                        ❗❗❗ 🐎🐎[POJO CLASS]🐎🐎 ❗❗❗

    ## ✅IV. -RECORD method //// is a special class that contains data, that's not meant to be altered ///// It contains only the most fundamental methods, such as constructors and accessors///// as a developer you don't have to write or generate any of this code
             -How to use/implement RECORD method
             -To create a "RECORD" file we need to normally create a new file for our PROJECT, but this time we must select the "Record" instead of "Class"
             -CHALLENGES & EXERCISE with RECORD & CONSTRUCTOR [lessons 88 -> (ex 32,33,34,35)]


[Main.java]/[LPAStudent.java]

                                                        ❗❗❗ 🐕🐕[RECORD CLASS]🐕🐕 ❗❗❗




# 6. -INHERITANCE === on Git-Hub => "INHERITANCE JAVA" 

    ## ✅I. -How to use INHERITANCE
             -How to create multiple child class, ex: paren[Animal], childs: [Dog],[Fish] files
            -How to pass data from parent to child/// how to pass data from a file to another
            -How to use "extends" //// this is a "superclass"(or the parent class), of the class we're declaring. We can say "Dog" is a subclass, or child class, of Animal, and 'Animal' is a parent, or super class, of "Dog"
             -How to overrid methods (a method written in a subclass, wich has the same signature as a method on s super class will override the method from the super/parent class) ❗ === you override a parent class method, when you want the child class to show different behavior for that 
-method=== ❗❗❗ we can also override methods auto using IntelliJ [menu, code, overrideMethods ...] 
-Override method """ 1. It can implement completely different behavior, overriding the behavior of the parent """
-Override method """ 2. It can simply call the parent class's method, which is somewhat redundant to do """
-Override method """ 3. Or the method can call the parent class's method, and include other code to run, so it can extend the functionality for the Dog, for that behavior """

-using "protected" instead of "private" when calling attributes, encapsulation we let the child files to connect and make changes to the parent attribute

[Main.java]/[Animal.java]/[Dog.java]



                                                        ❗❗❗ 🏭🏭[INHERITANCE]🏭🏭 ❗❗❗

    ## ✅II. ----CHALLENGE with Inheritance----
             -How to extract a specific number, for ex. how to extract the year from a string of numbers: [int birthYear = Integer.parseInt(birthDate.substring(6));]... the numbering starts by default from 0 base and we must count also the symbols "/", so extraction starts from the first "Y" for YEAR
                
              -How to create a static ID, How to create an auto ID, ID creation automatically [Employee.java] 🆔🆔🆔🆔
              -Details about Inheritance: [IMAGES documentation] / Inheritance 1 (CHALLENGE) IMG

[Main.java]/[Worker.java]/[Employee.java]/[SalariedEmployee.java]/[HourlyEmployee.java]/[IMAGES documentation]

    ## ✅III. -How to use: this vs super ==== THEORY

-The keyword Super is used to access or call the parent class members (variables and methods)
-The keyword THIS is used to call the current class members (variables and methods).
-THIS is required, when we have a parameter with the same name, as an instance variable or field.
NOTE!!!!: We can use either of them anywhere in a class, except for static elements, like a static method. Any attempt to do so there, will lead to compile time errors.

THIS keyword EXEMPLE: [documentation IMAGES]/(THIS keyword) IMG
SUPER keyword EXEMPLE: [documentation Images]/(SUPER keyword) IMG

    ## ✅IV. this() vs super() ==== THEORY

-----------**THIS()-THIS()-THIS()-THIS()**

-In Java we've got the THIS() and SUPER() call. Notice the parentheses. 
-These are known as calls, since it looks like a regular method call, although we're calling certain constructors
-Use THIS() to call a constructor, from another overloaded constructor in the same class.
-The call to THIS() can only be used in a constructor, and it must be the first statement in a constructor.
-It's used with the constructor chaining, in other words when one constructor calls another constructor , and it helps to reduce duplicated code.

------------**SUPER()-SUPER()-SUPER()-SUPER()**
[documentation IMAGES]/(Super() Example) IMG

-The only way to call a parent constructor, is by calling SUPER(), which calls the parent constructor.
-The Java compiler puts a default call to SUPER(), if we don't add it, and it's always a call to the no argument constructor, which is inserted by the compiler
-The call to SUPER() must be the first statement in each constructor
-A constructor can have a call to SUPER() or THIS(), but never both.

===========  **CONSTRUCTOR Exemple** ===================

[documentation IMAGES]/(Constructor BAD and GOOD example)  IMG
class Rectangle{
    
    private int x;
    private int y;
    private int width;
    private int height;

// 1st constructor
public Rectangle(){
    this(0, 0);// calls 2nd constructor
}

// 2nd constructor
public Rectangle(int width, int height){
    this(0, 0, width, height); // calls 3rd constructor
}

// 3rd constructor
public Rectangle(int x, int y, int width, int height){
//initialize variables
this.x = x;
this.y = y;
this.width = width;
this.height = height;
} } 
///// putem alege să specificăm doar dimensiunile sau să specificăm și poziția în funcție de nevoile noastre. /////

    ## ✅V. Method Overloading vs Method Overriding ===== THEORY

-----------**Method Overloading** --------

-_Method overloading_ means providing two or more separate methods, in a class, with the same name, but different parameters
-Method return type may or may not be different, and that allows us to reuse the same method name
-Overloading is very handy, it reduces duplicated code, and we don't have to remember multiple method names
-We can overload static, or instance methods.
-To the code calling an overloaded method, it looks like a single method can be called, with different sets of arguments
-Java developers often refer to method overloading, as compile-time polymorphism

>Methods will be considered overloaded if both methods follow the following rules:
1. Methods must have the same method name.
2. Methods must have different parameters

>If methods follow the rules above:
1. They may or may not have different return types.
2. They may or may not have different access modifiers.
3. They may or may not throw different checked or unchecked exceptions.

-----------**Method Overriding** --------

-Method overriding, means defining a method in a child class, that already exists in the parent class, with the same signature (the same name, same arguments).
-By extending the parent class, the child class gets all the methods defined in the parent class (those methods are also known as derived methods).
-Method overriding is also known as Runtime Polymorphism, or Dynamic Method Dispatch, because the method that is going to be called, is decided at tuntime, by the Java virtual machine 

-When we OVERRIDE a method, it's recommended to put "@Override", immediately above the method definition
-The "@Override" statement is not required, but it's a way to get the compiler to flag an error, if you don't actually properly override this method
-We'll get an error, if we don't follow the overriding rules correctly
-We can't override static methods, only instance methods can be overridden

>A method will be considered overridden, if we follow these rules.
1. It must have the same name and same arguments
2. The return type can be a subclass of the return type in the parent class
3. It can't have a lower access modifier. In other words, it can;t have more restrictive access privileges
4. For example, if the parent's method is protected, then using private in the child's overridden method is not allowed. However, using public for the child's method would be allowed, in this example.
5. Only INHERITED METHODS can be overridden, in other words, methods can be overridden only in child classes.
6. Constructors and private methods cannot be overridden
7. Methods that are final cannot be overridden

-Method Overriding VS Overloading ------IMG [documentation IMAGES] (method Overriding vs Overloading) IMG

    ## ✅VI. -What is Text Block and other Formatting Options
             -String Formatting
             -How to format the lines
             -Common Escape Sequences
             -How to separate lines/ how to insert a tab character/ how to insert a new line character
             -How to insert a double quote character
             -How to insert a backslash character
             -How to insert arguments with character/replacing characters with values
             -How to use "System.out.printf"
             -Another look at the String

-At their most complex, format specifiers take the form shown here.
- %[argument_index$] [flags] [width] [.precision] conversion
- They start with a percent sign, and end with a conversion symbol, and have lots of options in between
- Conversion type, d, is the symbol used for decimal integer value

1. \t -> Insert a tab character. --- normal TAB space
2. \n -> Insert a new line character. --- starting from a new line
3. \" -> Insert a double quote character. --- insert "
4. \\ -> Insert a backslash character. --- insert this "\"

                        ❗❗❗❗ 🦓🦓[FORMATTING STRING]🦓🦓 ❗❗❗

-We can split String's methods up into three basic categories:
1. String Inspection Methods
2. Methods for Comparing String values
3. String Manipulation Methods

-String Inspection Methods [documentation IMAGES] (String Inspection) IMG

                        ❗❗❗❗ 🪕🪕[PRINT INFORMATIONS]🪕🪕 ❗❗❗

-If you want to learn about String methods and manipulation STRING, check the Lessons [97-98-99]

[StringFormatting.java]/[Main.java]


# 7. Polymorphism - OOP --- on GitHub: "Polymorphism - OOP" ---- INHERITANCE

    ## ✅I. -Composition
             -INHERITANCE vs COMPOSITION [documentation IMAGES](INHERITANCE vs COMPOSITION) IMG ... VERY GOOD Example

-În general, moștenirea este utilizată atunci când există o relație "este un" între două clase (de exemplu, un câine "este un" mamifer), în timp ce compoziția este utilizată atunci când există o relație "are un" (de exemplu, o mașină "are un" motor). Alegerea între moștenire și compoziție depinde de structura și logica specifică a aplicației și de relațiile definite între obiectele implicate.
-Here we want to create a COMPUTER, and we need to put together multiple pieces 

-Example diagram with INHERITANCE vs COMPOSITION [documentation IMAGES]/(INHERITANCE vs COMPOSITION diagram) IMG

                                ❗❗❗❗ 🪕🪕[PRINT INFORMATIONS]🪕🪕 ❗❗❗

[Main.java]/[Product.java]/[PersonalComputer.java]

    ## ✅II. -CHALLENGE (INHERITANCE vs COMPOSITION) ----> Smart Kitchen

-How to connect multiple parts in a more complex sistem

[Main.java]/[SmartKitchen.java]/[]

    ## ✅III. -Encapsulation
              -The method ENCAPSULATION always need to have attributes sett to "private"
              -How to REFACTOR a class name: right-click on the name, refactor, rename

1. We protect the members of the class, and some methods, from external access
2. This prevents calling code from bypassing the rules and constraints, we've built into the class
3. When we create a new instance, it's initialized with valid data
4. But likewise, we're also making sure that there's no direct access to the fields
5. That's why you want to always use encapsulation
6. It's something that you should really get used to

-How to create a player game with (health, damage and weapon)
-With ENCAPSULATION we don't allow direct access to data on an object, can bypass checks and operations
-It encourages an interdependency, or coupling, between the calling code and the class
-If we are not using ENCAPSULATION when we change a field name, the entire code will break
-The good code ENCAPSULATION  💊💊 [ENCAPSULATION] 💊💊 is in the [EnhancedPlayer.java] file


                                ❗❗❗❗ 💊💊 [ENCAPSULATION] 💊💊 ❗❗❗

[Main.java]/[Player.java]/[EnhancedPlayer.java]

    ## ✅IV. -CHALLENGE => ENCAPSULATION

[Printer.java]/[Main.java]                                        

    ## ✅V. -Polymorphism
             -How to use Polymorphism to create a dynamic list of movies
            -How to use INHERITANCE to support POLYMORPHISM
            -How to create a dynamic search selection
            -How to select diferit categories depending on the first letter
            -How to take data from the INPUT user and store/use this data [Scanner(System.in)][Main.java]
            -How to create a complex dynamic searching computer for movies, the user enters a type and a title and the console will display those results
            -Here we can create/add as many parts of movies as we want and the code from [Main.java] will remain the same, we can create new contents/categories and the code will automatically inherit those 
            -CHALLENGE --- (lesson: 111, 112, 113)

-Polymorphism lets us write code to call a method, but at runtime, this method's behavior can be different, for different objects
-The declared type has to have some kind of relationship to the runtime type, and INHERITANCE is one way to establish this relationship

                                ❗❗❗❗ 🎣🎣 [POLYMORPHISM] 🎣🎣 ❗❗❗

[Main.java]/[Polymorphism.java]/[NextMain.java]

    ## ✅VI. -Casting with classes, and using Object and var references

                                ❗❗❗❗ 🦞🦞 [CASTING-CLASSES] 🦞🦞 ❗❗❗

[Main.java]/[Polymorphism.java]

## ✅VII. -The "instanceOf" operator --- (lesson: 110. Testing the runtime type using the instanceof operator)
-Very complex CHALLENGE with OOP --- (lesson: 113, 114, 115. OOP Master Challenge Ex: 1, 2, bonus).



# 8. - Arrays

    ## ✅I. -How to use Arrays
            -What are Arrays

-in this case integer will have 10 elements 👇
-int[] integerArray = new int[10];
-You can't change the size of an array, after the array is instantiated
-We can't add or delete elements, we can only assign values to one of the ten elements in this array, in this example. 👆

[Main.java]/[]

                                ❗❗❗ 🛬🛬 [Arrays] 🛬🛬 ❗❗❗

    ## ✅II. -The array initializer as an anonymous array
              -How to extract numbers/names/etc from an array at a certain position
              -How to create a LOOP inside of an Array
              -How to initialiate an Array value.length in reverse without numbering the values ourselves
              -How to initialiate a Enhanced For Loop
              -How to print your Array inside of bracket and separate by comma: [ , , , ]

-Java allows us to drop "new int[]", from the expression, as we show here
-This is known as an anonymous array
-Her we're showing the examples for both an int array, as well as a String array
--- int[] firstFivePositives = {1, 2, 3, 4, 5};
--- String[] names = {"Andy", "Charlie", "David", "Eve",}

[Main.java]/[]

                                 ❗❗❗ 🛬🛬 [Arrays] 🛬🛬 ❗❗❗

    ## ✅III. -Using java.util.Arrays (sort, fill, copyOf)
              -How to use multiple methods for Array
              -How to use "java.util." libraries
              -How to obtain random numbers, multiple random numbers from a bigger number, for ex: 10 numbers from a length like [0 to 100]
              -How to sort numbers from an Array or from any place
              -How to sort elements/numbers/etc
              -How to mutate and make all the elements the same in an Array
              -How to create a copy Array, creating a copy for an Array
              -How to print only a certain length of numbers from an Array

-Random(); "is another class in the java.util library, that can be vert useful"

[Main.java]/[]

                            ❗❗❗ 📲📲 [Arrays.sort.fill.copyOf] 📲📲 ❗❗❗

    ## ✅IV. -How to search in Arrays
             -How to find an element/number/name/etc inside of an Array
              -Finding a Match, Using a Binary Search and testing equality of arrays
             -How to find out 2 identycal elements in different Array's
             -How to find 2 equals elements/values in 2 different Array's
             -How to sort the numbers in reverse

-asd

[Main.java]/[]

                            ❗❗❗ 🔎🔎 [BINARY SEARCH] 🔎🔎 ❗❗❗

    ## ✅V. -CHALLENGES: Arrays: 

[Lesson: 126 (Minimum Element Challenge)]/[Lesson: 127 (Reverse Array Challenge)]/[Lesson: 128 (Two Dimensional Array)]/[Lesson: 129 (Multi-dimensional Arrays)]

    ## ✅VI. -Replacing the Array in the method with 3 dots
             -Varargs
             -Different method and different process
             -How to SPLIT all the words in a String
             -How to SPLIT words from a sentence depending by what we choose, space, a letter, symbol, etc ...
             -How to use method "Repeat" ... "...".repeat( 20);
             -How to add automatically elements in a String, comma, brackets, etc using the ".join" mehtod

- public static void main(String[] args){ ... normal method ...}

- public static void main(String ... args){ ... dots method ...}

1. This is a special designation for Java, that means, Java will take zero, one, or many Strings, as arguments to this method, and create an array with wich to process them, in the method
2. The array will be called args, and be of type String
3. The difference is minor within the method body, but significant to the code that calls the method.
4. []: Aceasta indică un vector (array) de argumente. În cazul metodei main, String[] args înseamnă că metoda primește un vector de obiecte de tipul String ca argument.
   ...: Acesta este denumit și varargs (variadic arguments) și permite metodei să primească un număr variabil de argumente de același tip. De exemplu, dacă aveți o metodă public void exampleMethod(int... numbers), puteți apela această metodă cu un număr variabil de argumente întregi: exampleMethod(1, 2, 3) sau exampleMethod(1, 2, 3, 4, 5).
5. There can be only one variable argument in a method
6. The variable argument must be the last argument

[AnotherMain.java]

                            ❗❗❗ 🔯🔯 [3 DOTS METHOD] 🔯🔯 ❗❗❗

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 9. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 10. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 11. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 12. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 13. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 14. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 15. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 16. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

# 17. Titlu

    ## ✅I. subtitlu

    ## ✅II. subtitlu

    ## ✅III. subtitlu

    ## ✅IV. subtitlu

    ## ✅V. subtitlu

    ## ✅VI. subtitlu

    ## ✅VII. subtitlu

    ## ✅VIII. subtitlu

    ## ✅IX. subtitlu

    ## ✅X. subtitlu

    ## ✅XI. subtitlu

    ## ✅XII. subtitlu

    ## ✅XIII. subtitlu

    ## ✅XIV. subtitlu

    ## ✅XV. subtitlu

    ## ✅XVI. subtitlu

    ## ✅XVII. subtitlu

    ## ✅XVIII. subtitlu

    ## ✅XIX. subtitlu

    ## ✅XX. subtitlu

    ## ✅XXI. subtitlu
    ## ✅XXII. subtitlu
    ## ✅XXIII. subtitlu
    ## ✅XXIV. subtitlu
    ## ✅XXV. subtitlu
    ## ✅XXVI. subtitlu
    ## ✅XXVII. subtitlu
    ## ✅XXVIII. subtitlu
    ## ✅XXIX. subtitlu
    ## ✅XXX. subtitlu
    ## ✅XXXI. subtitlu
    ## ✅XXXII. subtitlu
    ## ✅XXXIII. subtitlu
    ## ✅XXXIV. subtitlu
    ## ✅XXXV. subtitlu
    ## ✅XXXVI. subtitlu
    ## ✅XXXVII. subtitlu
    ## ✅XXXVIII. subtitlu
    ## ✅XXXIX. subtitlu
    ## ✅XL. subtitlu
