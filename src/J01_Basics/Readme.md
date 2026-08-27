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