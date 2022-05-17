package Model;

import java.util.ArrayList;

public class Agent extends User{

    public ArrayList<Insured> getInsured() {
        return insured;
    }

    public void setInsured(ArrayList<Insured> insured) {
        this.insured = insured;
    }

    ArrayList<Insured> insured;


}
