Operator 
An operator is a symbol that tells Java to perform a specific operation.

operands - An operator is a special symbol that performs a specific
operation on one or more operands and produces a result.

Example - Example:

10 + 5
  + → Operator
  10 and 5 → Operands
  15 → Result

1. Unary Operator

Works on one operand.

age++;
Operator: ++
Operand: age
2. Binary Operator

Works on two operands.

a + b
Operator: +
Operands: a, b

            ARITHMETIC OPERATOR

1. Arithmetic Operators and Numeric Expressions

In Java, the primary binary arithmetic operators are:

Operator	Operation
+	Addition
-	Subtraction
*	Multiplication
 /	Division
%	Remainder

Q1. What are arithmetic operators?

Answer:

Arithmetic operators are operators used to perform mathematical operations such as addition, subtraction, multiplication,
division, and finding the remainder.

| Operand 1 | Operand 2 | Result Type |
| --------- | --------- | ----------- |
| `byte`    | `byte`    | `int`       |
| `byte`    | `short`   | `int`       |
| `short`   | `short`   | `int`       |
| `char`    | `char`    | `int`       |
| `int`     | `int`     | `int`       |
| `int`     | `long`    | `long`      |
| `int`     | `float`   | `float`     |
| `int`     | `double`  | `double`    |
| `long`    | `float`   | `float`     |
| `long`    | `double`  | `double`    |
| `float`   | `double`  | `double`    |


Increment and Decrement Operators in Java
🗺️ Big Picture

These operators change a variable's value by exactly 1.

There are four forms:

++x   // Pre-increment
x++   // Post-increment

--x   // Pre-decrement
x--   // Post-decrement


1. Increment Operator ++
   Definition

The increment operator ++ increases the value of a variable by 1.

Example:

int x = 10;

x++;

After this:

x = 11

2. Decrement Operator --
   Definition

The decrement operator -- decreases the value of a variable by 1.

Example:

int x = 10;

x--;

Now:

x = 9

It is equivalent to:

x = x - 1;

The Easiest Comparison
Code	Meaning	Final x	y
y = x++	Use, then increment	11	10
y = ++x	Increment, then use	11	11

So remember:

Postfix = use first, change later.
Prefix = change first, use later.



BITWISE OPERATORS

Bitwise Operators in Java
🗺️ Big-Picture Overview

Bitwise operators perform operations on the individual binary bits of numbers.

You know that computers internally store integers in binary:

5  = 0101
3  = 0011

A bitwise operator compares the bits position by position.

The main bitwise operators are:

&    Bitwise AND
|    Bitwise OR
^    Bitwise XOR
~    Bitwise NOT

We'll also briefly distinguish these from logical operators because:

&
|

can be confusing when compared with:

&&
||

2. Bitwise AND &
   Definition

The bitwise AND operator compares corresponding bits of two numbers and produces 1 only when both bits are 1.

| A | B | A & B |
| - | - | ----- |
| 0 | 0 | 0     |
| 0 | 1 | 0     |
| 1 | 0 | 0     |
| 1 | 1 | 1     |


3. Bitwise OR |
   Definition

The bitwise OR operator compares corresponding bits and produces 1 when at least one of the bits is 1.

Truth table:

A	B	A | B
0	0	0
0	1	1
1	0	1
1	1	1
Example
int a = 5;
int b = 3;

System.out.println(a | b);

Binary:

5 = 0101
3 = 0011
----
| = 0111

0111 is:

7

4. Bitwise XOR ^

XOR means Exclusive OR.

Definition

The bitwise XOR operator produces 1 when the two corresponding bits are different.

Truth table:

A	B	A ^ B
0	0	0
0	1	1
1	0	1
1	1	0

The easiest rule:

Same → 0, Different → 1

5. Bitwise NOT ~

This operator works on one operand, so it is a unary operator.

Definition

The bitwise NOT operator reverses every bit: 0 becomes 1, and 1 becomes 0.

Example conceptually:

0101

After NOT:

1010



6. All Four Operators Together

Using:

a = 5 = 0101
b = 3 = 0011
Operator	Binary Result	Decimal Result
a & b	0001	1
a | b	0111	7
a ^ b	0110	6
~a	32-bit complement	-6


LOGICAL OPERATORS-:

Logical Operators in Java
🗺️ Big-Picture Overview

Logical operators are used to combine, reverse, or evaluate boolean conditions.

They work with:

true
false

The three main logical operators are:

&&    Logical AND
||    Logical OR
!     Logical NOT

For example:

int age = 20;
boolean hasID = true;

boolean allowed = age >= 18 && hasID;

Here, Java asks:

Is the person 18 or older AND does the person have an ID?


1. Logical AND &&
   Definition

The logical AND operator && returns true only when both conditions are true.

int age = 20;
boolean hasID = true;

System.out.println(age >= 18 && hasID);
age >= 18
20 >= 18
true

2. Logical OR ||
   Definition

The logical OR operator || returns true when at least one condition is true.
Example
int marks = 85;
boolean sportsQuota = false;

boolean selected = marks >= 90 || sportsQuota;

System.out.println(selected);

Let's solve:

marks >= 90
85 >= 90
false

3. Logical NOT !
   Definition

The logical NOT operator ! reverses a boolean value.

true  → false
false → true
Example
boolean isRaining = true;

System.out.println(!isRaining);

Output:

false

7. Difference Between && and &

You recently studied bitwise operators, so this is important.

&&

is the logical AND operator with short-circuit evaluation.

&

can be used with booleans too, but both sides are always evaluated.

Example:

boolean result = false && someMethod();

someMethod() is not called.

But:

boolean result = false & someMethod();

someMethod() is called.

Similarly:

true || someMethod()

may skip someMethod().

But:

true | someMethod()

still evaluates both sides.
