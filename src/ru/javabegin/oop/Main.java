//Написать программу, удаляющую из целочисленного массива A размерности N элементы, равные
//целому числу X. В результате должен получиться массив не большей размерности. На экран должны
//выводиться как оригинальное состояние массива, так и итоговое.
package ru.javabegin.oop;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int n = in.nextInt();
        System.out.println("Введите элементы массива");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // посчитаем размерность нового массива j
       int j = 0;
        System.out.println("Введите x");
        int x = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {
                j = j+1; // длина нового массива
            }
            }
        System.out.println("это j'");
        System.out.println(j);
        int k = 0;
        int[] arrnew = new int[j];
        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {
                arrnew[k] = arr[i];
                k = k+1;
            }
        }
        System.out.println(Arrays.toString(arrnew));
        System.out.println(Arrays.toString(arr));
        }
    }