public class VirtualPet {

    private int hunger = 10;
    private int thirst = 10;
    private int boredom = 10;

    //constructor
    public VirtualPet(String name) {

    }

    //getters
    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom(){
        return boredom;
    }

    //behavioral methods
    public boolean getWakeStatus(String name) {
        if (hunger > 0 || thirst > 0 || boredom > 0){
            return true;
        }
        return false;
    }

    public void feed(int food) {
            hunger += food;
    }

    public void hydrate(int water) {
            thirst += water;
    }

    public void play(int toys){
            boredom += toys;
    }



    //tick method
    public void tick(){
        hunger -= 2;
        thirst -= 2;
        boredom -= 2;
    }
}
