/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEXtreme8;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Chanaka
 */
public class Play_with_GCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        if (N >= 1 && N <= 100000) {
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }

            int Q = input.nextInt();
            if (Q >= 1 && Q <= 10000) {
                int x[] = new int[Q];
                for (int i = 0; i < Q; i++) {
                    x[i] = input.nextInt();
                    if (x[i] < 1 && x[i] > Q) {
                        break;
                    }
                }

                Vector v = new Vector();
                for (int i = 0; i < x.length; i++) {
                    v.add(x[i]);
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] != x[i]) {
                            if (arr[j] % x[i] == 0) {
                                v.add(arr[j]);
                            }
                        }
                    }
                    for (int j = 0; j < v.size(); j++) {
                        
                    }
                }

                
            }
        }
    }
}
