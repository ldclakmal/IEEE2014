/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEXtreme8;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Chanaka
 */
public class KValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in[] = input.nextLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        int K = Integer.parseInt(in[2]);

        if (N > 1 && N <= 100000) {
            if (M >= 1 && M < N) {
                if (K >= 1 && K <= M) {

                    String data[] = input.nextLine().split(" ");

                    Vector<Integer> v1 = new Vector<Integer>();
                    Vector<Integer> v2 = new Vector<Integer>();
                    for (int i = 0; i < N; i++) {
                        for (int j = 0; j < M; j++) {
                            int temp = j + i;
                            if (temp >= N) {
                                temp -= N;
                            }
                            v1.add(Integer.parseInt(data[temp]));
                        }
                        Collections.sort(v1);
                        v2.add(v1.get(K - 1));
                        v1.clear();
                    }
                    Collections.sort(v2);
                    System.out.println(v2.get(0));
                }
            }
        }
    }
}
