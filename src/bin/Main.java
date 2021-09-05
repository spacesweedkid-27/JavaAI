package bin;

import lib.Network;
import lib.Neuron;

public class Main {
    public static void main(String[]args){


        Neuron neuron1 = new Neuron() {
            @Override
            public float function(float input) {
                return (float)Math.pow(input+getBias(),2);
            }
        };

        neuron1.setBias(1);
        System.out.println(neuron1.function(1));


    }
}
