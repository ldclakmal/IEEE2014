/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEXtremeSampleContest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Chanaka
 */
public class Problem_AJ {

    public static void main(String[] args) throws Exception {

        BufferedReader br = null;
        FileWriter fw = null;
        try {
            br = new BufferedReader(new FileReader("E:\\JAVA\\--- Chanaka ---\\--- Projects ---\\IEEE2014\\src\\IEEEXtremeSampleContest\\STDIN.txt"));
            fw = new FileWriter("E:\\JAVA\\--- Chanaka ---\\--- Projects ---\\IEEE2014\\src\\IEEEXtremeSampleContest\\STDOUT.txt");

            String line = null;
            String data = null;
            int tot = 0;

            while ((line = br.readLine()) != null) {
                data = line;
            }

            String arr[] = data.split(" ");
            for (int i = 0; i < arr.length; i++) {
                tot += Integer.parseInt(arr[i]);
            }
            fw.write(String.valueOf(tot));
        } finally {
            if (br != null) {
                br.close();
            }
            if (fw != null) {
                fw.close();
            }
        }
    }
}
