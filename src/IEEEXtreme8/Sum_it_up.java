/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEXtreme8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class Sum_it_up {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        if (N >= 1 && N <= 100000) {
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }

            int Q = input.nextInt();
            if (Q >= 0 && Q <= 1000000) {
                int x[] = new int[Q];
                for (int i = 0; i < Q; i++) {
                    x[i] = input.nextInt();
                    if (x[i] < 0 && x[i] > N) {
                        break;
                    }
                }

                int new_arr[] = new int[N];

                for (int i = 0; i < Q; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        int temp = j - x[i];
                        if (temp < 0) {
                            temp += arr.length;
                        }
                        new_arr[j] = arr[j] + arr[temp];
                    }
                    arr = new_arr;
                }

                int tot = 0;
                for (int i = 0; i < arr.length; i++) {
                    tot += arr[i];
                }

                double dev = Math.pow(10, 9) + 7;

                DecimalFormat df = new DecimalFormat("#");
                System.out.println(df.format(tot % dev));
            }
        }
    }
}
