import java.util.ArrayList;


class Util {

    static ArrayList animal = new ArrayList();


    public static void addAnimalToList (Object object){
        animal.add(object);
    }

    public static int getSizeListCreateAnimal(){
        for (int i = 0; i <animal.size() ; i++) {
        }
        return animal.size();
    }




    public static int getFilterName(String name){
        char []consonatArray = new char[ ]{'B','C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

        int result = 0;
        for (int i = 0; i <name.length(); i++) {
            for (int j = 0; j <consonatArray.length ; j++) {
                if (name.charAt(i)==consonatArray[j]){
                    result++;
                }
            }
        }
        return result;
    }


    public static void getFilter(Animal[] array){
        for (int i = 0; i <array.length ; i++) {
            if (array[i].getClass().equals(Cat.class)){
                if(array[i].getAge()<1||array[i].getAge()>8){
                    System.out.println("Котейку удаляем из массива: "+" "+array[i].getAge()+" "+ array[i].getName()+" "+array[i].getBreed());
                    //   array[i] = null; - опционально  в условии не сказано  удалять  кота не соответствующим критериям или остаивть
                }
            }else {
                int nameFilterConsonants = Util.getFilterName(array[i].getName().toUpperCase());
                if (nameFilterConsonants>4){
                    System.out.println(" Y Тобика в имени много согласных удалчем: "+array[i].getAge()+" "+array[i].getName());
                    //array[i]=null; - опционально  в условии не сказано  удалять  кота не соответствующим критериям или остаивть
                }
            }
        }

    }



}
