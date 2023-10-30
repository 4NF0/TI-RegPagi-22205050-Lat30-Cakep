/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan30;
import java.util.Scanner;
/**
 *
 * @author nm
 */
public class Latihan30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String penutup = "\u001b[0m";
        String foregroundMerah = "\u001b[31m";
        String foregroundHijau = "\u001b[32m";
        String foregroundKuning = "\u001b[33m";
        String foregroundBiru = "\u001b[34m";
        String foregroundUngu = "\u001b[35m";
        String foregroundCyan = "\u001b[36m";

        Scanner scanner = new Scanner(System.in);
        System.out.print(foregroundMerah + "Kamu " + penutup +
                foregroundHijau + "ngerjain sendiri " + penutup +
                foregroundKuning + "latihan 17 sampe " + penutup +
                foregroundBiru + "latihan 30 ini?\n" + penutup);
        System.out.print(foregroundBiru + "Jawab " + penutup +
                foregroundMerah + "(Yoi/Enggak) " + penutup + ": ");
        String jawab = scanner.next();

        if (jawab.equalsIgnoreCase("Yoi") || jawab.equalsIgnoreCase("iya")) {
            System.out.print(foregroundMerah + "Bjirr bowlehh limaaa puluhhh." + penutup);
            System.out.println(foregroundUngu + " Good Job" + penutup);
        } else {
            System.out.println(foregroundMerah + "Tetep cakep sih." + penutup);
            System.out.println(foregroundCyan + "Gapapa penting selesai aja udahh." + penutup);
            System.out.println("Keep the code works dude");
        }
    }
    
}
