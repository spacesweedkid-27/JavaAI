package lib;

public abstract class Neuron {
    public abstract float function(float input);
    public abstract float[] weights();
    public float bias(){return 0;}
    public float threshold(){return 0;}


}
