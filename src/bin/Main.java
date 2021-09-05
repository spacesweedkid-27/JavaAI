package bin;

import lib.Network;
import lib.Neuron;

public class Main {
    public static void main(String[]args){


        Neuron neurons[] = {

                new Neuron() {
                    @Override
                    public float function(float input) {
                        return (float) Math.pow(input + getBias(), 2);
                    }
                },
                new Neuron() {
                    @Override
                    public float function(float input) {
                        return (float) Math.pow(input + getBias(), 2);
                    }
                }

        };

        neurons[0].setBias(1);
        neurons[1].setBias(2);
        System.out.println(neurons[0].function(1));
        System.out.println(neurons[1].function(1));


    }
}
