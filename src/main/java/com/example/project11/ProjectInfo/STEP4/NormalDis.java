package com.example.project11.ProjectInfo.STEP4;

public class NormalDis {
    //  gets the output of the normal distribution of the grades for each particular parameter of the properties
    private double gradesArray[] ; 
    private double distribution[] = new double[11] ; 

    public NormalDis(double[] gradesArray){
        this.gradesArray = gradesArray ;

    }
    public double[] getNormalDistribution(){
        calculateNoramlDistribution() ; 
        return distribution; 
    }
    public void calculateNoramlDistribution(){
        for (int i = 0 ; i<gradesArray.length ; i++){
            for (int j = 0 ; j<distribution.length ; j++){
                if( gradesArray[i] == j){
                    distribution[j]++;
                }

            }
        }
    }
    
    
}
