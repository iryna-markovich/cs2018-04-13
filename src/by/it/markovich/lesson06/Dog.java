package by.it.markovich.lesson06;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by user on 26.04.2018.
 */
public class Dog {
    private String name;
    private int age;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getWeight() {

        return weight;
    }

    public double getPower() {
        return power;
    }

    private int weight;
    private double power;

    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean win(Dog otherDog){
        double sh1 = 0.2 * this.age + 0.3 * this.weight + 0.5 * this.power;
        double sh2 = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        return sh1 > sh2;
    }
     /*Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.*/



    public Dog(){

    }

    public Dog(String name, int age, int weight, double power){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }


    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Кличка: " + name + ". Возраст: " + age;
    }
}
