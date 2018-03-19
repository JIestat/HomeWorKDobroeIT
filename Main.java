public class Main {

    public static void main(String[] args) {

        Dog dog0 = new Dog(1,"Sunny","Pudel");
        Util.addAnimalToList(dog0);
        Dog dog1 = new Dog(6,"Pushok","Taksa");
        Util.addAnimalToList(dog1);
        Dog dog2 = new Dog(2,"Zamurzishka","Ovcharka");
        Util.addAnimalToList(dog2);
        Dog dog3 = new Dog(7,"ChupaChups","Sharpei");
        Util.addAnimalToList(dog3);
        dog0.voice();
        Cat cat0 = new Cat(6,"Body","Vislouhaya");
        Util.addAnimalToList(cat0);
        Cat cat1 = new Cat(3,"Mouse","Siamskaya");
        Util.addAnimalToList(cat1);
        Cat cat2 = new Cat(5,"Pioneer","May-Kun");
        Util.addAnimalToList(cat2);
        Cat cat3 = new Cat(9,"Zalman","Tigrovaya");
        Util.addAnimalToList(cat3);
        cat0.voice();

        Animal[] array  = new  Animal[8];
        array[0] = dog0;
        array[1] = dog1;
        array[2] = dog2;
        array[3] = dog3;
        array[4] = cat0;
        array[5] = cat1;
        array[6] = cat2;
        array[7] = cat3;

        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println("Всего животных: "+Util.getSizeListCreateAnimal());
        System.out.println();


        char []consonatArray = new char[ ]{'B','C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
        int resultFilterName = Util.getFilterName(array.getClass().getName(),consonatArray);
        Util.getFilter(array,resultFilterName);




    }
}

/*3. Создать метод, который из созданного в п.2 массива удалит всех котов младше 1 года или старше 8 лет,
        а также всех собак, чьё имя содержит больше 4 согласных букв. */


