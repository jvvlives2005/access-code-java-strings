package nyc;

/**
 * Created by c4q-joshelynvivas on 3/3/15.
 */
public class Vars {
    public static void main(String[] args) {
        char letter= '!';
        String name= "Greg";
        System.out.println("I like the number " + name);

        int numVeggies = 9, numFruits = 11;
        System.out.println("I like the number " + numVeggies);

        //there are five variables that will be integers (int)
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        //there are three variables that will have number and decimals (double)
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        //the int cars will be 100
        cars = 100;
        //the double space_in_a_car will be 4.0
        space_in_a_car = 4.0;
        //the int drivers will be 30
        drivers = 30;
        //the int passengers will be 90
        passengers = 90;
        //cars_not_driven will be 100-30= 70
        cars_not_driven = cars - drivers;
        //cars_driven will be the same as numbers in 'drivers'= 30
        cars_driven = drivers;
        //carpool_capacity will be
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );

        int one = 1;
        int two = 2;
        int three = 3;

        System.out.println("testing order" + one + two + three);
        System.out.println("testing order" + ( one + two + three));

        char a = 'a';
        char A = 'A';
        boolean more = a < A;
        System.out.println(more);

        System.out.println( "I will now count my chickens:");

        System.out.println( "Hens " + ( 25 + 30 / 6) );
        System.out.println( "Roosters " + ( 100 - 25 * 3 % 4) );

        System.out.println( "Now I will count the eggs:" );

        System.out.println( 3 + 2 + 1 - 5 + 4 % 2 -1 / 4 + 6 );

        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

        System.out.println( 3 + 2 < 5 -7 );

        System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
        System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

        System.out.println( "Oh, that's why it's false." );

        System.out.println( "How about some more." );

        System.out.println( "Is it greater? " + ( 5 > -2 ) );
        System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
        System.out.println( "Is it less or equal? " + (5 <= -2) );

        int age, ageinfuture;
        age = 24;
        ageinfuture= age + 5;

        System.out.println( "Today I am " + age + " years old. " );
        System.out.println( "In 5 years, I  will be " + ageinfuture +  " years old.");


    }
}



