package com.company;
import java.util.*;

//метод ниже убирает число под индексом указанным мною в цилке
//почему i = i -1; потому что в ином случае он не уберет все нули в массиве, тк индекс смещается, размерность тоже
public class Main {
    public static int[] removeElement( int [] arr, int index ) {
        int[] arrDestination = new int[arr.length - 1];
        int remainingElements = arr.length - (index + 1);
        System.arraycopy(arr, 0, arrDestination, 0, index);
        System.arraycopy(arr, index + 1, arrDestination, index, remainingElements);
        return arrDestination;
    }
    //Дан массив из 20 целых чисел. Упорядочить массив по возрастатнию, удалив нули.
    static void Sort(int[] zxc) {

        int[] xx= new int [20];
        System.out.print("\nSorted: \n");
//Сортируем массив
        Arrays.sort(zxc);
//Выводим отсортированный массив
        for (int i = 0; i < zxc.length; i++) {
            if (zxc[i] == 0) {
                zxc = removeElement(zxc, i);
                i = i - 1;
            }
        }
        System.out.println(Arrays.toString(zxc));

        }

        public static void main (String[]args){
        Scanner in = new Scanner(System.in);
            int[] qq = new int [20];
        for (int i = 0; i < qq.length; i++){
            System.out.println("введите элемент массива " + i);
            qq[i]= in.nextInt();
        }
            Sort(qq);
        }

    }

