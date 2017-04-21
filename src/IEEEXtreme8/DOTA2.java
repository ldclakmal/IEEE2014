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
public class DOTA2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hero[] = input.nextLine().split(" ");

        int count = Integer.parseInt(hero[0]);
        int selected = Integer.parseInt(hero[1]);

        if (count >= 1 && count <= 50000) {
            if (selected >= 1 && selected <= count) {

                String data[][] = new String[count][3];
                for (int i = 0; i < count; i++) {
                    data[i] = input.nextLine().split(",");
                }

                String ratio[][] = new String[count][2];
                int perc[] = new int[count];
                for (int i = 0; i < count; i++) {
                    ratio[i] = data[i][2].split(":");
                    int win = Integer.parseInt(ratio[i][0]);
                    int loss = Integer.parseInt(ratio[i][1]);
                    int rate = (win * 100 * (i + 1)) / (win + loss);
                    perc[i] = rate;
                }

                int max_index = 0;
                int max = 0;
                Vector v = new Vector();
                Vector v_index = new Vector();
                float Intelligence = 0;
                float Strength = 0;
                float Agility = 0;

                for (int i = 0; i < selected; i++) {
                    for (int j = 0; j < perc.length; j++) {
                        if (max < perc[j]) {
                            max = perc[j];
                            max_index = j;
                        }
                    }
                    max = 0;
                    perc[max_index] = 0;
                    v_index.add(max_index);
                    v.add(data[max_index][0]);
                }

                for (int i = 0; i < v_index.size(); i++) {

                    if ((data[Integer.parseInt(String.valueOf(v_index.get(i)))][1]).equals("Intelligence")) {
                        Intelligence++;
                    }
                    if ((data[Integer.parseInt(String.valueOf(v_index.get(i)))][1]).equals("Strength")) {
                        Strength++;
                    }
                    if ((data[Integer.parseInt(String.valueOf(v_index.get(i)))][1]).equals("Agility")) {
                        Agility++;
                    }
                }

                float tot = Intelligence + Strength + Agility;
                float d_i = (Intelligence * 100) / tot;
                float d_s = (Strength * 100) / tot;
                float d_a = (Agility * 100) / tot;

                for (int i = 0; i < v.size(); i++) {
                    System.out.println(v.get(i));
                }
                System.out.println("");
                System.out.println("This set of heroes:");
                System.out.println("Contains " + String.format("%.2f", d_i) + " percentage of Intelligence");
                System.out.println("Contains " + String.format("%.2f", d_s) + " percentage of Strength");
                System.out.println("Contains " + String.format("%.2f", d_a) + " percentage of Agility");

            }
        }

    }
}
