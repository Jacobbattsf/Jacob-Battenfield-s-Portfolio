package ArrayFun;

public class arrayFun {
    public static void main(String[] args) {
        
    String[][] pokemon = {
        {"Charizard","Pikachu","Horsee"},
        {"Piplup","Darmanatan","Bronzong"},
        {"MewTwo","Dragonite","Kingdra"}
    };
    for(int i =0;i<pokemon.length;i++){
        System.out.println();
        for(int j=0;j<pokemon[i].length;j++){
            System.out.print(pokemon[i][j]+" ");
        }
    }

    
       /*  String[] pokemon = {"Charizard","Piplip","Honedge","Aigieslash","Gengar"};
       
    for(int i = 0;i<pokemon.length;i++){
        System.out.println(pokemon[i]);*/
    }
    }

