public class Main {

    public static void main(String[] args) {

        Boomer boomer = new Boomer();
        Walker walker = new Walker();
        Witch witch = new Witch();
        NonInfectedHuman human = new NonInfectedHuman();

        Zombie[] Bipedal = {boomer, walker, witch, human};

        for(Zombie x : Bipedal) {
            x.directive();
        }

    }
}
