/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author deepl
 */
public class GamingConsoleReport {

    public static void main(String[] args) {

            // Single-dimensional array for cities
            String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

            // Two-dimensional array for console sales
            int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200} // Pretoria
            };

            String[] consoles = {"PS5", "XBOX", "SWITCH"};

            System.out.println("------------------------------------------------------------");
            System.out.println(" GAMING CONSOLE REPORT");
            System.out.println("------------------------------------------------------------");

            // Display headings
            System.out.printf("%-20s %-10s %-10s %-10s%n",
            "", consoles[0], consoles[1], consoles[2]);

                    // Display sales data
            for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d%n",
            cities[i],
            sales[i][0],
            sales[i][1],
            sales[i][2]);
            }

            System.out.println("\n------------------------------------------------------------");
            System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
            System.out.println("------------------------------------------------------------");

            int highestTotal = 0;
            String highestCity = "";

            // Calculate totals and determine highest-selling city
            for (int i = 0; i < cities.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
            total += sales[i][j];
            }

            System.out.printf("%-20s %d%n", cities[i], total);

                if (total > highestTotal) {
                highestTotal = total;
                highestCity = cities[i];
                }
                }

                System.out.println("\nCITY WITH THE MOST SALES: " + highestCity);
                System.out.println("------------------------------------------------------------");
                }
}