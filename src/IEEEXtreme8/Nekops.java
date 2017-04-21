/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEXtreme8;

import java.util.Scanner;

/**
 *
 * @author Chanaka
 */
public class Nekops {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String N = input.nextLine();
        String arr[] = N.split(" ");
        int K = Integer.parseInt(arr[0]);
        String seq[] = new String[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            seq[i] = arr[i + 1];
        }

        String res[] = new String[K + 1];
        res[0] = N.substring(2);

        for (int t = 0; t < K; t++) {

            int count = 1;
            String s = "";

            for (int i = 0; i < seq.length - 1; i++) {
                if (Integer.parseInt(seq[i]) == Integer.parseInt(seq[i + 1])) {
                    count++;
                    if (i == seq.length - 2) {
                        s += count + " " + seq[i];
                    }
                } else {
                    s += count + " " + seq[i] + " ";
                    count = 1;
                    if (i == seq.length - 2) {
                        s += count + " " + seq[i + 1];
                    }
                }
            }
            seq = s.split(" ");
            res[t + 1] = s;
        }

        int len = 0;
        int start_len = res[0].split(" ").length;
        int end_len = res[K].split(" ").length;

        if (start_len > end_len) {
            len = start_len;
        } else {
            len = end_len;
        }

        for (int i = 0; i < K + 1; i++) {
            int curr_len = res[i].split(" ").length;
            if (curr_len != len) {
                String s = "";
                for (int j = 0; j < len - curr_len; j++) {
                    s += ".";
                }
                s += res[i];
                String temp[] = res[i].split((" "));
                int temp_count = 0;
                for (int j = 0; j < temp.length; j++) {
                    if (temp[j].toString().length() == 2) {
                        temp_count++;
                    }
                }
                for (int j = 0; j < len - curr_len - temp_count; j++) {
                    s += ".";
                }
                System.out.println(s);
            } else {
                System.out.println(res[i]);
            }
        }
        System.out.println(end_len);
    }
}
