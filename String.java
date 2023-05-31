
// Abstraction Method
/*
 * abstract class Abstraction {
ccbstract void Function();
 * 
 * }
 * 
 * class Test extends Abstraction {
 * void Function() {
 * System.out.println("Hello its me Ishan");
 * }
 * 
 * public static void main(String[] args) {
 * Abstraction a = new Test();
 * a.Function();
 * }
 * 
 * }
 */

/*
 * abstract class Bank {
 * abstract int getRateOfinterest();
 * }
 * 
 * class A extends Bank {
 * int getRateOfinterest() {
 * return 2;
 * }
 * }
 * 
 * class B extends Bank {
 * int getRateofinterest() {
 * return 3;
 * }
 * 
 * @Override
 * int getRateOfinterest() {
 * 
 * return 0;
 * }
 * 
 * }
 * 
 * class Test {
 * public static void main(String[] args) {
 * Bank b;
 * b = new A();
 * System.out.println("Rate of the interest is" + b.getRateOfinterest());
 * b = new B();
 * System.out.println("Rate of the interest is" + b.getRateOfinterest());
 * }
 * 
 * }
 */

/*
 * 
 * abstract class Shape {
 * abstract void draw();
 * }
 * 
 * class Rectangle extends Shape {
 * void draw() {
 * System.out.println("Rectangle");
 * }
 * }
 * 
 * class Circle extends Shape {
 * void draw() {
 * System.out.println("Circle");
 * }
 * }
 * 
 * class Test {
 * public static void main(String[] args) {
 * Shape s1, s2;
 * s1 = new Circle();
 * s2 = new Rectangle();
 * s1.draw();
 * s2.draw();
 * 
 * }
 * }
 */
// Interface class
/*
 * interface Abstraction {
 * 
 * void a();
 * 
 * void b();
 * 
 * void c();
 * 
 * void d();
 * 
 * }
 * 
 * abstract class A implements Abstraction {
 * public void c() {
 * System.out.println(" I am c");
 * }
 * }
 * 
 * class M extends A {
 * public void a() {
 * System.out.println("i am a");
 * }
 * 
 * public void b() {
 * System.out.println("i am b");
 * }
 * 
 * public void d() {
 * System.out.println("i am d");
 * }
 * 
 * }
 * 
 * class Test {
 * public static void main(String[] args) {
 * Abstraction a = new M();
 * a.a();
 * a.b();
 * a.c();
 * a.d();
 * 
 * }
 * }
 */

// Interface abstraction case
/*
 * interface Drawable {
 * 
 * static final int a = 0;
 * 
 * void draw();
 * 
 * static int cube(int x) {
 * return x * x * x;
 * }
 * 
 * static int Number(int a) {
 * return a;
 * }
 * 
 * // In interface,we should write default otherwise nothing in the replace of
 * the
 * // default
 * public default int getName() {
 * 
 * return Drawable.a;
 * }
 * 
 * public default int setName(int a) {
 * return Drawable.a;
 * }
 * 
 * }
 * 
 * class Rectangle implements Drawable {
 * public void draw() {
 * System.out.println("Drawing Rectangle");
 * }
 * 
 * }
 * 
 * class Interface {
 * public static void main(String[] args) {
 * 
 * Drawable d = new Rectangle();
 * d.draw();
 * System.out.println(Drawable.Number(1));//For the calling function class
 * object should not be written
 * System.out.println(Drawable.cube(3));//In case of that we must use class name
 * }
 * }
 */

/*
 * abstract class Bike {
 * public Bike() {
 * System.out.println("Please run the bike safely");
 * }
 * 
 * abstract void run1();
 * 
 * abstract void run2();
 * 
 * void changeGear() {
 * System.out.println("Gear Changed ");
 * }
 * 
 * }
 * 
 * class Honda extends Bike {
 * 
 * void run1() {
 * System.out.println("Running safely");
 * }
 * 
 * void run2() {
 * System.out.println("Running saely again");
 * }
 * }c
 * 
 * class Test {
 * public static void main(String[] args) {
 * Bike b = new Honda();
 * b.run1();
 * b.run2();
 * b.changeGear();
 * }
 * }
 */
/*
 * 
 * import java.util.Scanner;
 * 
 * abstract class Teacher {
 * protected static String name;
 * protected static int age;
 * protected static int roll;
 * 
 * Teacher(String name, int age, int roll) {
 * Teacher.name = name;
 * Teacher.age = age;
 * Teacher.roll = roll;
 * }
 * 
 * Teacher(String name) {
 * Teacher.name = name;
 * }
 * 
 * abstract void Display();
 * 
 * protected static int cubeVolume(int x) {
 * return x * x * x;
 * }
 * }
 * 
 * class Teacher1 extends Teacher {
 * protected long amount;
 * 
 * Teacher1(String name, int age, int roll, long amount) {
 * super(name, age, roll);
 * this.amount = amount;
 * System.out.println("\n  Name:" + Teacher.name + "\n  Age:" + Teacher.age +
 * "\n  Roll number:" + Teacher.roll
 * + "\n  Amoount:" + this.amount);
 * }
 * 
 * public void Display() {
 * System.out.println("Display the information");
 * super.cubeVolume(1);
 * }
 * }*-
 * 
 * class Test {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Please enter your name");
 * String name = scan.nextLine();
 * System.out.println("Enter your age");
 * int age = scan.nextInt();
 * System.out.println("Enter your roll number");
 * int roll = scan.nextInt();
 * System.out.println("Enter your amount");
 * long amount = scan.nextLong();
 * System.out.println(
 * ("If you want to find the volume of the cube please enter one digit"));
 * int x = scan.nextInt();
 * scan.close();
 * System.out.println("The cube of " + x + " is");
 * System.out.println(Teacher.cubeVolume(x));
 * System.out.println("The detail information related to the Person are");
 * new Teacher1(name, age, roll, amount);
 * }
 * }
 */

/*
 * class Employee {
 * String name;
 * int id;
 * long salary;
 * 
 * public Employee(String name, int id, long salary) {
 * this.name = name;
 * this.id = id;
 * this.salary = salary;
 * }
 * 
 * public String toString() {
 * String info = "Name :" + this.name + "  ID:" + this.id + "  Salary:" +
 * this.salary;
 * return info;
 * }
 * }
 * 
 * class Manager extends Employee {
 * String depart;
 * 
 * public Manager(String name, int id, long salary, String depart) {
 * super(name, id, salary);
 * this.depart = depart;
 * 
 * }
 * 
 * public String toString() {
 * String inf = "\nName :" + this.name + "\n  ID:" + this.id + "\n  Salary:" +
 * this.salary + "\n  this.depart";
 * return inf;
 * }
 * 
 * public void calculate() {
 * double totalSalary = 12 * 1000;
 * System.out.println(" Total salary is  " + totalSalary);
 * }
 * }
 * 
 * class Test {
 * public static void main(String[] args) {
 * Manager m = new Manager("Ishan", 191710, 10000, "set");
 * System.out.println(m);
 * m.calculate();
 * 
 * }
 * }
 */

// ZIP FILE
/*
 * import java.io.*;
 * import java.util.*;
 * import java.util.zip.ZipEntry;
 * import java.util.zip.ZipOutputStream;
 * 
 * class Zipfile {
 * static public void createFile(File path) throws IOException {
 * File[] files = path.listFiles();
 * if (files.length == 0) {
 * throw new IllegalArgumentException();
 * }
 * 
 * FileOutputStream fos = new FileOutputStream(Temp.Zip);
 * ZipOutputStream zos = new ZipOutputStream(fos);
 * 
 * for (File f : files) {
 * FileInputStream fis = new FileInputStream(f);
 * ZipEntry ze = new ZipEntry(f.getName());
 * int content;
 * zos.putNextEntry(ze);
 * while (content = fis.read() != -1) {
 * zos.write(content);
 * }
 * fis.close();
 * }
 * zos.close();
 * System.out.println("\n Created a zip file temp.zip");
 * }
 * 
 * public static void main(String[] args) throws IOException {
 * Scanner s = new Scanner(System.in);
 * String file;
 * s.nextLine();
 * System.out.println("\n Enter the location of file to be zipped:");
 * file = s.nextLine();
 * createFile(new File(file));
 * s.close();
 * }
 * }
 * 
 */

/*
 * import javax.swing.*;
 * import java.awt.event.*;
 * 
 * class GUI extends JFrame {
 * public GUI() {
 * JFrame f = new JFrame();
 * f.setSize(400, 500);
 * f.setVisible(true);
 * f.setLayout(null);
 * f.setFocusable(true);
 * 
 * JTextField t1 = new JTextField();
 * JTextField t2 = new JTextField();
 * JButton b = new JButton();
 * 
 * t1.setBounds(100, 100, 50, 20);
 * t2.setBounds(100, 200, 50, 20);
 * b.setBounds(100, 300, 50, 20);
 * f.add(t1);
 * f.add(t2);
 * f.add(b);
 * 
 * b.addActionListener(new CustomListener(t1, t2));
 * }
 * 
 * class CustomListener implements ActionListener {
 * JTextField t1, t2;
 * 
 * public CustomListener(JTextField t1, JTextField t2) {
 * this.t1 = t1;
 * this.t2 = t2;
 * }
 * 
 * public void actionPerformed(ActionEvent e) {
 * int len = t1.getText().length();
 * t2.setText(" " + len);
 * t1.setText("Hello");
 * }
 * }
 * 
 * public class DelagateEventHandling {
 * public static void main(String[] args) {
 * new GUI();
 * }
 * }
 * }
 */
/*
 * class Example {
 * public static void main(String[] args) {
 * String s = "Ishan";
 * StringBuilder sb = new StringBuilder(s);
 * sb.reverse();
 * String rev = sb.toString();
 * System.out.println("Given Striing is " + s);
 * System.out.println("Reverse String is " + rev);
 * }
 * }
 */
/*
 * //Java program demonstrate the conversion of String into int
 * //Using integer.parseInt() method
 * class StringA {
 * 
 * public static void main(String[] args) {
 * // Declaring String variable
 * String s = "200";
 * // Converting String into int using Integer.parseInt()
 * int i = Integer.parseInt(s);
 * // Printing the value of i
 * System.out.println(i);
 * 
 * }
 * }
 */
/*
 * class Count {
 * public static void main(String[] args) {
 * String s = "Hey its me Ishan Subedi";
 * int count = 0;
 * for (int i = 0; i < s.length(); i++) {
 * if (s.charAt(i) != ' ')
 * count++;
 * 
 * }
 * System.out.println("Countable String is" + count);
 * }
 * }
 */
// TO CHECK WHETHER THE STRING ARE ANAGRAM OR NOT
/*
 * import java.util.*;
 * 
 * class Anagram {
 * public static void main(String[] args) {
 * String str1 = " abcd";
 * String str2 = "cdab";
 * 
 * str1 = str1.toLowerCase();
 * str2 = str2.toLowerCase();
 * 
 * if (str1.length() != str2.length()) {
 * System.out.println("Both the String are not anagram");
 * } else {
 * // Converting the both array to character array
 * char[] string1 = str1.toCharArray();
 * char[] string2 = str2.toCharArray();
 * 
 * // Sorting the arrays using in-built function sort()
 * Arrays.sort(string1);
 * Arrays.sort(string2);
 * 
 * // Comparing both arrays using in-built function equals()
 * if (Arrays.equals(string1, string2) == true) {
 * System.out.println("Both the strings are anagram");
 * }
 * 
 * else {
 * System.out.println("Both the string are not anagram");
 * }
 * }
 * }
 * }
 */
/*
 * class DivideString {
 * public static void main(String[] args) {
 * String str = "aaaabbbbcccc";
 * // stores the length of the string
 * 
 * int len = str.length();
 * 
 * // n determines the variable that divide the string in 'n' equals parts
 * int n = 3;
 * int temp = 0, chars = len / n;
 * 
 * // Stores the array of string
 * String[] equalStr = new String[n];
 * 
 * // Check whether a string can be divided into n equal parts
 * if (len % n != 0) {
 * System.out.println("Sorry this string cannot be divided into " + n +
 * "equals parts.");
 * } else {
 * for (int i = 0; i < len; i = i + chars) {
 * // Dividing string in n eqaual parts using substring()
 * String part = str.substring(i, i + chars);
 * equalStr[temp] = part;
 * temp++;
 * 
 * }
 * System.out.println(n + "equal parts of given string are");
 * for (int i = 0; i < equalStr.length; i++) {
 * System.out.println(equalStr[i]);
 * }
 * }
 * 
 * }
 * }
 */

// To find the largest elements in an array
/*
 * import java.util.*;
 * 
 * class Largest {
 * static int getLargest(int s[], int total) {
 * Arrays.sort(s);// Given elments are arranging in order
 * return s[total - 1];// This lines indicates the value that should be
 * displayed
 * }
 * 
 * public static void main(String[] args) {
 * int n;
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the no. of elements in an array");
 * n = sc.nextInt();
 * int[] array = new int[n];
 * System.out.println("Enter " + n + " elements in an array");
 * for (int i = 0; i < n; i++) {
 * array[i] = sc.nextInt();
 * }
 * 
 * sc.close();
 * System.out.println("Largest=" + getLargest(array, n));
 * 
 * }
 * }
 */
