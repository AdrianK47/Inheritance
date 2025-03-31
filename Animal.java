import java.util.*;
public class Animal{
    //Instance Variables
    private String species;
    private String name;

    //Constructors with and without parameters
    public Animal(){
        species = "Monkey";
        name = "Tim";
    }
    public Animal(String s, String n){
        species = s;
        name = n;
    }

    //Accessor and Modifier methods
    public String getSpecies(){
        return species;
    }
    public String getName(){
        return name;
    }
    public void setSpecies(String s){
        species = s;
    }
    public void setName(String n){
        name = n;
    }

    //toString and equals methods
    public String toString(){
        return "The animal's name is " + name + ", it is a " + species;
    }
    public boolean equals(Animal other){
        if(this == other){
            return true;
        }
        if(!(other instanceof Animal)){
            return false;
        }
        Animal otherAnimal = (Animal) other;
        return species.equals(otherAnimal.species) && name.equals(otherAnimal.name);
    }

    //Two unique methods
    public void speak(){
        System.out.println("Hello");
    }
    public void talk(){
        System.out.println("My name is " + name + " and I am a " + species);
    }
}

class Dog extends Animal{
    //Instance Variables
    private String breed;

    //Constructors with and without parameters
    public Dog(){
        super("Dog", "Steve");
        breed = "Golden Retriever";
    }
    public Dog(String n, String b){
        super("Dog", n);
        breed = b;
    }

    //Accessor and Modifier methods
    public String getBreed(){
        return breed;
    }
    public void setBreed(String b){
        breed = b;
    }

    //Overridden method from parent class
    public void speak(){
        System.out.println("Woof");
    }

    //toString and equals methods
    public String toString(){
        return super.toString() + ", specifically a " + breed;
    }
    public boolean equals(Dog other){
        if(this == other){
            return true;
        }
        if(!(other instanceof Animal)){
            return false;
        }
        Dog otherDog = (Dog) other;
        return (super.equals(otherDog) && breed == otherDog.getBreed());
    }
    
    //Two unique methods
    public void play(){
        int num = (int)((Math.random()* 5) + 1);

        if(num % 2 == 0){
            System.out.println(super.getName() + " played with a ball");
        }
        else{
            System.out.println(super.getName() + " did not play");
        }
    }
    
}