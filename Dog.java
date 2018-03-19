
public class Dog extends Animal{

    private  int age;
    private  String name;
    private  String breed;


    Dog(int age, String name, String breed) {

        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public void voice(){
        System.out.println("Dog say: Bark!");
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
        return "Возраст тобика:"+getAge()+", "+"Имя Тобика:"+getName()+", "+"Порода тобика: "+getBreed()+"!";
    }



}
