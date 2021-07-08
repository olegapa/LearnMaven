public class RandomNum {
    private final int n;
    public RandomNum(){
        n = (int) (Math.random()*200);
    }

    public int getN(){
        return n;
    }
}
