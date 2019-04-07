package Model;

public class Tool {
    public static int weight;
    public static void setWeight(int _weight) throws setWeightException{
        if (_weight > 0)
        {
            weight=_weight;
        }else throw new setWeightException(null);
    }
}

