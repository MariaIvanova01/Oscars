package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameActor = scan.nextLine();
        double pointsFromAcademy = scan.nextDouble();
        int numJudges = scan.nextInt();
        String nameJudge = "";
        double pointsJudge = 0.0;
        int lenghtName = 0;
        double points = 0.0;
        double neededPoints = 0.0;
        double fullPointsByJudges = 0.0;
        double nominationPoints = 0.0;
        for (int i = 0; i < numJudges; i++){
            scan.nextLine();
            nameJudge = scan.nextLine();
            pointsJudge = scan.nextDouble();

            lenghtName = nameJudge.length();
            points =(lenghtName * pointsJudge) / 2;
            fullPointsByJudges +=points;

            if (fullPointsByJudges + pointsFromAcademy >= 1250.5){
                nominationPoints = fullPointsByJudges + pointsFromAcademy;
                break;
            }
        }
        neededPoints = 1250.5 - (fullPointsByJudges + pointsFromAcademy);

            if (fullPointsByJudges + pointsFromAcademy < 1250.5) {
                System.out.printf("Sorry, %s you need %.1f more!", nameActor, neededPoints);
            }else{
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, nominationPoints);
            }
    }
}
