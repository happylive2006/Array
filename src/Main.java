import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String[] familyArray = new String[4];
//        String[] familyArray2 = {"William", "Victoria", "Seraphina","Ronnie"};
//
//        ArrayList<String> familyArrayList = new ArrayList<>();
//        ArrayList<String> familyArrayList2 =
//                new ArrayList<>(Arrays.asList("William", "Victoria", "Seraphina","Ronnie"));
//        System.out.println(familyArray2);
//        System.out.println(familyArrayList2);


        String[] familyArray = {"William", "Victoria", "Seraphina","Ronnie"};

        ArrayList<String> familyArrayList =
                new ArrayList<>(Arrays.asList("William", "Victoria", "Seraphina","Ronnie"));

        //Get size
        System.out.println(familyArray[1]);
        System.out.println(familyArrayList.get(1));

        //Get size
        System.out.println(familyArray.length);//field
        System.out.println(familyArrayList.size());//method call

        //Add an element
        //You can't do that with Arrays
        familyArrayList.add("Grandma");
        System.out.println(familyArrayList.get(4));

        //Set an element
        familyArray[0]= "loki";
        System.out.println(familyArray[0]);
        familyArrayList.set(0,"Loki");
        System.out.println(familyArrayList.get(0));

        //Remove an element
        //Can't do this with arrays
        familyArrayList.remove("Loki");
        System.out.println(familyArrayList.get(1));

        //Print
        System.out.println(familyArray);
        System.out.println(familyArrayList);
    }
}