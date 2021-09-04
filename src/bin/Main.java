package bin;

import lib.Neuron;

public class Main {
    public static void main(String[]args){

        Neuron[] neuron = {
                new Neuron() {

                    @Override
                    public float function(float input) {
                        return input*input;
                    }

                    @Override
                    public float[] weights() {
                        return new float[] {3,0};
                    }

                },

                new Neuron() {

                    @Override
                    public float function(float input) {
                        return input*input;
                    }

                    @Override
                    public float[] weights() {
                        return new float[0];
                    }

                }


        };


        neuron[0].weights()[1] = (float) 0.3;

        System.out.println(neuron[0].weights()[1]);
    }
}
