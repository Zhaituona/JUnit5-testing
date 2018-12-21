public class PetRock {

    private String name ;
    private boolean happy = false;

    public PetRock(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public boolean isHappy() {

        return happy;
    }

    public void playWithRock() {
        happy = true;
    }

    public void playComputer() {
        happy = true;
    }

    public int add(int a , int b){
       return a+b;
    }
    public void printHappyMessage(){
        if(!happy){
            throw new IllegalStateException();
        }
        System.out.println("I am happy");
    }
    public String getMessage(){
        return "I am happy";
    }
    public int getFavNumber(){
        return 42;
    }
    public void waitTillHappy(){
        while(!happy){
            // do nothing!
        }
    }
}
