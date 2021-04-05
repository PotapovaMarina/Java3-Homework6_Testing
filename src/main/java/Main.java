//        1.Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
//        Метод должен вернуть новый массив,который получен путем вытаскивания из исходного массива
//        элементов, идущих после последней четверки. Входной массив должен содержать хотя бы одну
//        четверку, иначе в методе необходимо выбросить RuntimeException.
//        Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//        Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
//        2. Написать метод, который проверяет состав массива из чисел 1 и 4.
//        Если в нем нет хоть одной четверки или единицы, то метод вернет false;
//Написать набор тестов для этого метода (по 3-4 варианта входных данных).

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static int[] newArrayAfter4(int[] arrayWith4) throws RuntimeException {
        int indexOf4=-1;
        for (int i = arrayWith4.length-1; i>=0 ; i--) {
            if(arrayWith4[i]==4) {
                indexOf4=i+1;
                break;
            }
        }
        if ((indexOf4==-1)||(arrayWith4.length==0)) throw new RuntimeException("Массив не содержит ниодной цифры 4 либо пустой");
        else {
            return Arrays.copyOfRange(arrayWith4, indexOf4, arrayWith4.length);
        }

    }
    public static boolean checkArray1And4(int[] array) {
        boolean count1=false;
        boolean count4=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1) {
                count1=true;
            }
            else if (array[i]==4) {
                count4=true;
            }
            else return false;
        }

        return(count4&&count1);
    }
}