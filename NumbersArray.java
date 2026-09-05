import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    public static int findMax(Integer[] arr){
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static Integer[] findDuplicates(Integer[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && j > i){
                    temp.add(arr[i]);
                }
            }
        }

        Integer[] result = new Integer[temp.size()];

        for(int k = 0; k < temp.size(); k++){
            result[k] = temp.get(k);
        }

        return result;
    }

    public static Integer[] findUnique(Integer[] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            boolean duplicate = false;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && j != i){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                temp.add(arr[i]);
            }
            
        }

        Integer[] result = new Integer[temp.size()];

        for(int k = 0; k < temp.size(); k++){
            result[k] = temp.get(k);
        }

        return result;

    }
    
}

