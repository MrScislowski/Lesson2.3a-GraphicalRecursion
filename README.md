# Lesson 2.3b - Graphical Recursion

## HTree

Write a class `HTree` with a method
```
public static void draw(int n, double length, double x, double y)
```
that will draw an "H" shape centered at (`x`, `y`) with length `length`. It should also recursively draw `n-1` smaller "H" shapes centered at the four corners of the larger "H", and with half the length.

```
draw(1, 0.5, 0.5, 0.5);
```
<img src="./img/1H.png" width="100" height="100" />

```
draw(2, 0.5, 0.5, 0.5);
```
<img src="./img/2H.png" width="100" height="100" />

```
draw(3, 0.5, 0.5, 0.5);
```
<img src="./img/3H.png" width="100" height="100" />

```
draw(4, 0.5, 0.5, 0.5);
```
<img src="./img/4H.png" width="100" height="100" />

## RecursiveSquares

Write a class `RecursiveSquares` with a method

```
public static void draw(int n, double x, double y, double length)
```
that draws the recursive square pattern of order `n`, centered on (`x`, `y`) of side length `length`. 

```
draw(1, 0.5, 0.5, 0.5);
```
<img src="./img/1Square.png" width="100" height="100" />

```
draw(2, 0.5, 0.5, 0.5);
```
<img src="./img/2Square.png" width="100" height="100" />

```
draw(3, 0.5, 0.5, 0.5);
```
<img src="./img/3Square.png" width="100" height="100" />

## Tree

Write a class `Tree` that makes drawings of trees with different levels of recursion. Try to reproduce Bob Sedgwick's images:

<img src="./img/SedgwickTrees.png" width="500" height="100" />

The best I could do are shown here:

<img src="./img/MyTrees.png" width="500" height="100" />