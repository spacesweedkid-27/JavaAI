package de.javaAI;

public class Neuron {
    private float bias;
    private float[] weights;
    private float threshold;

    public float function(float input){return input+bias;}

    public void setWeights(float[] neWeights){weights = neWeights;}
    public float[] getWeights(){return weights;}

    public void setBias(float newBias){bias = newBias;}
    public float getBias(){return bias;}

    public void setThreshold(float newThreshold){threshold = newThreshold;}
    public float getThreshold(){return threshold;}
}
