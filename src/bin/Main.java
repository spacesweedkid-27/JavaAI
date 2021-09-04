package bin;

import lib.Network;
import lib.Neuron;

public class Main {
    public static void main(String[]args){

        Neuron[] neuron = {
                new Neuron() {

                    @Override
                    public float function(float input) {
                        if (input >= threshold())
                        return (float) Math.pow(input+bias(),2);
                        else return 0;
                    }

                    @Override
                    public float[] weights() {
                        return new float[3];
                    }

                    @Override
                    public float bias() {
                        return 1;
                    }

                    @Override
                    public float threshold() {
                        return 4;
                    }


                },

                new Neuron() {

                    @Override
                    public float function(float input) {
                        if (input >= threshold())
                            return (float) Math.pow(input+bias(),2);
                        else return 0;
                    }

                    @Override
                    public float[] weights() {
                        return new float[3];
                    }

                    @Override
                    public float bias() {
                        return 1;
                    }

                    @Override
                    public float threshold() {
                        return 4;
                    }


                },

                new Neuron() {

                    @Override
                    public float function(float input) {
                        if (input >= threshold())
                            return (float) Math.pow(input+bias(),2);
                        else return 0;
                    }

                    @Override
                    public float[] weights() {
                        return new float[3];
                    }

                    @Override
                    public float bias() {
                        return 1;
                    }

                    @Override
                    public float threshold() {
                        return 4;
                    }


                }

        };


        Network network = new Network(neuron,new int[][]{{0,1,2},{2}});

        network.displayStructure();


    }
}
