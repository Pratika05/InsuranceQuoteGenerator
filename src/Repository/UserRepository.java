package Repository;

import Model.Agent;
import Model.Insured;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users=new ArrayList<User>();;

    public List<User> getUsers() {
        return users;
    }

    private void setUsers() {
        Agent agent1 = new Agent();
        agent1.setFirstName("Rahul");

        Agent agent2 = new Agent();
        agent2.setFirstName("Suresh");

        Insured insured1 = new Insured();
        insured1.setFirstName("Sai");

        Insured insured2 = new Insured();
        insured2.setFirstName("Pooja");

        //users.add(agent1);
        users.add(agent2);
        users.add(insured1);
        users.add(insured2);
    }

    public UserRepository(){
    setUsers();

 }

}
