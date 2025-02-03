class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Methodoverride {
    public static void main(String[] args) {
        Animal c1 = new Animal();
        Animal c2 = new Cat();
        c1.sound();   
        c2.sound();     
    }
}
