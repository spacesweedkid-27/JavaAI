package bin;

import de.javaAI.Network;
import de.javaAI.Neuron;

public class Main {
    public static void main(String[]args){


        Neuron[] neurons = {

                new Neuron() {
                    @Override
                    public float function(float input) {
                        return (float) Math.pow(input + getBias(), 1.2);
                    }
                },
                new Neuron() {
                    @Override
                    public float function(float input) {
                        return (float) Math.pow(input + getBias(), 1.1);
                    }
                },
                new Neuron() {
                    @Override
                    public float function(float input) {
                        return (float) Math.pow(input + getBias(), 1.1);
                    }
                },
                new Neuron() {
                    @Override
                    public float function(float input) {
                        return (float) Math.pow(input + getBias(), 1.1);
                    }
                }

        };

        neurons[3].setWeights(new float[]{1,1});
        neurons[2].setWeights(new float[]{1});
        neurons[1].setWeights(new float[]{1});



        Network network = new Network(neurons,new int[][]{{0},{1,2},{3}}){
            @Override
            public void run(float in){
                System.out.println(neurons[3].function(neurons[3].getWeights()[0]*neurons[1].function(neurons[1].getWeights()[0]*neurons[0].function(in))+neurons[3].getWeights()[1]*neurons[2].function(neurons[2].getWeights()[0]*neurons[0].function(in))));
            }
        };

        network.displayStructure();

        network.run(2);
    }
}
