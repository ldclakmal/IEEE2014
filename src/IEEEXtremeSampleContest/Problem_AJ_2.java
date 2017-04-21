/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEXtremeSampleContest;

import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class Problem_AJ_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int data[] = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = input.nextInt();
        }

        int max[] = new int[N + 1];

        max[N] = 0;


        for (int i = N - 1; i >= 0; i--) {
            max[i] = data[i] + max[i + 1];
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {
            if (ans < max[i]) {
                ans = max[i];
            }
        }

        if (ans < 0) {
            ans = 0;
        }

        System.out.println(ans);
    }
}
