package lib;

public class Network {
    private final Neuron[][] net;

    public Network(Neuron[] neurons, int[][] map){

        // Finding maximal Y bounds for the map

        int Max = 0;
        for (int i = 0; i < map.length; i++){
            if (Max < map[i].length) Max = i;
        }

        System.out.println(Max);

        // Setting the Neuron[][] net to these bounds

        this.net = new Neuron[map.length][map[Max-1].length];

        // Mapping the neurons to the map

        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                this.net[i][j] = neurons[map[i][j]];
            }
        }
    }

    public float run(){
        net[net.length-1][0].function(0);


        return 0;
    }


    public void displayStructure(){
        for (int i = 0; i < net.length; i++){
            for (int j = 0; j < net[i].length; j++){
                System.out.print(net[i][j]+ " ");
            }
            System.out.println();
        }
    }




}
