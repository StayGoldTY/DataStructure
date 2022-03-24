package DataStructure.Array;


import java.lang.reflect.Array;
import java.util.Arrays;

/*
要点：
1.int 转String方法： String.valueof(int);
2.String 转int方法： int.Prase(String);
3.Array转String:ArrayS.toString(Array);
*/
public class Base {
    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,6,7,8,9,45,34,56,78};
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.printf(String.valueOf(intArray[i]));
//        }
//
//        String[] stringArray = new String[]{"a","b","c"};
//        for (int i = 0; i < stringArray.length; i++) {
//            System.out.printf(stringArray[i]);
//        }
          int[] newArray = arrayAdd(intArray,5,999);
          System.out.printf(Arrays.toString(newArray));
    }

    ///数组插入
    //1.无序数组插入
    public static int[] arrayAdd(int[] arr,int p,int m) {
        if(p > arr.length - 1){
            return arr;
        }
        int length = arr.length + 1;
        int[] retArray = new int[length];
        retArray[p] = m;
        retArray[length - 1] = arr[p];
        for (int i = 0; i < arr.length; i++) {
            if(i != p){
                retArray[i] = arr[i];
            };

        }
        return retArray;
    }
}
