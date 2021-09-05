package de.javaAI;

public class Network {
    private final Neuron[][] net;

    public Network(Neuron[] neurons, int[][] map){

        // Finding maximal Y bounds for the map

        int Max = 0;
        for (int i = 0; i < map.length; i++){
            if (Max < map[i].length) Max = i;
        }

        // Setting the Neuron[][] net to these bounds

        this.net = new Neuron[map.length][map[Max].length];

        // Mapping the neurons to the map

        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                this.net[i][j] = neurons[map[i][j]];
            }
        }
    }

    public void run(float in){

    }


    public void displayStructure(){
        for (int i = 0; i < net.length; i++){
            for (int j = 0; j < net[i].length; j++){
                if (net[i][j]!=null)
                System.out.print("N"+i+" "+j+ "\t");
            }
            System.out.println();
        }
    }




}
