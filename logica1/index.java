package logica1;

import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        double xp; 
        String nickPerson; String nivelPerson;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do seu personagem: ");
        nickPerson = scan.nextLine();
    
        System.out.println("Digite a quantidade de xp do seu personagem: ");
        xp = scan.nextDouble();

        if (xp < 1000) {
            nivelPerson = "Ferro";
        } else if (xp >= 1001 && xp <= 2000) {
            nivelPerson = "Bronze";
        } else if (xp >= 2001 && xp <= 5000) {
            nivelPerson = "Prata";
        } else if (xp >= 5001 && xp <= 7000) {
            nivelPerson = "Ouro";
        } else if (xp >= 7001 && xp <= 8000) {
            nivelPerson = "Platina";
        } else if (xp >= 8001 && xp <= 9000) {
            nivelPerson = "Ascendente";
        } else if (xp >= 9001 && xp <= 10000) {
            nivelPerson = "Imortal";
        } else {
            nivelPerson = "Radiante";
        }

        System.out.println("O Herói de nome "+nickPerson+", está no nível "+nivelPerson);

    }
}