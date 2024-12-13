//-ch:21:NB:67:---OOPS Concepts 
/* 
public class OOPS {
    public static void main(String[] args){
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("blue"); 
        System.out.println(p1.color); 

        p1.setTip(5);
        System.out.println(p1.tip); 
        p1.setColor("Yellow"); 
        System.out.println(p1.color); 

        BankAccount myAcc = new BankAccount(); 
        myAcc.username = "tukaram"; 
        myAcc.setPassword("abcdefghijklmn"); 
    }
}

// Access Midifieir 
class BankAccount{
    public String username; 
    private String password; 

    public void setPassword(String pwd){
        password = pwd; 
    }
}

class Pen{
    String color; 
    int tip;  

    void setColor(String newColor){
        color = newColor;  
    }

    void setTip(int newTip){
        tip = newTip;  
    }
}

class Student{
    String name; 
    int age; 
    float percentage; // cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3; // Calculates percentage based on the three subjects
    }
}
*/ 


// 3: Getters and setters : 

/* 
public class OOPS {
    public static void main(String[] args){
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("blue"); 
        System.out.println(p1.getColor()); 

        p1.setTip(5);
        System.out.println(p1.getTip()); 
        p1.setColor("Yellow"); 
        System.out.println(p1.getColor()); 
    }
}

// Access Midifieir 

class Pen{
    private String color; 
    private int tip; 
    //getters - to return the the value 
    String getColor(){ 
        return this.color;
    }
    int getTip(){
        return this.tip; 
    }
    //setters - to modify the value 
    void setColor(String newColor){
        this.color = newColor;  
    }

    void setTip(int newTip){
        this.tip = newTip;   // here newTip is external variable
    }
}

*/ 

// 3: Constructor: 
/* 
public class OOPS {

    public static void main(String[] args){
        Student s1 = new Student("Tukaram"); 
        System.out.println(s1.name);
        Student1 s2 = new Student1(); 
    } 
}

class Student {
    String name; 
    int roll; 

    Student(String name){
        this.name= name; 
        // System.out.println();
    }
}

class Student1{
    Student1(){
        System.out.println("constructor is called...... ");
    }
}
*/ 


//4:Types of constructor:1:Non-Parameterized 2:Parameterized 3:Copy constructor
/* 
public class OOPs {
    public static void main(String[] args){
        // also known as constructor overloading  OR example of polymorphism
        Student s1 = new Student();// if we write extra constructor that does not belong in Student cons will got error
        Student s2 = new Student("Tukaram"); 
        Student s3 = new Student(123); 
        // Student s3 = new Student("Tukaram", 123); //will error 
    }
}
// here constructor will called according to requirement.  
class Student{
    String name; 
    int roll; 

    Student(){ // 1: without Parameter cons
        System.out.println("constructor is called...");
    }
    Student(String name){ // with parameter cons
        this.name = name; 
    }
    Student(int roll){ 
        this.roll = roll; 
    }
}*/ 


// Copy Constructor: 
/* 
public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.name = "tukaram"; 
        s1.roll = 456; 
        s1.password = "abcd"; 

        s1.marks[0] = 100;  // No more NullPointerException because marks array is initialized
        s1.marks[1] = 90; 
        s1.marks[2] = 80; 

        Student s2 = new Student(s1); // s1 copy into s2 
        s2.password = "xyz"; 
        s1.marks[2] = 100; 
        for(int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow Copy constructor
    // Student(Student s1) {
    //     marks = new int[3]; // Initialize the marks array
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks; // get arr by Reference
    // }

     // deep copy constructor 
     Student(Student s1){
        marks = new int[3]; 
        this.name = s1.name; 
        this.roll = s1.roll; 
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i]; 
        }
     }
    // Default constructor
    Student() {
        System.out.println("Constructor is called...");
        // Initialize the marks array to avoid NullPointerException
        marks = new int[3]; // we ensure in every cons maraks bcz इतणा ही मार्क्स होने चाहिये 
    }

    Student(String name){
        marks = new int[3]; 
        this.name = name; 
    }

    Student(int roll){
        marks = new int[3]; 
        this.roll = roll; 
    }
}
*/ 


/*  2: Inheritance : Inheritance is when properties & methods of base class 
                  passed on to aderived cass.

    parentClass/BasedClass[--] -----inherit----> [--] ChildClass/DerivedClass called
*/ 
/* 

public class OOPS {

    public static void main(String[] args){
    
            Dog don = new Dog(); 
            don.breathe(); 
            don.legs = 4; 
            System.out.println(don.legs);
    }
}
// Base class
class Animal{
    String color; 
    
    void eat() {
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

// Derived Class 
class fish extends Animal {
    int fins; 

    void swim(){
        System.out.println("swims in water");
    }
}

class Mammal extends Animal{
    int legs; 
}

class Dog extends Mammal {
    String brids; 
}*/ 


// ii Types of Inheritance : hierarchical Inheritance : 
/* 
public class OOPS {
    public static void main(String[] args) {
        Mammal mam = new Mammal();
        mam.Walks(); // This prints "Walks" to the console
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void Walks() {
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}

//*  ii : Hybrid Inheritance : 
*/ 


// 3: PolyMorphism : 

// i: Method OverLoading : compile time PolyMorphism : 
/* 
public class OOPS {

    public static void main(String[] args){
        Calculator calc = new Calculator(); 
        System.out.println(calc.sum(1, 3));
        System.out.println(calc.sum((float) 1.5, (float)2.5)); // typecast bcz of double 
        System.out.println(calc.sum(1, 2, 3));


    }
}

class Calculator {
    int sum(int a, int b){
        return a + b; 
    }

    float sum(float a, float b){
        return a + b; 
    }

    int sum (int a, int b, int c){
        return a + b + c;
    }
}
*/ 


/*  ii : Function Overriding : 
        Parent and child classes both contain the same function with a different 
        definition. 
*/
/*
public class OOPS {

    public static void main(String[] args){
        deer d = new deer(); 
        d.eat(); 
    }
}

class Animal {
    void eat(){
        System.out.println("eat Anything");
    }
}

class deer extends Animal{
    void eat(){
        System.out.println("eat Grass");
    }
}
*/ 


/* 5: Abstraction : Hiding all the unnecessary details and showing only the important 
 part of user --> यामध्ये आयडिया भेटते पन इम्प्लिमेनटेशन नाही 

 i: Abstract  ii: Interface 

 Abstract class: cannot create an instance(object) of abstract class 
 - can have abstraction abstract methods. 
 - can have constructor: 

*/ 
/* 
public class OOPS {

    public static void main(String[] args){

        Horse h = new Horse(); 
        h.eat();
        h.walk(); 
        System.out.println(h.color);

        // Chicken c = new Chicken(); 
        // c.eat(); 
        // c.walk(); 

        // if we write suppose like ->
        // Animal a = new Animal(); // error 


    }
}

abstract class Animal{
    String color; 
    Animal(){
        color = "brown"; 
    }

    void eat(){
        System.out.println("Animal Eacts");
    }
     // abstract : just idea not implentation 
    abstract void walk(); // याची इम्प्लिमेनटेशन पुढच्या क्लाससेस वर dipend करणार 
}

class Horse extends Animal{
    void changeColor(){
        color = "dark brown"; // output : brown : 
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{

    void changeColor(){
        color = "yellow"; 
    }
    void walk(){
        System.out.println("walks on 3 leg");
    }
    
}
*/ 

// Constructor Calling Heirarchy 
/* 
public class OOPS {

    public static void main(String[] args){
        Mustang myHorse = new Mustang(); 

        // Inherit : Animal -> Horse -> Mustang


    }
}

abstract class Animal{
    String color; 
    Animal(){
        System.out.println("Animal constructor called ");
    }

    void eat(){
        System.out.println("Animal Eacts");
    }
     // abstract : just idea not implentation 
    abstract void walk(); // याची इम्प्लिमेनटेशन पुढच्या क्लाससेस वर dipend करणार 
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown"; // output : brown : 
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called");
    }
}
class Chicken extends Animal{

    void changeColor(){
        color = "yellow"; 
    }
    void walk(){
        System.out.println("walks on 3 leg");
    }
    
}
    */ 

// Interfaces : Interface is BluePrint of a Class : 
/* 
public class OOPS {

    public static void main(String[] args){
        Queen q = new Queen(); 
        q.moves();
    }
}

interface ChessPlayer {
    void moves(); 
}

class Queen implements ChessPlayer{
   public void moves(){
        System.out.println("Up, Down, left, right, digonal (in all 4 dir) ");
    }
}

class Rook implements ChessPlayer{
   public void moves(){
        System.out.println("Up, Down, left, right ");
    }
}

class King implements ChessPlayer{
   public void moves(){
        System.out.println("Up, Down, left, right, diagonal (by 1 step ) ");
    }
}
*/ 

// Second Example : syntax : 
/* 
public class OOPS{
    public static void main(String[] args){

    }
}

interface Herbivore {

}

interface Carnivore{

}

class Bear implements Herbivore, Carnivore{


}

*/ 


// 7: Static Keyword : 
/* 
public class OOPs {

    public static void main(String[] args){
        Student s1 = new Student(); 
        s1.schoolName = "JMV"; 

        Student s2 = new Student(); 
        System.out.println(s2.schoolName); //* this print "JMV" नही होणे बावजूद kyoki static के कारण वे एकदाच मेमोरी मध्ये बनतो सर्वांसाठी. 

        Student s3 = new Student(); 
        s3.schoolName = "ABC"; //* this school setup to all class 
    }
}

class Student {
    static int returnPercentage(int math, int phy, int chem){
        return(math + phy + chem)/3 ; 
    } // सर्व स्टूडेंट्स साठी एकदाच  

    String name ; 
    int roll ;
    static String schoolName; 

    void setName(String name) {
        this.name = name; 
    }
    String getName() {
        return this.name; 
    }
   
}*/

/* 
public class OOPS {
    public static void main(String[] args){
        Horse h = new Horse(); 

        System.out.println(h.color);

    } 
}

class Animal{
    String color ; 
    Animal(){
        System.out.println("animal constructor is called ");
    }
}

class Horse extends Animal {
    Horse(){
        // super(); // imediate Parent class 
        super.color = "brown"; 
        System.out.println("Horse constructor is called ");
    }
}
    */ 


    // 10: Practice question : NB 75: 

/* 
class Student{
    String name; 
    int marks; 
}

public class OOPS {

    public static void main(String[] args){
        Student s = new Student(); 
       System.out.println(s.name = "tukaram");

    }
}

*/ 


// Assignments Of OOPs 

// Question :2 : What is the output of the following Program 
/* 
class Automobile{
    private String drive(){
        return "Driving vehicle"; 
    }
}

class Car extends Automobile{
    protected String drive(){
        return "driving Car"; 
    }
}

public class OOPS extends Car{

    public final String drive(){
        return "Driving electric car"; 
    }

    public static void main(String[] wheels){
        final Car car = new OOPS(); 
        System.out.println(car.drive());
    }
    
}
*/ 


/* Question 1 : Implement a Java Program to perform the sum, difference, and 
product of two complex numbers using a complex class. the class will have 
methods for each operation. */ 

import java.util.*; 
// use -> class Complex -->instead of OOPS class name
class Complex {
    int real; 
    int imag; 

    public Complex(int r, int i){
        real = r; 
        real = i; 
    }


public static Complex add(Complex a, Complex b){
    return new Complex((a.real + b.real), (a.imag + b.imag)); 
}

public static Complex Sub(Complex a, Complex b){
    return new Complex((a.real -  b.real), (a.imag-b.imag)); 
}

public static Complex Product(Complex a, Complex b){
    return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.real) - (a.imag * b.imag))); 
} 

public void printComplex(){
    if(real == 0 && imag != 0 ){
        System.out.println(imag + " i ");
    }else if(imag == 0 && real != 0){
        System.out.println(real);

    }else{
        System.out.println(real + " + "+ imag +" i ");
    }

}

}

/**
 * OOPs
 */
public class OOPS {
    public static void main(String[] args){

        // first way to called static fun
        // Complex obj = new Complex(1, 2);
        // Complex result = obj.Product(a, b); 

        // second way to called static function 
        Complex c = new Complex(4, 5); 
        Complex d = new Complex(9, 4); 

        Complex e = Complex.add(c, d); 
        Complex f = Complex.Sub(c, d); // difference
        Complex g = Complex.Product(c, d);  

        e.printComplex(); 
        f.printComplex(); 
        g.printComplex();
    }
    
}


 

// Question 3: Look at the following code and choose the right option for the word 
// 
/*
public class OOPs {

    protected void display(){
        System.out.println("Display-base");
    }
}
// Circle 
public class Circle extends OOPS { 
        void display(){
        System.out.println("Display-drived");
    }
}

ANS : public protected both can be used 

*/ 

// Question 4: what is the output of the following program : 
//abstract class Car

/*
abstract class Car{
    static {
        System.out.println("1");
    }
    
    public Car(String name){
        super();
        System.out.println("2");
    }

    {
        System.out.println("3");
    }
}

public class OOPS extends Car {
    {
        System.out.println("4");
    }

    public OOPS(){
        super("blue"); 
        System.out.println();
    }

    public static void main(String[] gears){
        new OOPS(); 
    }
}
    */ 