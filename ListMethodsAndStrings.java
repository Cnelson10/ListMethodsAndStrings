package listmethodsandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethodsAndStrings {

    
    public static void main(String[] args) {
        
        List <String> myStrings = new ArrayList<>();
        myStrings.add("Hey");
        myStrings.add("Hey");
        myStrings.add("How");
        myStrings.add("are");
        myStrings.add("you");
        myStrings.add("doing");
        myStrings.add("today?");
        
        for (int i = 0; i < myStrings.size(); i++){
            System.out.print(myStrings.get(i) + " ");
        }
        System.out.println("");
        System.out.println(myStrings);
        unique(myStrings);
        
        
        System.out.println("These strings in the list are 3 characters long: ");
        System.out.println(allStringsOfSize(myStrings, 3));
        
        System.out.println("Let's remove all instances of 'hey'");
        System.out.println(myStrings + " becomes:");
        removeAllInstances(myStrings, "Hey");
        System.out.println(myStrings);
        
        
        
        List <Integer> myIntegers = new ArrayList <>();
        
        for (int i = 0; i < 9; i++){
            myIntegers.add(i + 3);
        }
        
        myIntegers.add(1, 3);
        
        List <Integer> myIntegers2 = new ArrayList <>();
        
        myIntegers2.add(10);
        myIntegers2.add(3);
        myIntegers2.add(9);
        myIntegers2.add(5);
        myIntegers2.add(8);
        myIntegers2.add(4);
        myIntegers2.add(7);
        myIntegers2.add(3);
        myIntegers2.add(11);
        myIntegers2.add(6);
        
        List <Integer> myIntegers3 = new ArrayList <>();
        
        for (int i = 0; i < 10; i++){
            myIntegers3.add(i + 3);
        }
        
        System.out.print("[" + myIntegers.get(0));
        for (int i = 1; i < 10; i++){
            System.out.print(" " + myIntegers.get(i));
            
        }
        System.out.print("]");
        System.out.println("");
        unique(myIntegers);
        
        
        System.out.print("[" + myIntegers3.get(0));
        for (int i = 1; i < 10; i++){
            System.out.print(" " + myIntegers3.get(i));
            
        }
        System.out.print("]");
        System.out.println("");
        unique(myIntegers3);
        
        System.out.println(allMultiples(myIntegers, 5));
        unique(allMultiples(myIntegers, 5));
        
        System.out.println("These two lists are permutations");
        System.out.println(myIntegers);
        System.out.println(myIntegers2);
        System.out.println(isPermutation(sort(myIntegers), sort(myIntegers2)));
        System.out.println("These two lists are permutations");
        System.out.println(myIntegers);
        System.out.println(myIntegers3);
        System.out.println(isPermutation(sort(myIntegers), sort(myIntegers3)));
        
        String s = "Hey hey! How are you doing today?";
        System.out.println(stringToListOfWords(s));
        
        System.out.println("Let's remove all instances of '3'");
        System.out.println(myIntegers + " becomes:");
        removeAllInstances(myIntegers, 3);
        System.out.println(myIntegers);
        
    } 
    
    public static <E> void unique(List <E> list){
        
        System.out.println("Are all the items in this list unique?");
        int duplicate = 0;
        
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                
                if(list.get(i).equals(list.get(j))){
                    
                    System.out.println("No!");
                    System.out.println("Duplicate item found: " + list.get(i));
                    duplicate++;
                }
            }
        }
        
        if (duplicate == 0){
        System.out.println("Yes, all the items in the list are all unique");
        }
    } 
    
    public static List<Integer> allMultiples(List<Integer> list, int mult){
        
        List <Integer> multList = new ArrayList <>();
        
        for(int i = 0; i < list.size() - 1; i++){
            if (list.get(i) % mult == 0){
                multList.add(list.get(i));
            }
             
        }
        
        return multList;
    }
    
    public static List<String> allStringsOfSize(List<String> list, int length){
        
        List <String> sameLengthStrs = new ArrayList <> ();
        
        for(int i = 0; i < list.size(); i ++){
            
            if(list.get(i).length() == length){
                
                sameLengthStrs.add(list.get(i));
            }
        }
        
        return sameLengthStrs;
    }
    
    public static List<Integer> sort(List<Integer> list){
        
        int size = list.size();
        
        do {
        
            for (int i = 0; i < list.size() - 1; i++){
            
                if (list.get(i) > list.get(i +1)){
                
                    Integer temp1= list.get(i + 1);
                    Integer temp2= list.get(i);
                    list.set(i,temp1);
                    list.set(i+1,temp2);
               
                }
            }
            
            size -= 1;
        } while (size != 1);
        
        return list;
    }
    
    public static boolean isPermutation(List<Integer> list, List<Integer> list2){
        
        
        if(list2.equals(list)){
            return true;

        }else{
            return false;
        }
    }
    
    public static List <String> stringToListOfWords(String str){
        
        String [] removePunc = str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        List <String> words = new ArrayList<>(Arrays.asList(removePunc));
        
        
        return words;
    }
    
    
    public static <E> void removeAllInstances(List <E> list, E item){
        
        while (list.contains(item)){
            for (int i = 0; i < list.size(); i++){
                if (list.get(i).equals(item)){
                    list.remove(i);
                }
            }
        }
    }
}
