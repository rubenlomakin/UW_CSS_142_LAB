package com.company;


/**
 * Today we'll continue experimenting with software building blocks called classes. Recall that a class is a reusable
 * unit of logic that encapsulates methods and data, and we're going to practice building small classes that can be
 * assembled to compose more complex software containing other small classes. This is similar to building using
 * legos - these components are your building blocks that can produce complex models from combining individual
 * elements.
 *
 * The Pizza class allows you to create different Pizza objects. The objects will all have the same actions and fields,
 * but each instance of Pizza can be different from one another in terms of its values.
 */
public class Pizza {

    //Pizzas can be either "small", "medium", or "large"
    //how many meat toppings? The min should be 0, and I will set the max to 10 (but you can change that).
    //how many veggie toppings? The min should be 0, and I will set the max to 10 (but you can change that).
    //vegan means the Pizza should be also vegetarian...that is number of meat topping should be 0 if this is set to true

    private int numberOfVeggies;
    private String pizzaSize;
    private int cheeseCount;
    private int meatCount;
    private int vegs;

    /**
     * Below I will have the constructors. Contructors are what tells Java to allocate memory for a given instance of an object.
     * Every object you create in Java is created via a Constructor. Remember that "new" keyword you use sometimes...that is you
     * using a constructor someone else wrote.
     * <p>
     * You may be wondering why you didn't have to write a contructor for the GiftCard class last week...Well, short story is:
     * Java made one for you during compilation. As I said, you can't make objects without constructors, so if Java does not find
     * a constructor, it will make a really simple one for you and by simple I mean all vars will be set to 0, null or false
     * (depending on their type).
     * <p>
     * So if Java does it for us, why should we care to do it ourselves? Well, it maybe convenient for a programmer to
     * construct and initialize the object with the desired values from the start....rather than create the object first, then
     * call the different setters to initialize the object. You know...like with primitive vars, you can do this:
     * <p>
     * int x; //declare
     * x = 1; //then initialize later
     * <p>
     * or this:
     * <p>
     * int x = 1; //declare and initialize "simultaneously"
     * <p>
     * Enogh explanation! Let's make a constructor.
     * @param medium
     * @param meat
     * @param vegs
     * @param i
     */

    //Most constructors are public and the should always have the same name of the class (same spelling!). Note that there is NO return type.
    //But they do have to have an argument list. This one is the no-args constructor, so all vars will be set to the defaults in the pdf.
    public Pizza(String pizzaSize, int meatCount, int vegs, int i) {
        this.pizzaSize = "";
        this.cheeseCount = 0;
        this.vegs = 0;
        this.meatCount = 0;

    }

    //This constructor allows you to initialize the instance vars with the given parameters.
    //But lets be good and check the validity of these parameters.
    public Pizza(String s, int meat, int vegs, boolean v) {
        if (s.equalsIgnoreCase("small") || s.equalsIgnoreCase("medium") || s.equalsIgnoreCase("large")) //is s a valid size?
            pizzaSize = s; //if so set size to s

        else if(s.equalsIgnoreCase("small")) { //default to "medium"

            pizzaSize = "medium";

            System.out.println("Invalid size. Defaulting to medium.");
        }

        //YOUR CODE HERE - take over now and set the remaining vars with validation

    }

    /**
     * getters -- fill in the methods below to get each of
     * the instance vars.
     */
    public String getPizzaSize() {

        return this.pizzaSize;
    }

    public int getMeat() {

        return this.meatCount;
    }

    public int getVeg() {

        return this.numberOfVeggies;
    }

    public boolean isVegan() {

        return this.isVegan();
    }


    /**
     * setters -- fill in the methods below to set each of
     * the instance vars. Don't forget validation!
     */

    public void setSize(String s) {

        this.pizzaSize = "";
    }

    public void setMeat(int meat) {

        this.meatCount = meat;
    }

    public void setVeg(int vegs) {

        this.numberOfVeggies = vegs;
    }


    /**
     * calcCost method: returns a double that is the cost of the pizza. Pizza cost is
     * determined by:
     * Small: $10
     * Medium: $12
     * Large: $14
     * Each meat topping cost $2 and each veggie topping cost $1
     * If the pizza is vegan, it costs an additional $2
     */
    public double calcCost() {
        // what do we need to know to get the total?

        // the size
        //      *small 10
        //      *medium 12
        //      * large 14
        // number of meat
        //      *1 meat == $2
        // number of veggie
        //      *1 veggie == $1
        // isVegan

        if(pizzaSize.equalsIgnoreCase("small"))
        {
            return 10 + (cheeseCount + vegs + meatCount) * 2;
        }
        else if(pizzaSize.equalsIgnoreCase("medium"))
        {
            return 12 + (cheeseCount + vegs + meatCount) * 2;
        }
        else if(pizzaSize.equalsIgnoreCase("large"))
        {
            return 14 + (cheeseCount + vegs + meatCount) * 2;
        }
        else
        {
            return 0.0;
        }
    }



    /**
     * getDescrition method: returns a String containing the pizza size, whether it is
     * vegan or not, quantity of each topping, and the pizza cost as calculated by calcCost.
     * Format: <size> pizza, <not vegan., <numberOfMeat> meat topping, ,numberOfVeggies> veggie topping: $<calcCost()> dollars.
     *
     * Look up what you did last week in the GiftCard class for the method: report (or toString as per the pdf).
     */
    public String getDescription() {
        return " Pizza size: " + pizzaSize  + "\n Veggie Toppings: " + vegs + "\n Meat Toppings: " + meatCount + "\n Pizza cost: $" + calcCost() + "\n";
    }
}
