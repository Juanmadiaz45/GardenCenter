package model;

import java.util.ArrayList;

public class GardenCenter{

    private String name; 
    private String direcction;

    private Plant[][] plants;
    private ArrayList<Plant> plantsList; 


    /**
     * @param name
     * @param direcction
     */
    public GardenCenter(String name, String direcction) {
        this.name = name;
        this.direcction = direcction;
        plantsList = new ArrayList<Plant>();

    }

    public boolean addPlant(Plant plant){
        return plantsList.add(plant);
    }

    public String printOrnamentalPlants(){
        String msj = "";
        for(int i = 0; i < plantsList.size(); i++){
            if(!plantsList.isEmpty()){
                if(plantsList.get(i) instanceof Ornamental){
                    if(((Ornamental).get(i).getHeight()) >= 100){

                        msj += plantsList.get(i).toString() + "\n";
                        
                    }
                }
            }
        }
        return msj;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the direcction
     */
    public String getDirecction() {
        return direcction;
    }

    /**
     * @param direcction the direcction to set
     */
    public void setDirecction(String direcction) {
        this.direcction = direcction;
    }

    /**
     * @return the plants
     */
    public Plant[][] getPlants() {
        return plants;
    }

    /**
     * @param plants the plants to set
     */
    public void setPlants(Plant[][] plants) {
        this.plants = plants;
    } 

    

}