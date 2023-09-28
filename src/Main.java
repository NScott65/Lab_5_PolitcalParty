import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        String choice;

        String menu = "R - Republican\tD - Democrat\tI - Independant\tO - Other.\nChoose your Party: ";
        System.out.print(menu);
        choice = scan.nextLine();
        choice = choice.toUpperCase();



        if(choice.equals("R")){
            System.out.print("You get a Republican Elaphant.");
        }else if(choice.equals("D")){
            System.out.print("You get a Democrat Donkey.");
        }else if(choice.equals("I")){
            System.out.print("You get an Independant Person.");
        }else if(choice.equals("O")){
            System.out.print("You get an Other.");
            }
        }
    }
