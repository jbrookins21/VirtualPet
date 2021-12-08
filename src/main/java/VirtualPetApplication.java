import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet myVirtualPet = new VirtualPet("Theo");

        System.out.println("Welcome to DinoCare");
        System.out.println("Enter the pet's name to wake them up: ");
        //His name is Theo btw
        String virtualPetName = input.nextLine();

        //game loop start
        while (myVirtualPet.getWakeStatus(virtualPetName) == false) {
            System.out.println("That is not Theo's name!");
            virtualPetName = input.nextLine();
        }

        System.out.println("Please select from the menu below");
        System.out.println("Press 1 to check hunger, thirst, and boredom");
        System.out.println("Press 2 to hydrate");
        System.out.println("Press 3 to feed");
        System.out.println("Press 4 to play");
        System.out.println("Press 5 to exit");

        String userSelection = input.nextLine();

        while (!userSelection.equals("5")) {
            switch (userSelection) {
                case "1":
                    System.out.println("Checking hunger, thrist, and boredom");
                    System.out.println(virtualPetName + "'s status is: " +
                            "\n hunger: " + myVirtualPet.getHunger() +
                            "\n thirst: " + myVirtualPet.getThirst() +
                            "\n boredom: " + myVirtualPet.getBoredom());
                    myVirtualPet.tick();

                    break;

                case "2":
                    System.out.println("Let's get " + virtualPetName + " some water.");
                    System.out.println("How much do you want to give him?");
                    int water = input.nextInt();
                    myVirtualPet.hydrate(water);
                    System.out.println(virtualPetName + " is happy and hydrated! Thirst is now at " + myVirtualPet.getThirst());
                    myVirtualPet.tick();
                    input.nextLine();
                    break;

                case "3":
                    System.out.println("You want to feed " + virtualPetName + "?");
                    System.out.println("How many snacks? ");
                    int snacks = input.nextInt();
                    myVirtualPet.feed(snacks);
                    System.out.println(virtualPetName + "'s belly is happy! Hunger is now at " + myVirtualPet.getHunger());
                    myVirtualPet.tick();
                    input.nextLine();
                    break;

                case "4":
                    System.out.println("You want to play with " + virtualPetName + "?");
                    System.out.println("How many toys are you using? ");
                    int numberOfToys = input.nextInt();
                    myVirtualPet.play(numberOfToys);
                    System.out.println(virtualPetName + " is happy! Boredom is now at " + myVirtualPet.getBoredom());
                    myVirtualPet.tick();
                    input.nextLine();
                    break;

                default:
                    System.out.println("You cannot perform that action at this time");
                    input.nextLine();
                    break;
            }
            System.out.println("Please select from the menu below");
            System.out.println("Press 1 to check hunger, thirst, and boredom");
            System.out.println("Press 2 to hydrate");
            System.out.println("Press 3 to feed");
            System.out.println("Press 4 to play");
            System.out.println("Press 5 to exit");
            userSelection = input.nextLine();
        }
        System.out.println(virtualPetName + " say's thank you for playing. See you soon! Bye!");

    }
}

