
public class Cat extends Animal {

    private  int age;
    private  String name;
    private  String breed;


    Cat(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public void voice(){
        System.out.println("Cat say: Meow!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Возраст Котейки:"+getAge()+", "+"Имя Котейки:"+getName()+", "+"Порода Котейки: "+getBreed()+"!";
    }
}
