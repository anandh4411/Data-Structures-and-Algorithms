package Array.com.pythonweb;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] MyArray = new int[3];
        // declared an array
        // of type int
        // name is MyArray
        // allocated memory using '= new' keyword
        // the memory size is 3, and it is int type
        // int takes 4 bytes memory. So 4 x 3 = 12 bytes memory in total

        System.out.println(MyArray);
        // This prints a combo of data type and memory address separated with an '@' sign
        // This is not understandable
        // We need the content of this array
        
        System.out.println(Arrays.toString(MyArray));
        // This will convert it into a string
        // So that we can understand

        // Let's fill the array with some values
        MyArray[0] = 10;
        MyArray[1] = 43;
        MyArray[2] = 21;  
        System.out.println(Arrays.toString(MyArray));

        // If we know the values ahead of time
        // then we can initialise the array instead of declaring it
        int[] MyArray2 = {10, 43, 21};
        System.out.println(Arrays.toString(MyArray2));
        System.out.println(MyArray2.length); // .length returns the size of array

        // Anyway, an array has fixed size (static array)
        // If you need to insert 4rth element in an array of size 3
        // then you need to create a new array, copy values from old,
        // and insert the 4rth value also.
        // This is time-consuming.
        // In this case, a better approach is Linked Lists.
    }
}
