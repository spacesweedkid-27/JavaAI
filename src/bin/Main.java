package bin;

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
                    public float bias() {
                        return 1;
                    }

                    @Override
                    public float threshold() {
                        return 4;
                    }
                }

        };

        for (int i = 0; i < 10; i+=1){
        }

        System.out.println(neuron[0].weights()[0]);


    }
}
