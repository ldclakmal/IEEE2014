package IEEEXtremeSampleContest;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chanaka
 */
public class IEEE_HKN_Problem {

    public static void main(String[] args) {
        try {
            String file = "E:\\JAVA\\--- Chanaka ---\\--- Projects ---\\IEEE2014\\src\\IEEEXtremeSampleContest\\STDIN.txt";
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input = reader.readLine();
            String num[] = input.split(",");
            int n1 = Integer.parseInt(num[0]);
            int n2 = Integer.parseInt(num[1]);
            if (n1 >= 0 && n2 <= (2 ^ (32 - 1))) {
                System.out.println((2 ^ (32 - 1)));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
