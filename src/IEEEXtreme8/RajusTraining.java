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
public class RajusTraining {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x[] = input.nextLine().split(" ");
        int sub = Integer.parseInt(x[0]);
        int con = Integer.parseInt(x[1]);
        String arr[][] = new String[con][2];
        for (int i = 0; i < con; i++) {
            arr[i] = input.nextLine().split(" ");
        }
        String seq[] = input.nextLine().split(" ");

        boolean bool = true;

        if (sub >= 1 && sub <= 1000) {
            if (con >= 0 && con <= 100000) {
                outerloop:
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < seq.length; j++) {
                        int id1 = Integer.parseInt(arr[i][0]);
                        if (id1 >= 1 && id1 <= sub) {
                            int temp = Integer.parseInt(seq[j]);
                            if (id1 == temp) {
                                int id2 = Integer.parseInt(arr[i][1]);
                                if (id2 >= 1 && id2 <= sub) {
                                    for (int k = j+1; k < seq.length; k++) {
                                        temp = Integer.parseInt(seq[k]);
                                        if (id2 == temp) {
                                            break;
                                        }
                                        if (k == seq.length - 1) {
                                            bool = false;
                                            break outerloop;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }


        if (bool) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
