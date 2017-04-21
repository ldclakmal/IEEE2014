/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IEEEXtreme8;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author Chanaka
 */
public class RoadTrip {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test_case = input.nextInt();
        int no_gas = input.nextInt();
        int tank_cap = input.nextInt();
        int start_fuel = input.nextInt();
        int length = input.nextInt();

//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < no_gas; i++) {
//            map.put(input.nextInt(), input.nextInt());
//        }
//        int min_price = Collections.min(map.values());

        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < no_gas; i++) {
            map.put(input.nextInt(), input.nextInt());
        }

        int min_price = Collections.min(map.values());

        Vector v = new Vector();
        for (int i = 0; i < map.size(); i++) {
            
        }

//        int arr_len[] = new int[no_gas];
//        int arr_price[] = new int[no_gas];
//
//        for (int i = 0; i < no_gas; i++) {
//            arr_len[i] = input.nextInt();
//            arr_price[i] = input.nextInt();
//        }

    }
}
