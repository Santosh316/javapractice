package training.day1;

public class CatPractice {

     public static void main(String[] args) {

        Cat thor = new Cat();
        thor.name = "Thor";
        thor.age = 2;
        thor.color = "White";
        thor.weight = 2.5f;

        Cat rambo = new Cat();
        rambo.name = "Rambo";
        rambo.age = 3;
        rambo.color = "Black";
        rambo.weight = 3.0f;

        String thorName = thor.name;
        System.out.println(thorName);
        int thorAge = thor.age;
        System.out.println(thorAge);

        String ramboColor = rambo.color;
        System.out.println(ramboColor);

        thor.sleep();


    }
}
