/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEXtremeSampleContest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Chanaka
 */
public class NewClass {

    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("E:\\JAVA\\--- Chanaka ---\\--- Projects ---\\IEEE2014\\src\\IEEEXtremeSampleContest\\STDIN.txt");
            out = new FileWriter("E:\\JAVA\\--- Chanaka ---\\--- Projects ---\\IEEE2014\\src\\IEEEXtremeSampleContest\\STDOUT.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }




        //        for (int i = 0; i < 250; i++) {
//            count = 0;
//            for (int j = 0; j < seq.length; j++) {
//                if (Integer.parseInt(seq[j]) == i) {
//                    count++;
//                }
//            }
//            if (count != 0) {
//                s += (count + " " + i + " ");
//            }
//        }
//        System.out.println(s);
    }
}
