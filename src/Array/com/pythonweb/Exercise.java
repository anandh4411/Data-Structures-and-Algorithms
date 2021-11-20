package Array.com.pythonweb;
import java.util.Arrays;

class NewArray {
    int[] MyArray;
    int[] ModifiedArray;
    int index = 0;
    int length;
    NewArray(int length) {
        MyArray = new int[length];
        this.length = length;
        System.out.println("Array is been created");
        System.out.println(Arrays.toString(MyArray));
    }
    void insert(int item) {
        if (index < length) {
            MyArray[index] = item;
            index++;
        }
        else{
            int newLength = index+2;
            ModifiedArray = new int[4];
            System.out.println("New Array is been created");
            System.out.println(Arrays.toString(MyArray));
//            for (int i = 0; i < length; i++) {
//                ModifiedArray[i] = MyArray[i];
//            }
//            ModifiedArray[index] = item;
//            index++;
        }
    }
    void print() {
        System.out.println(Arrays.toString(MyArray));
    }
}

public class Exercise {

    public static void main(String[] args){
        System.out.println("Hello Array");
        NewArray object = new NewArray(3);
        object.insert(20);
        object.insert(43);
        object.insert(10);
        object.insert(10);
    }
}


