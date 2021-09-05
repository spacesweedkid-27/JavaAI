package bin;

import de.javaAI.Network;
import de.javaAI.Neuron;

public class Main {
    public static void main(String[]args){


        Neuron[] neurons = {

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

        Network network = new Network(neurons,new int[][]{{0,1},{1,1,1},{0},{1,1,1},{0}});

        network.displayStructure();

        network.run(2);
    }
}
