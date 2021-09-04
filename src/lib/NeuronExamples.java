package lib;

public class NeuronExamples {
    Neuron BasicNeuron = new Neuron() {

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
    };

}
